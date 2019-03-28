package com.kgteknoloji.goarenacase.ui

import android.arch.lifecycle.Observer
import android.os.Bundle
import com.kgteknoloji.goarenacase.R
import com.kgteknoloji.goarenacase.base.BaseFragment
import com.kgteknoloji.goarenacase.base.BaseRecyclerAdapter
import com.kgteknoloji.goarenacase.databinding.FrgTodoBinding
import com.kgteknoloji.goarenacase.ui.viewentity.TodoViewEntity
import com.kgteknoloji.goarenacase.viewmodel.VMTodoFrg

class TodoFrg : BaseFragment<FrgTodoBinding, VMTodoFrg>() {
    companion object {
        fun newInstance(): TodoFrg {
            val args = Bundle()
            val fragment = TodoFrg()

            fragment.arguments = args
            return fragment
        }
    }

    override val getLayoutId = R.layout.frg_todo
    override val viewModelClass = VMTodoFrg::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val adapter = BaseRecyclerAdapter<TodoViewEntity>(R.layout.item_todo)
        binding.rvTodos.adapter = adapter
        viewModel.getTodoList()
        viewModel.todoList.observe(this, Observer {
            adapter.setData(it)
        })
//        binding.btnProfile.setOnClickListener { (activity as MainAct).loadFragment(ProfileFrg.newInstance(),true)}
    }

}