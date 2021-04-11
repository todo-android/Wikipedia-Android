package com.github.libliboom.wikipedia.common.utils

import android.annotation.SuppressLint
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import com.github.libliboom.oohttp.base.connection.OoUrlConnection
import com.github.libliboom.wikipedia.R

object BitmapUtils {

  fun loadThumbnail(source: String): Bitmap {
    val stream = OoUrlConnection.Factory.getConnection(source).getStream()
    return BitmapFactory.decodeStream(stream)
  }

  @SuppressLint("UseCompatLoadingForDrawables")
  fun loadThumbnailDefault(resources: Resources): Bitmap {
    val drawable = resources.getDrawable(R.drawable.img_no_thumbnail)
    val bitmap = Bitmap.createBitmap(drawable.intrinsicWidth, drawable.intrinsicHeight, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)
    drawable.apply {
      setBounds(0, 0, canvas.width, canvas.height)
      draw(canvas)
    }

    return bitmap
  }

  fun copy(bitmap: Bitmap): Bitmap {
    return bitmap.copy(bitmap.config, false)
  }
}
