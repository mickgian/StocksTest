package io.philippeboisney.common

import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import io.philippeboisney.common.extension.OnSingleClickListener


object DataBindingAdapters {

    @BindingAdapter("onSingleClick")
    @JvmStatic
    fun View.setOnSingleClickListener(clickListener: View.OnClickListener?) {
        clickListener?.also {
            setOnClickListener(OnSingleClickListener(it))
        } ?: setOnClickListener(null)
    }

    @BindingAdapter("goneUnless")
    @JvmStatic
    fun goneUnless(view: View, visible: Boolean) {
        view.isVisible = visible
    }

    @BindingAdapter("layoutHeight")
    @JvmStatic
    fun setHeight(view: View, height: Float) {
        val layoutParams = view.layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.height = height.toInt()
        view.layoutParams = layoutParams
    }
}