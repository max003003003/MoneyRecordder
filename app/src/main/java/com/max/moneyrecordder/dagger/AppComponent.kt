package com.max.moneyrecordder.dagger


import com.max.moneyrecordder.ui.home.home.HomeActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Max on 2/18/2018.
 */
@Singleton
@Component(modules = [
    AppModule::class,
    ActivityBuilder::class])
 interface AppComponent {
    fun inject(target: HomeActivity)
}