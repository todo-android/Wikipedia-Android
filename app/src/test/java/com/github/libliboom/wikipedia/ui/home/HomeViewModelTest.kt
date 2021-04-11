package com.github.libliboom.wikipedia.ui.home

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.github.libliboom.wikipedia.api.RelatedInfoApi
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class HomeViewModelTest {

  private lateinit var homeViewModel: HomeViewModel

  @get:Rule
  var rule: TestRule = InstantTaskExecutorRule()

  @Mock
  lateinit var apiRelated: RelatedInfoApi

  @Before
  fun setup() {
    MockitoAnnotations.initMocks(this)
    homeViewModel = HomeViewModel()
  }

  @Test
  fun `convert input to search word`() {
    // TODO: for coroutines
    runBlocking {
      homeViewModel.fetchInfo("google")
    }
  }
}
