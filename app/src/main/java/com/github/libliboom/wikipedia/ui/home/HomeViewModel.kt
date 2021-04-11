package com.github.libliboom.wikipedia.ui.home

import android.graphics.Bitmap
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.libliboom.wikipedia.base.AppModule
import com.github.libliboom.wikipedia.common.extension.runOnIO
import com.github.libliboom.wikipedia.common.extension.runOnMain
import com.github.libliboom.wikipedia.common.utils.BitmapUtils
import com.github.libliboom.wikipedia.data.InfoResponse
import kotlinx.coroutines.CoroutineExceptionHandler
import timber.log.Timber
import java.net.UnknownHostException

class HomeViewModel : ViewModel() {

  private var _relatedInfo = MutableLiveData<List<InfoResponse>>()
  val relatedInfo: LiveData<List<InfoResponse>> = _relatedInfo

  private var _summaryInfo = MutableLiveData<List<InfoResponse>>()
  val summaryInfo: LiveData<List<InfoResponse>> = _summaryInfo

  private var _networkError = MutableLiveData<Boolean>(false)
  val networkError: LiveData<Boolean> = _networkError

  private var _loadedInfo = MutableLiveData<Boolean>(false)
  val loaded: LiveData<Boolean> = _loadedInfo

  fun fetchInfo(word: String) {
    val searchWord = convert2SearchWord(word)
    fetchSummaryInfo(searchWord)
    fetchRelateInfo(searchWord)
  }

  fun fetchBitmap4Header(source: String, block: ((Bitmap) -> Unit)) {
    runOnIO(exceptionHandler) {
      val bitmap = BitmapUtils.loadThumbnail(source)
      runOnMain { block(bitmap) }
    }
  }

  fun fetchBitmap4Contents(source: String, block: ((String, Bitmap) -> Unit)) {
    runOnIO(exceptionHandler) {
      val bitmap = BitmapUtils.loadThumbnail(source)
      runOnMain { block(source, bitmap) }
    }
  }

  fun clearNetworkError() {
    _networkError.value = false
  }

  fun completedLoad() {
    _loadedInfo.value = false
  }

  private fun convert2SearchWord(word: String) =
    word.split(" ").joinToString("_")

  private fun fetchSummaryInfo(searchWord: String) {
    runOnIO(exceptionHandler) {
      val info = apiSummary.requestSummaryInfo(searchWord)
      runOnMain { _summaryInfo.value = info }
    }
  }

  private fun fetchRelateInfo(searchWord: String) {
    runOnIO(exceptionHandler) {
      val info = apiRelated.requestRelatedInfo(searchWord)
      runOnMain {
        _relatedInfo.value = info
        _loadedInfo.value = true
      }
    }
  }

  private val exceptionHandler = CoroutineExceptionHandler { _, e ->
    if (e is UnknownHostException) runOnMain { _networkError.value = true }
    else Timber.e("$e")
  }

  companion object {
    private val apiRelated by lazy { AppModule.apiRelated }
    private val apiSummary by lazy { AppModule.apiSummary }
  }
}
