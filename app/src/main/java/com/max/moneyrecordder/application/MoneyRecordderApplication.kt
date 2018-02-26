package com.max.moneyrecordder.application

import android.app.Application
import com.max.moneyrecordder.dagger.AppComponent
import com.max.moneyrecordder.dagger.AppModule
import com.max.moneyrecordder.dagger.DaggerAppComponent

/**
 * Created by Max on 2/18/2018.
 */


 class MoneyRecordderApplication : Application() {
     lateinit var component: AppComponent;

 override fun onCreate() {
  super.onCreate()
  component = initDagger(this)
 }

    private fun initDagger(app: MoneyRecordderApplication): AppComponent =
            DaggerAppComponent.builder()
                    .appModule(AppModule(app))
                    .build()
}