package com.github.libliboom.wikipedia.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.libliboom.wikipedia.BuildConfig
import com.github.libliboom.wikipedia.R
import com.github.libliboom.wikipedia.common.extension.launchActivity
import com.github.libliboom.wikipedia.ui.home.HomeActivity

class SplashActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)
    supportActionBar?.hide()
    val intent = Intent(this@SplashActivity, HomeActivity::class.java)
    launchActivity(intent, if (BuildConfig.DEBUG) 0 else 2_000) { finish() }
  }
}
