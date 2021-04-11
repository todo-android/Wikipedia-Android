package com.github.libliboom.wikipedia.ui.home.search

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.github.libliboom.wikipedia.common.utils.BitmapUtils
import com.github.libliboom.wikipedia.data.InfoResponse

abstract class HomeSearchViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

  protected lateinit var info: InfoResponse

  protected fun defaultBitmap() =
    BitmapUtils.loadThumbnailDefault(view.context.resources)

  open fun bind(info: InfoResponse) {
    this.info = info
  }
  abstract fun bindView()
  abstract fun setupView()
}
