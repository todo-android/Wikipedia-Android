package com.github.libliboom.oohttp

import com.github.libliboom.oohttp.base.connection.OoUrlConnection
import com.github.libliboom.oohttp.base.connection.OoUrlConnectionMediator
import java.util.concurrent.TimeUnit

class OoHttpClient(val builder: Builder) {

  fun newCall(request: Request): OoCall {
    val conn = OoUrlConnection.Factory.getConnection(request.getUrl())
    setHeader(conn, request.getHeader())
    return OoCall(conn, request)
  }

  private fun setHeader(conn: OoUrlConnectionMediator, header: OoHttpRequest.Header) {
    for (p in header.headers) {
      conn.setRequestProperty(p.first, p.second)
    }
  }

  open class Builder {
    internal var callTimeout = 0
    internal var connectTimeout = 10_000
    internal var readTimeout = 10_000
    internal var writeTimeout = 10_000

    fun connectTimeout(timeout: Long, unit: TimeUnit = TimeUnit.MILLISECONDS) = apply {
      connectTimeout = checkDuration(duration = timeout, unit = unit)
    }

    fun readTimeout(timeout: Long, unit: TimeUnit = TimeUnit.MILLISECONDS) = apply {
      readTimeout = checkDuration(duration = timeout, unit = unit)
    }

    fun writeTimeout(timeout: Long, unit: TimeUnit = TimeUnit.MILLISECONDS) = apply {
      writeTimeout = checkDuration(duration = timeout, unit = unit)
    }

    private fun checkDuration(name: String = "timeout", duration: Long, unit: TimeUnit): Int {
      check(duration >= 0L) { "$name < 0" }
      val millis = unit.toMillis(duration)
      return millis.toInt()
    }

    fun build(): OoHttpClient = OoHttpClient(this)
  }
}
