package com.kgteknoloji.goarenacase.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kgteknoloji.goarenacase.R
import com.kgteknoloji.goarenacase.base.BaseFragment
import com.kgteknoloji.goarenacase.databinding.FrgFaqBinding
import com.kgteknoloji.goarenacase.viewmodel.VmFaq

class FaqFrg : BaseFragment<FrgFaqBinding,VmFaq>() {
    override val getLayoutId: Int =R.layout.frg_faq
    override val viewModelClass: Class<VmFaq> = VmFaq::class.java


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return binding.root
    }


}
