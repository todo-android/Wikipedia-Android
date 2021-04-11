package com.github.libliboom.wikipedia.ui.home.feature

import androidx.appcompat.widget.SearchView
import androidx.lifecycle.LifecycleOwner
import com.github.libliboom.wikipedia.base.AppFeature
import com.github.libliboom.wikipedia.ui.home.HomeViewModel
import com.github.libliboom.wikipedia.ui.home.search.HomeSearchAdapter

class SearchFeature(
  lifecycleOwner: LifecycleOwner,
  private val adapter: HomeSearchAdapter,
  private val viewModel: HomeViewModel,
  private val searchView: SearchView,
  private val onStartRefresh: (() -> Unit),
  private val onHideKeyboard: (() -> Unit)
) : AppFeature(lifecycleOwner) {

  fun search(word: String) {
    if (isVisibleState().not()) return
    adapter.results = emptyList()
    viewModel.fetchInfo(word)
    onHideKeyboard.invoke()
    searchView.clearFocus()
    onStartRefresh.invoke()
  }

  fun searchByContents(word: String) {
    if (isVisibleState().not()) return
    searchView.setQuery(word, false)
    searchView.clearFocus()
    adapter.results = emptyList()
    viewModel.fetchInfo(word)
  }
}
