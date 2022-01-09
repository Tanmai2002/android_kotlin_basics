package com.dazz.androidbasickotlintemplates

import android.widget.Button
import androidx.databinding.BindingAdapter

    @BindingAdapter("inc_with_binding_adapters")
    fun doSomething(button: Button?,viewModel: DataViewModel?){
        button?.setOnClickListener{
            viewModel?.inc()
        }

    }
