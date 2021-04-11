package com.github.libliboom.oohttp

import com.github.libliboom.oohttp.base.connection.OoUrlConnectionMediator
import java.io.FileNotFoundException

class OoCall(
  private val connection: OoUrlConnectionMediator,
  private val request: Request
) {

  fun execute(): Response {
    return try {
      val stream = connection.getStream()
      OoHttpResponse.Builder(stream).code(200).build()
    } catch (e: FileNotFoundException) {
      ErrorFileNotFoundResponse()
    }
  }
}
