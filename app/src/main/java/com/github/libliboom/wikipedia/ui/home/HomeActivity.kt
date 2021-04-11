package com.github.libliboom.wikipedia.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.libliboom.wikipedia.R
import com.github.libliboom.wikipedia.common.extension.launchDetailActivity
import com.github.libliboom.wikipedia.common.utils.SystemServiceUtils
import com.github.libliboom.wikipedia.databinding.ActivityHomeBinding
import com.github.libliboom.wikipedia.ui.home.feature.NoticeFeature
import com.github.libliboom.wikipedia.ui.home.feature.RefreshFeature
import com.github.libliboom.wikipedia.ui.home.feature.SearchFeature
import com.github.libliboom.wikipedia.ui.home.search.HomeSearchAdapter
import com.github.libliboom.wikipedia.ui.home.search.convertToRelatedInfo
import com.github.libliboom.wikipedia.ui.home.search.convertToSummaryInfo

class HomeActivity : AppCompatActivity() {

  private lateinit var binding: ActivityHomeBinding
  private val viewModel: HomeViewModel by lazy {
    ViewModelProvider(this).get(HomeViewModel::class.java)
  }

  private val homeSearchAdapter by lazy { HomeSearchAdapter() }

  private lateinit var noticeFeature: NoticeFeature
  private lateinit var searchFeature: SearchFeature
  private lateinit var refreshFeature: RefreshFeature

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
    setup()
    setupView()
    subscribe()
  }

  private fun setup() {
    refreshFeature =
      RefreshFeature(
        this as LifecycleOwner,
        binding.swipeContainer,
        binding.progressHorizontal
      )
    noticeFeature =
      NoticeFeature(
        this as LifecycleOwner,
        binding.root,
        binding.notice
      )
    searchFeature =
      SearchFeature(
        this as LifecycleOwner,
        homeSearchAdapter,
        viewModel,
        binding.search,
        onStartRefresh = {
          refreshFeature.start()
        },
        onHideKeyboard = {
          SystemServiceUtils.hideKeyboard(
            this@HomeActivity,
            binding.search.windowToken
          )
        }
      )
  }

  private fun setupView() {
    supportActionBar?.hide()

    binding.resultRecyclerview.apply {
      adapter = homeSearchAdapter.apply {
        onClickHeader = { word -> launchDetailActivity(this@HomeActivity, word) }
        onClickContents = { word -> searchFeature.searchByContents(word) }
        onFetchBitmap4Header = { source, block -> viewModel.fetchBitmap4Header(source, block) }
        onFetchBitmap4Contents = { source, block -> viewModel.fetchBitmap4Contents(source, block) }
      }
      layoutManager = LinearLayoutManager(this@HomeActivity)
    }

    binding.search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(query: String?): Boolean {
        searchFeature.search(query.toString())
        return true
      }

      override fun onQueryTextChange(newText: String?): Boolean {
        return false
      }
    })

    binding.swipeContainer.setOnRefreshListener {
      val word = binding.search.query.toString()
      searchFeature.search(word)
    }
  }

  private fun subscribe() {
    fun updateResults(results: List<HomeSearchAdapter.Search>) {
      homeSearchAdapter.results = results
    }

    fun updateNotice() {
      if (homeSearchAdapter.results.isEmpty()) {
        noticeFeature.showNoticeNoResult(getString(R.string.msg_no_result))
        return
      }
      noticeFeature.hideNotice()
    }

    viewModel.summaryInfo.observe(
      this,
      Observer {
        updateResults(homeSearchAdapter.convertToSummaryInfo(it) + homeSearchAdapter.results)
        updateNotice()
      }
    )

    viewModel.relatedInfo.observe(
      this,
      Observer {
        updateResults(homeSearchAdapter.results + homeSearchAdapter.convertToRelatedInfo(it))
        updateNotice()
      }
    )

    viewModel.networkError.observe(
      this,
      Observer { occurred ->
        if (occurred) noticeFeature.showNoticeNoNetwork(getString(R.string.msg_no_network))
      }
    )

    viewModel.loaded.observe(
      this,
      Observer { completed ->
        if (completed) {
          refreshFeature.end()
          viewModel.completedLoad()
        }
      }
    )
  }
}
