package com.github.libliboom.wikipedia.ui.home.feature

import android.view.View
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import com.github.libliboom.wikipedia.base.AppFeature
import com.google.android.material.snackbar.Snackbar

class NoticeFeature(
  lifecycleOwner: LifecycleOwner,
  private val root: View,
  private val notice: TextView
) : AppFeature(lifecycleOwner) {

  fun showNoticeNoResult(message: String) {
    if (isVisibleState().not()) return
    notice.visibility = View.VISIBLE
    notice.text = message
  }

  fun hideNotice() {
    if (isVisibleState().not()) return
    notice.visibility = View.GONE
  }

  fun showNoticeNoNetwork(message: String) {
    if (isVisibleState().not()) return
    Snackbar.make(root, message, Snackbar.LENGTH_LONG).show()
  }
}
