package com.github.libliboom.wikipedia.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

@Suppress("LeakingThis")
abstract class AppFeature(private val lifecycleOwner: LifecycleOwner) : LifecycleObserver {

  init {
    lifecycleOwner.lifecycle.addObserver(this)
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
  open fun onCreate() {
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
  open fun onDestroy() {
  }

  protected fun isVisibleState() = lifecycleOwner.isVisible()
}

private fun LifecycleOwner.isVisible() = lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)
