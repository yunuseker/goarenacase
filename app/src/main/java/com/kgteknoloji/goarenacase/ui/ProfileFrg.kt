package com.kgteknoloji.goarenacase.ui

import android.os.Bundle
import com.kgteknoloji.goarenacase.R
import com.kgteknoloji.goarenacase.base.BaseFragment
import com.kgteknoloji.goarenacase.databinding.FrgProfileBinding
import com.kgteknoloji.goarenacase.viewmodel.VMProfileFrg
import android.app.AlertDialog

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
        viewModel.getProfileData()
        binding.btnFaq.setOnClickListener {
            val parentActivity= activity as MainActivity
            parentActivity.showScreen(FaqFrg(), R.string.title_faq)
        }

        binding.btnLogout.setOnClickListener {
            AlertDialog.Builder(context)
                    .setTitle(getString(R.string.logout))
                    .setMessage(getString(R.string.warning_logout))
                    .setPositiveButton(android.R.string.yes) { dialog, which ->
                        activity?.finish()
                    }
                    .setNegativeButton(android.R.string.no, null)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show()
        }
    }

}
