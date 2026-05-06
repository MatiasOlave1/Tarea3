package com.olavevargas.tarea3.data

import android.content.Context
import com.olavevargas.tarea3.data.local.AppDatabase
import com.olavevargas.tarea3.data.repository.Event.EventRepository
import com.olavevargas.tarea3.data.repository.Event.EventRepositoryImpl
import com.olavevargas.tarea3.data.repository.category.CategoryRepository
import com.olavevargas.tarea3.data.repository.category.CategoryRepositoryImpl

interface AppContainer {
    val categoryRepository: CategoryRepository
    val eventRepository: EventRepository
}

class AppDataContainer(private val context: Context) : AppContainer {
    override val categoryRepository: CategoryRepository by lazy {
        CategoryRepositoryImpl(AppDatabase.getDatabase(context).categoryDao())
    }

    override val eventRepository: EventRepository by lazy {
        EventRepositoryImpl(AppDatabase.getDatabase(context).eventDao())
    }
}
