package com.kgteknoloji.goarenacase.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by yunuseker on 20.3.2019.
 */
class BaseRecyclerAdapter<DATA>(private val singleLayout: Int) : RecyclerView.Adapter<BaseRecyclerViewHolder<DATA>>() {

    private var list = mutableListOf<DATA>()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BaseRecyclerViewHolder<DATA> {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        return BaseRecyclerViewHolder(
            DataBindingUtil.inflate<ViewDataBinding>(
                layoutInflater,
                viewType,
                viewGroup,
                false
            ))
    }

    override fun onBindViewHolder(baseRecyclerViewHolder: BaseRecyclerViewHolder<DATA>, position: Int) {
        baseRecyclerViewHolder.setData(list[position])
    }

    override fun getItemViewType(position: Int): Int {
        return singleLayout
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setData(data: List<DATA>?) {
        if (data == null) {
            return
        }
        list.clear()
        list.addAll(data)
        notifyDataSetChanged()
    }
}