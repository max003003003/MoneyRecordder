package com.max.moneyrecordder.model

/**
 * Created by Max on 2/18/2018.
 */
data class User(val firstName:String,val lastName:String){
    override fun toString(): String {
        return firstName+" "+lastName
    }
}