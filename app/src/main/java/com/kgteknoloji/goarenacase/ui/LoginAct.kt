package com.kgteknoloji.goarenacase.ui

import android.arch.lifecycle.Observer
import android.content.Intent
import android.os.Bundle
import com.kgteknoloji.goarenacase.R
import com.kgteknoloji.goarenacase.base.BaseActivity
import com.kgteknoloji.goarenacase.databinding.ActLoginBinding
import com.kgteknoloji.goarenacase.viewmodel.VMLoginAct

class LoginAct : BaseActivity<ActLoginBinding, VMLoginAct>() {
    override val getLayoutRes = R.layout.act_login
    override val viewModelClass = VMLoginAct::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listenLoginSuccess()
        listenLoginFail()
    }

    private fun listenLoginFail() {
        viewModel.loginFail.observe(this, Observer {

        })
    }

    private fun listenLoginSuccess() {
        viewModel.loginSuccess.observe(this, Observer {
            val intent = Intent(this, MainAct::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        })
    }
}