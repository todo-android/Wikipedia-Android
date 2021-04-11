package com.github.libliboom.oohttp

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.io.Reader
import java.nio.charset.Charset

// TODO: data type
class OoHttpResponse(builder: Builder) : Response {

  private val code = builder.code
  private val body = builder.body

  override fun getCode() = code

  override fun response() = body.reader.use { it.readText() }

  class Body(builder: Builder) {
    private val charset = Charset.forName("UTF-8")
    val reader: Reader = BufferedReader(InputStreamReader(builder.stream, charset))

    open class Builder internal constructor(
      internal var stream: InputStream
    ) {
      fun stream(stream: InputStream) {
        this.stream = stream
      }

      fun build(): Body {
        return Body(this)
      }
    }
  }

  class Builder internal constructor(
    stream: InputStream
  ) {
    internal var code = 0
    internal var body = Body.Builder(stream).build()

    fun code(code: Int) = apply {
      this.code = code
    }

    fun build(): OoHttpResponse {
      return OoHttpResponse(this)
    }
  }
}

interface Response {
  fun getCode(): Int
  fun response(): String
}

class ErrorFileNotFoundResponse : Response {
  override fun getCode() = 500
  override fun response() = "ERROR"
}
