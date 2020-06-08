package com.gemi_droid.orangetask.sample.javakoin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


fun start(application: Application) {
    startKoin {
        androidContext(application)
        modules(
            listOf(

            )
        )
    }
}