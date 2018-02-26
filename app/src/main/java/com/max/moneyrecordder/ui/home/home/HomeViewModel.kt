package com.max.moneyrecordder.ui.home.home

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.max.moneyrecordder.model.User

/**
 * Created by Max on 2/18/2018.
 */

open class HomeViewModel : ViewModel {

   private var User: MutableLiveData<User> =  MutableLiveData<User>()
    constructor(){
        User.value=User("Steve ","Jobs")
    }

    fun  getUser():LiveData<User>{
        return User
    }


}