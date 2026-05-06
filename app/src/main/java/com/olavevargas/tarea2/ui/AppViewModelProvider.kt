package com.olavevargas.tarea2.ui

import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.olavevargas.tarea2.MyApplication
import com.olavevargas.tarea2.ui.model.CategoryViewModel
import com.olavevargas.tarea2.ui.model.EventViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            CategoryViewModel(
                tarea2Application().container.categoryRepository
            )
        }
        initializer {
            EventViewModel(
                tarea2Application().container.categoryRepository,
                tarea2Application().container.eventRepository
            )
        }
    }
}

fun CreationExtras.tarea2Application(): MyApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as MyApplication)
