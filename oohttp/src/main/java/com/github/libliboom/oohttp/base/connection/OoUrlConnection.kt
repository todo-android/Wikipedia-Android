package com.github.libliboom.oohttp.base.connection

import com.github.libliboom.oohttp.OoHttpRequest
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URI
import java.net.URL
import java.net.URLConnection

abstract class OoUrlConnection<R : URLConnection>(url: URL) : OoUrlConnectionMediator(url) {

  private val timeoutConnection = 100_000
  private val timeoutRead = 5_000

  protected lateinit var conn: HttpURLConnection
  private var method = OoHttpRequest.RequestMethods.GET

  @Throws(IOException::class, ClassCastException::class)
  protected inline fun <reified R : URLConnection> openConnection(): R {
    return url.openConnection() as R
  }

  override fun setup() {
    connect()
    init()
  }

  private fun init() {
    conn.apply {
      requestMethod = this@OoUrlConnection.method
      setRequestProperty("User-Agent", "USER_AGENT")
      connectTimeout = this@OoUrlConnection.timeoutConnection
      readTimeout = this@OoUrlConnection.timeoutRead
    }
  }

  private fun setRequestMethod(method: String) {
    this.method = method
  }

  override fun getStream(): InputStream {
    return conn.inputStream
  }

  object Factory {
    fun getConnection(url: String): OoUrlConnectionMediator {
      return when (URI(url).scheme) {
        "https" -> OoHttpsUrlConnection(URL(url))
        else -> OoHttpUrlConnection(URL(url))
      }
    }
  }
}

abstract class OoUrlConnectionMediator(url: URL) : URLConnection(url) {
  abstract fun setup()
  abstract fun getStream(): InputStream
}
