package com.max.moneyrecordder

import com.max.moneyrecordder.ui.home.home.HomeViewModel
import org.junit.Test


import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.arch.lifecycle.*
import com.max.moneyrecordder.model.User
import org.junit.ClassRule

import org.junit.Rule
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(MockitoJUnitRunner::class)
class ExampleUnitTest {


    @Rule
    @JvmField
    var rule = InstantTaskExecutorRule()


    @Mock
    lateinit var observer: Observer<User>


    @Test
    fun canGetUserData() {
        val homeViewModel = HomeViewModel()
       homeViewModel.getUser().observeForever(observer!!)
        verify(observer).onChanged( User("Steve ","Jobs"))

    }
}
