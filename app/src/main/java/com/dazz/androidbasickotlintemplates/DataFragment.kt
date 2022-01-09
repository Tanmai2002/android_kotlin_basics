package com.dazz.androidbasickotlintemplates

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.dazz.androidbasickotlintemplates.databinding.DataFragmentBinding

class DataFragment : Fragment() {


    private  val sharedviewModel:  DataViewModel by activityViewModels()
    private var _binding :DataFragmentBinding? =null
    private val  binding : DataFragmentBinding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= DataFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding!!.apply {
            lifecycleOwner=viewLifecycleOwner
            viewModel=sharedviewModel
            dataFrag=this@DataFragment

        }
    }



}