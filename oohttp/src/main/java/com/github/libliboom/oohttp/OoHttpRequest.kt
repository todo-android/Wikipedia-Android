package com.github.libliboom.oohttp

import com.sun.jndi.toolkit.url.Uri

class OoHttpRequest(builder: Builder) : Request {

  private val url = builder.url

  private val headers = Header()

  override fun getUrl() = url

  override fun getScheme() = Uri(url).scheme

  override fun addHeader(name: String, value: String) = headers.add(name, value)

  override fun getHeader() = headers

  class Header {
    internal var headers: MutableList<Pair<String, String>> = mutableListOf()

    fun add(name: String, value: String) {
      headers.add(Pair(name, value))
    }
  }

  class Builder {
    internal var url: String = ""
    internal var method: String = ""
    internal var header: Header? = null

    fun url(url: String): Builder = apply {
      this.url = url
    }

    fun get() = method(RequestMethods.GET)
    fun post() = method(RequestMethods.POST)
    fun put() = method(RequestMethods.PUT)
    fun delete() = method(RequestMethods.DELETE)

    private fun method(method: String): Builder = apply {
      this.method = method
    }

    fun header(header: Header): Builder = apply {
      this.header = header
    }

    fun build(): Request {
      return OoHttpRequest(this)
    }
  }

  object RequestMethods {
    const val GET = "GET"
    const val POST = "POST"
    const val PUT = "PUT"
    const val DELETE = "DELETE"
  }
}

interface Request {
  fun getUrl(): String
  fun getScheme(): String
  fun addHeader(name: String, value: String)
  fun getHeader(): OoHttpRequest.Header
}
