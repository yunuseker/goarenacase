package com.kgteknoloji.goarenacase.base

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.kgteknoloji.goarenacase.BR

/**
 * Created by yunuseker on 20.3.2019.
 */
class BaseRecyclerViewHolder<DATA>(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun setData(data: DATA) {
        binding.setVariable(BR.data, data)
        binding.executePendingBindings()
    }
}
