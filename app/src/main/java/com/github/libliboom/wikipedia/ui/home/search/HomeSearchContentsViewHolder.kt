package com.github.libliboom.wikipedia.ui.home.search

import android.graphics.Bitmap
import com.github.libliboom.wikipedia.common.utils.BitmapUtils
import com.github.libliboom.wikipedia.data.InfoResponse
import com.github.libliboom.wikipedia.databinding.ItemSearchContentsBinding

class HomeSearchContentsViewHolder(private val binding: ItemSearchContentsBinding) :
  HomeSearchViewHolder(binding.root) {

  var onClick: ((String) -> Unit)? = null
  var onFetchBitmap: ((String, (String, Bitmap) -> Unit) -> Unit)? = null
  var onCacheBitmap: ((String, Bitmap) -> Unit)? = null

  override fun bind(info: InfoResponse) {
    super.bind(info)
    bindView()
    setupView()
    setThumbnail()
  }

  override fun bindView() = with(binding) {
    title.text = info.displayTitle
    description.text = info.extract
  }

  override fun setupView() {
    binding.contents.setOnClickListener {
      val word = binding.title.text.toString()
      onClick?.invoke(word)
    }
  }

  private fun setThumbnail() {
    info.bitmap?.let { binding.thumbnail.setImageBitmap(it) } ?: run {
      binding.thumbnail.setImageBitmap(defaultBitmap())
      info.thumbnail?.source?.let { source ->
        onFetchBitmap?.invoke(source, ::bindBitmap)
      }
    }
  }

  private fun bindBitmap(source: String, bitmap: Bitmap) {
    info.bitmap = bitmap
    binding.thumbnail.setImageBitmap(bitmap)
    onCacheBitmap?.invoke(source, BitmapUtils.copy(bitmap))
  }
}
