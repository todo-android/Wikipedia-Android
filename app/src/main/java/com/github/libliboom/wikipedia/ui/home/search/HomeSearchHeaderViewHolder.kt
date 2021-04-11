package com.github.libliboom.wikipedia.ui.home.search

import android.graphics.Bitmap
import com.github.libliboom.wikipedia.data.InfoResponse
import com.github.libliboom.wikipedia.databinding.ItemSearchHeaderBinding

class HomeSearchHeaderViewHolder(private val binding: ItemSearchHeaderBinding) :
  HomeSearchViewHolder(binding.root) {

  var onClick: ((String) -> Unit)? = null
  var onFetchBitmap: ((String, (Bitmap) -> Unit) -> Unit)? = null

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
    binding.header.setOnClickListener {
      val word = binding.title.text.toString()
      onClick?.invoke(word)
    }
  }

  private fun setThumbnail() {
    info.thumbnail?.source?.let { source ->
      onFetchBitmap?.invoke(source, ::bindBitmap)
    } ?: run {
      binding.thumbnail.setImageBitmap(defaultBitmap())
    }
  }

  private fun bindBitmap(bitmap: Bitmap) {
    binding.thumbnail.setImageBitmap(bitmap)
  }
}
