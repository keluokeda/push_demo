package com.ke.demo.push

import android.app.Application
import com.mpaas.mps.adapter.api.MPPush

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        MPPush.setup(this)
        MPPush.init(this)
    }
}