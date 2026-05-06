package com.olavevargas.tarea3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.olavevargas.tarea3.ui.theme.Tarea2Theme
import com.olavevargas.tarea3.ui.model.EventViewModel
import com.olavevargas.tarea3.ui.navigation.NavGraph
import androidx.lifecycle.viewmodel.compose.viewModel
import com.olavevargas.tarea3.ui.model.CategoryViewModel
import com.olavevargas.tarea3.ui.AppViewModelProvider
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarea2Theme {
                val eventViewModel: EventViewModel = viewModel(factory = AppViewModelProvider.Factory)
                val categoryViewModel: CategoryViewModel = viewModel(factory = AppViewModelProvider.Factory)

                NavGraph(eventViewModel, categoryViewModel)
            }
        }
    }
}

