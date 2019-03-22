package com.kgteknoloji.goarenacase.ui

import android.os.Bundle
import com.kgteknoloji.goarenacase.R
import com.kgteknoloji.goarenacase.base.BaseActivity
import com.kgteknoloji.goarenacase.base.BaseFragment
import com.kgteknoloji.goarenacase.databinding.FrgProfileBinding
import com.kgteknoloji.goarenacase.viewmodel.VMProfileFrg

class ProfileFrg : BaseFragment<FrgProfileBinding, VMProfileFrg>() {

    companion object {
        fun newInstance(): ProfileFrg {
            val args: Bundle = Bundle()
            val fragment = ProfileFrg()

            fragment.arguments = args
            return fragment
        }
    }

    override val getLayoutId = R.layout.frg_profile
    override val viewModelClass: Class<VMProfileFrg> = VMProfileFrg::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.btnBack.setOnClickListener { activity?.onBackPressed() }
        viewModel.getProfileData()
    }

}
