package com.github.libliboom.wikipedia.common.extension

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.Looper
import com.github.libliboom.wikipedia.ui.detail.DetailActivity

fun Activity.launchActivity(intent: Intent, delayed: Long = 0, block: () -> Unit) {
  Handler(Looper.getMainLooper())
    .postDelayed(
      {
        startActivity(intent)
        block()
      },
      delayed
    )
}

fun Activity.launchDetailActivity(context: Context, word: String) {
  val intent = Intent(context, DetailActivity::class.java)
  intent.putExtra(DetailActivity.EXTRA_WORD, word)
  startActivity(intent)
}
