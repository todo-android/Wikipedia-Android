package com.github.libliboom.wikipedia.ui.home.feature

import android.animation.ObjectAnimator
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.ProgressBar
import androidx.lifecycle.LifecycleOwner
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.github.libliboom.wikipedia.base.AppFeature

class RefreshFeature(
  lifecycleOwner: LifecycleOwner,
  private val refreshLayout: SwipeRefreshLayout,
  private val progressBar: ProgressBar
) : AppFeature(lifecycleOwner) {

  fun start() {
    if (isVisibleState().not()) return
    refreshLayout.isRefreshing = false
    progressBar.visibility = View.VISIBLE
    ObjectAnimator.ofInt(progressBar, "progress", 0, 100).run {
      duration = 3_000
      interpolator = DecelerateInterpolator()
      start()
    }
  }

  fun end() {
    if (isVisibleState().not()) return
    progressBar.progress = 100
    Handler(Looper.getMainLooper())
      .postDelayed({ progressBar.visibility = View.GONE }, 500)
  }
}
