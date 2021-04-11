package com.github.libliboom.wikipedia.common.extension

import android.webkit.WebView
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature

fun WebView.applyDarkModeState() {
  setBackgroundColor(android.graphics.Color.TRANSPARENT)
  if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
    val mode = if (context.isDarkThemeOn())
      WebSettingsCompat.FORCE_DARK_ON else
      WebSettingsCompat.FORCE_DARK_OFF
    WebSettingsCompat.setForceDark(settings, mode)
  }
}
