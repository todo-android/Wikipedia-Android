package com.github.libliboom.wikipedia.api

import com.github.libliboom.oohttp.Response
import com.github.libliboom.wikipedia.data.InfoResponse
import com.github.libliboom.wikipedia.data.InfoResponseParser
import org.json.JSONObject

class RelatedInfoApi : Api() {

  fun requestRelatedInfo(word: String): List<InfoResponse> {
    val requestUrl = "$relatedApi/$word"
    val response = requestInfo(requestUrl)
    if (response.getCode() != 200) return emptyList()
    return convertToInfo(response)
  }

  private fun convertToInfo(response: Response): List<InfoResponse> {
    val jsonString = response.response()
    val jsonObject = JSONObject(jsonString)
    val pages = jsonObject.getJSONArray("pages")
    val parser = InfoResponseParser()
    val relatedInfo = mutableListOf<InfoResponse>()
    for (i in 0 until pages.length()) {
      val obj = pages.getJSONObject(i)
      val data = parser.toInfoResponse(obj)
      relatedInfo.add(data)
    }

    return relatedInfo.toList()
  }
}
