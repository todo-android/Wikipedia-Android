package com.github.libliboom.wikipedia.ui.detail

import android.os.Bundle
import android.view.MenuItem
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.libliboom.wikipedia.R
import com.github.libliboom.wikipedia.base.AppConstant.basePageUrl
import com.github.libliboom.wikipedia.common.extension.applyDarkModeState
import com.github.libliboom.wikipedia.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

  private lateinit var binding: ActivityDetailBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
    setupView()
  }

  private fun setupView() {
    val word = intent.getStringExtra(EXTRA_WORD) ?: ""
    supportActionBar?.title = word

    binding.webView.apply {
      applyDarkModeState()
      webViewClient = WebViewClient()
      loadUrl("$basePageUrl/$word")
    }
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    when (item.itemId) {
      android.R.id.home -> {
        onBackPressed()
        return true
      }
    }
    return super.onOptionsItemSelected(item)
  }

  companion object {
    const val EXTRA_WORD = "com.github.libliboom.wikipedia.ui.detail.word"
  }
}
