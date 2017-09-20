package com.niji.systemu.testtoothpick

import com.google.gson.Gson
import toothpick.config.Module

/**
 * Created by afaucogney on 20/09/2017.
 */
class NetworkModule : Module() {
    init {
        bind<Gson>(Gson::class.java).toProvider(GsonProvider::class.java)
    }
}
