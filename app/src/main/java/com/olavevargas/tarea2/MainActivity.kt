package com.olavevargas.tarea2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.olavevargas.tarea2.ui.theme.Tarea2Theme
import com.olavevargas.tarea2.viewmodel.EventViewModel
import com.olavevargas.tarea2.navigation.NavGraph
import androidx.lifecycle.viewmodel.compose.viewModel
import com.olavevargas.tarea2.viewmodel.CategoryViewModel
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarea2Theme {
                val eventViewModel: EventViewModel = viewModel()
                val categoryViewModel: CategoryViewModel = viewModel()

                NavGraph(eventViewModel, categoryViewModel)
            }
        }
    }
}

