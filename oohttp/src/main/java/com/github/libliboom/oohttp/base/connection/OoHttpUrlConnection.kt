package com.github.libliboom.oohttp.base.connection

import java.net.HttpURLConnection
import java.net.URL

class OoHttpUrlConnection(url: URL) : OoUrlConnection<HttpURLConnection>(url) {

  init {
    setup()
  }

  override fun connect() {
    conn = openConnection()
  }
}
