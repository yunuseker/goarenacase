package com.kgteknoloji.goarenacase.ui.bindingadapter

import android.databinding.BindingAdapter
import android.view.View

object CommonBindingAdapter{
    @JvmStatic
    @BindingAdapter("isVisible")
    fun visibilty(view: View, isVisible: Boolean) {
        if (isVisible) {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
    }
}