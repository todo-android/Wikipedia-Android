package com.github.libliboom.wikipedia.api

import com.github.libliboom.oohttp.Response
import com.github.libliboom.wikipedia.data.InfoResponse
import com.github.libliboom.wikipedia.data.InfoResponseParser
import org.json.JSONObject

class SummaryInfoApi : Api() {

  fun requestSummaryInfo(searchWord: String): List<InfoResponse> {
    val requestUrl = "$summaryApi/$searchWord"
    val response = requestInfo(requestUrl)
    if (response.getCode() != 200) return emptyList()
    return convertToInfo(response)
  }

  private fun convertToInfo(response: Response): List<InfoResponse> {
    val jsonString = response.response()
    val jsonObject = JSONObject(jsonString)
    val parser = InfoResponseParser()
    val summaryInfo = mutableListOf<InfoResponse>()
    val data = parser.toInfoResponse(jsonObject)
    summaryInfo.add(data)

    return summaryInfo.toList()
  }
}
