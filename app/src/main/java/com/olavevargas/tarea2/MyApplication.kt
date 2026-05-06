package com.olavevargas.tarea2

import android.app.Application
import com.olavevargas.tarea2.data.AppContainer
import com.olavevargas.tarea2.data.AppDataContainer

class MyApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
