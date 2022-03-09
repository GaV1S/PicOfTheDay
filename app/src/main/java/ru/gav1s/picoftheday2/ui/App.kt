package ru.gav1s.picoftheday2.ui

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ru.gav1s.picoftheday2.di.appModule


class App : Application() {
    companion object {
        lateinit var appInstance: App
        const val APP_PREF_NAME = "AppSettings"
        const val PREF_THEME_KEY = "AppTheme"
    }

    override fun onCreate() {
        super.onCreate()
        appInstance = this
        startKoin {
            androidContext(this@App)
            modules(appModule)
        }
    }
}