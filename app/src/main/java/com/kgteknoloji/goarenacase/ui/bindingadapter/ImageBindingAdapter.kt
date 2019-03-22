package com.kgteknoloji.goarenacase.ui.bindingadapter

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.kgteknoloji.goarenacase.R

object ImageBindingAdapter {
    @JvmStatic
    @BindingAdapter("loadUrl")
    fun loadUrl(view: ImageView, url: String?) {
        Glide.with(view.context).load(url ?: "").into(view)
    }

    @JvmStatic
    @BindingAdapter("loadCircleUrl")
    fun loadCircleUrl(view: ImageView, url: String?) {
        Glide.with(view.context).load(url ?: "").apply(RequestOptions().optionalCircleCrop()).into(view)
    }
}
