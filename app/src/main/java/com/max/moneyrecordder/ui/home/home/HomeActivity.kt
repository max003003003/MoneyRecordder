package com.max.moneyrecordder.ui.home.home

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.max.moneyrecordder.R

import com.max.moneyrecordder.model.User
import javax.inject.Inject




/**
 * Created by Max on 2/18/2018.
 */
class HomeActivity: AppCompatActivity() {
    private lateinit var viewModel:HomeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var accountName: TextView = findViewById(R.id.account_name)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        viewModel.getUser().observe(this, Observer {
            User-> accountName.setText(User.toString()) })


    }




}