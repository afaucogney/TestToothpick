package com.niji.systemu.testtoothpick

import android.app.Application
import toothpick.Toothpick
import toothpick.smoothie.module.SmoothieApplicationModule

/**
 * Created by afaucogney on 20/09/2017.
 */
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        setupToothPick()
    }

    private fun setupToothPick() {
        val appScope = Toothpick.openScope(this)
        appScope.installModules(
                SmoothieApplicationModule(this),
                NetworkModule()
        )
    }
}


