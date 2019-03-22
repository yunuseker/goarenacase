package com.kgteknoloji.goarenacase.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import com.kgteknoloji.goarenacase.R
import com.kgteknoloji.goarenacase.base.BaseActivity
import com.kgteknoloji.goarenacase.databinding.ActMainBinding
import com.kgteknoloji.goarenacase.viewmodel.VMMainAct

class MainAct : BaseActivity<ActMainBinding, VMMainAct>() {
    override val getLayoutRes = R.layout.act_main
    override val viewModelClass = VMMainAct::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadFragment(R.id.container, TodoFrg.newInstance(), false)
    }

    public fun loadFragment(fragment: Fragment?, addToBackStack: Boolean) {
        super.loadFragment(R.id.container, fragment!!, addToBackStack)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        }else{
            super.onBackPressed()
        }
    }
}