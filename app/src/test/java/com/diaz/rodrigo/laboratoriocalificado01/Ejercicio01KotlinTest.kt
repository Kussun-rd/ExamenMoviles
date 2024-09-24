package com.diaz.rodrigo.laboratoriocalificado01

import org.junit.Test
import org.junit.Assert.* // Importa las funciones de aserción de JUnit

// Clase de prueba para Ejercicio01Kotlin
class Ejercicio01KotlinTest {

    // Prueba para verificar si 'listen' y 'silent' son anagramas
    @Test
    fun testSonAnagramas_True() {
        val ejercicio = Ejercicio01Kotlin()
        val resultado = ejercicio.sonAnagramas("listen", "silent")
        // Imprimir el resultado en la consola
        println("¿'listen' y 'silent' son anagramas?: $resultado")
        assertTrue("Las palabras 'listen' y 'silent' deberían ser anagramas", resultado)
    }

    // Prueba para verificar si 'hello' y 'world' no son anagramas
    @Test
    fun testSonAnagramas_False() {
        val ejercicio = Ejercicio01Kotlin()
        val resultado = ejercicio.sonAnagramas("hello", "world")
        // Imprimir el resultado en la consola
        println("¿'hello' y 'world' son anagramas?: $resultado")
        assertFalse("Las palabras 'hello' y 'world' no deberían ser anagramas", resultado)
    }
}