package com.github.libliboom.wikipedia.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.github.libliboom.wikipedia.api.RelatedInfoApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class InfoResponseParserTest {

  @get:Rule
  var rule: TestRule = InstantTaskExecutorRule()

  @Mock
  lateinit var parser: InfoResponseParser

  @Mock
  lateinit var apiRelated: RelatedInfoApi

  @Before
  fun setup() {
    MockitoAnnotations.initMocks(this)
  }

  @Test
  fun `pare related info response`() {
    // TODO: for InvocationTargetException from JSONObject
  }

  @Test
  fun `pare summary info response`() {
    // TODO: for InvocationTargetException from JSONObject
  }
}
