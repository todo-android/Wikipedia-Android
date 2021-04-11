package com.github.libliboom.oohttp

import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

// TODO: TDD
class OoHttpClientTest {
  private lateinit var keyword: String
  private lateinit var summaryUrl: String

  @Before
  fun setup() {
    keyword = "google"
  }

  @Test
  fun `basic usage for summary`() {
    val summaryUrl = "https://en.wikipedia.org/api/rest_v1/page/summary/$keyword"

    val client = OoHttpClient.Builder().build()
    val request = OoHttpRequest.Builder().url(summaryUrl).get().build()
    val call = client.newCall(request)
    val response = call.execute()

    assertTrue(response.response().isNotEmpty())
  }

  @Test
  fun `basic usage for similarity`() {
    val similarUrl = "https://en.wikipedia.org/api/rest_v1/page/related/$keyword"

    val client = OoHttpClient.Builder().build()
    val request = OoHttpRequest.Builder().url(similarUrl).get().build()
    val call = client.newCall(request)
    val response = call.execute()

    assertTrue(response.response().isNotEmpty())
  }
}
