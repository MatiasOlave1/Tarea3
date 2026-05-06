package com.olavevargas.tarea3.data.repository.category

import com.olavevargas.tarea3.data.local.entity.Category
import kotlinx.coroutines.flow.Flow

interface CategoryRepository {
    fun getAllCategoriesStream(): Flow<List<Category>>
    fun getCategoryStream(id: Int): Flow<Category?>
    suspend fun insertCategory(category: Category): Int
    suspend fun getCategoryByName(nombre: String): Category?
    suspend fun deleteCategory(category: Category)
    suspend fun updateCategory(category: Category)
}
