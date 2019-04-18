package com.kgteknoloji.goarenacase.ui.bindingadapter

import android.databinding.BindingAdapter
import android.support.v4.content.ContextCompat
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.kgteknoloji.goarenacase.R

object ImageBindingAdapter {
    @JvmStatic
    @BindingAdapter("profileImageUrl")
    fun loadUrl(view: ImageView, url: String?) {
        val requestOptions = RequestOptions()
        val profileIconDrawable= view.context.getDrawable(R.drawable.ic_profile)
        requestOptions.placeholder(profileIconDrawable)
        requestOptions.error(profileIconDrawable)
        Glide.with(view.context)
            .setDefaultRequestOptions(requestOptions)
            .load(url ?: "")
            .into(view)
    }

    @JvmStatic
    @BindingAdapter("loadCircleUrl")
    fun loadCircleUrl(view: ImageView, url: String?) {
        Glide.with(view.context).load(url ?: "").apply(RequestOptions().optionalCircleCrop()).into(view)
    }
}
