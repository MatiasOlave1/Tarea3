package com.olavevargas.tarea3.ui.navigation



import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
data class Detail(val idCategoria: Int)

@Serializable
object AddEvent