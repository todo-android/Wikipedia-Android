package com.github.libliboom.oohttp.base.connection

import java.net.URL
import javax.net.ssl.HttpsURLConnection

class OoHttpsUrlConnection(url: URL) : OoUrlConnection<HttpsURLConnection>(url) {

  init {
    setup()
  }

  override fun connect() {
    conn = openConnection()
  }
}
