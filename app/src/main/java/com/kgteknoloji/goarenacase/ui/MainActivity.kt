package com.kgteknoloji.goarenacase.ui

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.widget.TextView
import com.kgteknoloji.goarenacase.R
import com.kgteknoloji.goarenacase.base.BaseActivity
import com.kgteknoloji.goarenacase.base.BaseFragment
import com.kgteknoloji.goarenacase.databinding.ActivityMainBinding
import com.kgteknoloji.goarenacase.viewmodel.VMMainAct
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.app_bar_main.view.*
import kotlinx.android.synthetic.main.nav_header_main.view.*

class MainActivity : BaseActivity<ActivityMainBinding, VMMainAct>(), NavigationView.OnNavigationItemSelectedListener {
    override val getLayoutRes = R.layout.activity_main
    override val viewModelClass = VMMainAct::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        showScreen(TodoFrg.newInstance(),R.string.title_notes)

        viewModel.showProfileInfo()
        subscribeMenuTitle()
        subscribeMenuSubTitle()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun subscribeMenuTitle(){
        viewModel.headerTitle.observe(this, Observer { title->
            title.let { binding.navView.getHeaderView(0).findViewById<TextView>(R.id.tvNavigationTitle).text= it }
        })
    }

    private fun subscribeMenuSubTitle(){
        viewModel.headerSubTitle.observe(this, Observer { subTitle->
            subTitle.let { binding.navView.getHeaderView(0).findViewById<TextView>(R.id.tvNavigationSubTitle).text= it }
        })
    }

    fun showScreen(fragment: Fragment, titleResId:Int){
        loadFragment(R.id.container, fragment, false)
        binding.appbar.toolbar.title = getString(titleResId)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.notes -> {
                showScreen(TodoFrg.newInstance(),R.string.title_notes)
            }

            R.id.profile -> {
                showScreen(ProfileFrg.newInstance(),R.string.profile)
            }

            R.id.faq -> {
                showScreen(FaqFrg(),R.string.title_faq)
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}