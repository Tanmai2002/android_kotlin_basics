package com.dazz.androidbasickotlintemplates

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel : ViewModel() {
    val data: MutableLiveData<Int> = MutableLiveData(2)
    fun inc(){
        data.value=data.value!!.plus(1)
    }
}