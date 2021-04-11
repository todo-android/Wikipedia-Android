package com.github.libliboom.wikipedia.ui.common

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.github.libliboom.wikipedia.R
import java.lang.reflect.Field

class WikiSwipeRefreshLayout @JvmOverloads
constructor(context: Context, attrs: AttributeSet? = null) :
  SwipeRefreshLayout(context, attrs) {

  init {
    val attributeArray = context.obtainStyledAttributes(attrs, R.styleable.WikiSwipeRefreshLayout)
    val iconResId = attributeArray.getResourceId(R.styleable.WikiSwipeRefreshLayout_icon, -1)
    if (iconResId != -1) setIcon(iconResId)
    attributeArray.recycle()
  }

  private fun setIcon(resId: Int) {
    try {
      val f: Field = SwipeRefreshLayout::class.java.getDeclaredField("mCircleView")
      f.isAccessible = true
      val img: ImageView = f.get(this) as ImageView
      img.setImageResource(resId)
    } catch (e: NoSuchFieldException) {
      e.printStackTrace()
    } catch (e: IllegalAccessException) {
      e.printStackTrace()
    }
  }
}
