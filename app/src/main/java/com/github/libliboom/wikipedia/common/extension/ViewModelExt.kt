package com.github.libliboom.wikipedia.common.extension

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun ViewModel.runOnMain(block: () -> Unit) {
  viewModelScope.launch(Dispatchers.Main) {
    block()
  }
}

fun ViewModel.runOnIO(handler: CoroutineExceptionHandler, block: () -> Unit) {
  viewModelScope.launch(Dispatchers.IO + handler) {
    block()
  }
}
