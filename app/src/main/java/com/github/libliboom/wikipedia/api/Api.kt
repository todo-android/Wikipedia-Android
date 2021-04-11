package com.github.libliboom.wikipedia.api

import com.github.libliboom.oohttp.OoHttpClient
import com.github.libliboom.oohttp.OoHttpRequest
import com.github.libliboom.oohttp.Response

open class Api {

  protected val summaryApi = "$baseApi/$version/page/summary"
  protected val relatedApi = "$baseApi/$version/page/related"

  protected fun requestInfo(requestUrl: String): Response {
    val client = OoHttpClient.Builder().build()
    val request = OoHttpRequest.Builder().url(requestUrl).get().build()
    val call = client.newCall(request)
    return call.execute()
  }

  companion object {
    private const val baseApi = "https://en.wikipedia.org/api"
    private const val version = "rest_v1"
  }
}
