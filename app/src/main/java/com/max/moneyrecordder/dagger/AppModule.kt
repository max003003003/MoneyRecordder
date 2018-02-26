package com.max.moneyrecordder.dagger

import dagger.Provides
import javax.inject.Singleton
import android.app.Application
import android.content.Context
import com.max.moneyrecordder.application.MoneyRecordderApplication
import dagger.Module


/**
 * Created by Max on 2/18/2018.
 */
@Module
class AppModule(private val app: Application) {

    @Provides
    @Singleton
    fun provideContext(): Context = app

}