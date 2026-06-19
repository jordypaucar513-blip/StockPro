package com.example.stockpro

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}data class Producto(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    var stockActual: Int
)