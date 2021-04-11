package com.github.libliboom.wikipedia.ui.home.search

import android.graphics.Bitmap
import android.util.LruCache
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.libliboom.wikipedia.data.InfoResponse
import com.github.libliboom.wikipedia.databinding.ItemSearchContentsBinding
import com.github.libliboom.wikipedia.databinding.ItemSearchHeaderBinding

class HomeSearchAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

  var results: List<Search> = emptyList()
    set(value) {
      field = value
      notifyDataSetChanged()
    }

  var onClickHeader: ((String) -> Unit)? = null
  var onClickContents: ((String) -> Unit)? = null
  var onFetchBitmap4Header: ((String, (Bitmap) -> Unit) -> Unit)? = null
  var onFetchBitmap4Contents: ((String, (String, Bitmap) -> Unit) -> Unit)? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    return when (viewTypeMap[viewType] ?: error("CHECK VIEW TYPES IN COMPANION OBJECT")) {
      SearchViewType.Header ->
        HomeSearchHeaderViewHolder(
          ItemSearchHeaderBinding.inflate(inflater, parent, false)
        ).apply {
          onClick = { word -> onClickHeader?.invoke(word) }
          onFetchBitmap = { source, block -> onFetchBitmap4Header?.invoke(source, block) }
        }
      SearchViewType.Contents ->
        HomeSearchContentsViewHolder(
          ItemSearchContentsBinding.inflate(inflater, parent, false)
        ).apply {
          onClick = { word -> onClickContents?.invoke(word) }
          onFetchBitmap = { source, block ->
            memoryCache.get(source)?.let {
              block(source, it)
            } ?: run {
              onFetchBitmap4Contents?.invoke(source, block)
            }
          }
          onCacheBitmap = { source, bitmap ->
            memoryCache.get(source)?.let {
              memoryCache.put(source, bitmap)
            }
          }
        }
    }
  }

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    when (holder) {
      is HomeSearchHeaderViewHolder -> holder.bind((results[position] as SearchRelated).info)
      is HomeSearchContentsViewHolder -> holder.bind((results[position] as SearchRelated).info)
    }
  }

  override fun getItemCount() = results.size

  override fun getItemId(position: Int) = position.toLong()

  override fun getItemViewType(position: Int): Int {
    return when (results[position].getType()) {
      SearchViewType.Header -> HEADER
      else -> CONTENTS
    }
  }

  interface Search {
    fun getType(): SearchViewType
  }

  data class SearchRelated(val viewType: SearchViewType, val info: InfoResponse) : Search {
    override fun getType(): SearchViewType = viewType
  }

  sealed class SearchViewType {
    object Header : SearchViewType()
    object Contents : SearchViewType()
  }

  companion object {
    const val HEADER = 0x100
    const val CONTENTS = 0x200

    private val viewTypeMap: Map<Int, SearchViewType> = mapOf(
      HEADER to SearchViewType.Header,
      CONTENTS to SearchViewType.Contents
    )

    private val memoryCache: LruCache<String, Bitmap> by lazy {
      val mb = 1024
      val maxMemory = (Runtime.getRuntime().maxMemory() / mb).toInt()

      val cacheSize = maxMemory / 8
      object : LruCache<String, Bitmap>(cacheSize) {
        override fun sizeOf(key: String, bitmap: Bitmap): Int {
          return bitmap.byteCount / mb
        }
      }
    }
  }
}

fun HomeSearchAdapter.convertToSummaryInfo(
  responses: List<InfoResponse>
) = responses.map { info ->
  HomeSearchAdapter.SearchRelated(HomeSearchAdapter.SearchViewType.Header, info)
}.toList()

fun HomeSearchAdapter.convertToRelatedInfo(
  responses: List<InfoResponse>
) = responses.map { info ->
  HomeSearchAdapter.SearchRelated(HomeSearchAdapter.SearchViewType.Contents, info)
}.toList()
