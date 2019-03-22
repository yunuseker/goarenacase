package com.kgteknoloji.goarenacase.base

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.kgteknoloji.goarenacase.BR
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Created by yunuseker on 20.3.2019.
 */
abstract class BaseActivity<DB : ViewDataBinding, VM : BaseViewModel> : AppCompatActivity(),HasSupportFragmentInjector {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    protected lateinit var binding: DB
    protected lateinit var viewModel: VM
    abstract val getLayoutRes: Int
    abstract val viewModelClass:Class<VM>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,getLayoutRes)
        binding.lifecycleOwner = this
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(viewModelClass)
        binding.setVariable(BR.viewmodel,viewModel)

    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment>? {
        return dispatchingAndroidInjector
    }

    fun loadFragment(contanerId: Int, fragment: Fragment, addToBackStack: Boolean) {
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        if (addToBackStack) {
            ft.addToBackStack(fragment.javaClass.name)
        }
        ft.replace(contanerId, fragment)
        ft.commit()
    }
}