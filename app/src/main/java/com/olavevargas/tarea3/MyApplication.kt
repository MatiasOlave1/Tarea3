package com.olavevargas.tarea3

import android.app.Application
import com.olavevargas.tarea3.data.AppContainer
import com.olavevargas.tarea3.data.AppDataContainer

class MyApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
