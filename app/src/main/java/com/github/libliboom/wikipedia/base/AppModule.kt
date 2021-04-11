package com.github.libliboom.wikipedia.base

import com.github.libliboom.wikipedia.api.RelatedInfoApi
import com.github.libliboom.wikipedia.api.SummaryInfoApi

object AppModule {
  val apiRelated by lazy { RelatedInfoApi() }
  val apiSummary by lazy { SummaryInfoApi() }
}
