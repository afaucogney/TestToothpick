package com.niji.systemu.testtoothpick

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import javax.inject.Provider

/**
 * Created by afaucogney on 20/09/2017.
 */
class GsonProvider : Provider<Gson> {
    override fun get(): Gson {
        return GsonBuilder().create()
    }
}