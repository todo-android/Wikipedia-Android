package com.github.libliboom.wikipedia.data

import android.graphics.Bitmap
import org.json.JSONObject
import timber.log.Timber

data class InfoResponse(
  val pageId: Int,
  val displayTitle: String,
  val extract: String,
  val thumbnail: Thumbnail?
) {
  var bitmap: Bitmap? = null

  data class Thumbnail(
    val height: Int,
    val source: String,
    val width: Int
  )
}

class InfoResponseParser {

  private lateinit var jsonObject: JSONObject

  private fun parsePageId(): Int {
    return jsonObject.getInt("pageid")
  }

  private fun parseDisplayTitle(): String {
    return jsonObject.getString("displaytitle")
  }

  private fun parseExtract(): String {
    return jsonObject.getString("extract")
  }

  private fun parseThumbnail(): InfoResponse.Thumbnail? {
    return try {
      val thumbnail = jsonObject.getJSONObject("thumbnail")
      InfoResponse.Thumbnail(
        thumbnail.getInt("height"),
        thumbnail.getString("source"),
        thumbnail.getInt("width")
      )
    } catch (e: Exception) {
      Timber.e("NOT EXIST THUMBNAIL")
      null
    }
  }

  fun toInfoResponse(jsonObject: JSONObject): InfoResponse {
    this.jsonObject = jsonObject
    return InfoResponse(
      parsePageId(),
      parseDisplayTitle(),
      parseExtract(),
      parseThumbnail()
    )
  }
}
