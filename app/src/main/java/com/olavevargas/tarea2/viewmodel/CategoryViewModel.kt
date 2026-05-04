package com.olavevargas.tarea2.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.olavevargas.tarea2.data.Category

class CategoryViewModel: ViewModel() {

    var categorias by mutableStateOf(listOf<Category>())
        private set

    fun addCategory(nombre: String): Int {
        val existente = categorias.find { it.nombre.equals(nombre, true) }
        if (existente != null) return existente.id

        val nuevoId = (categorias.maxOfOrNull { it.id } ?: 0) + 1

        val nueva = Category(nuevoId, nombre)
        categorias = categorias + nueva

        return nuevoId
    }

    fun getAll(): List<Category> = categorias


}