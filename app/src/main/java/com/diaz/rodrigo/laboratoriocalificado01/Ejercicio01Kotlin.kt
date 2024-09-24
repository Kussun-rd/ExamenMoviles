package com.diaz.rodrigo.laboratoriocalificado01

// Definir una clase llamada 'Ejercicio01Kotlin'
class Ejercicio01Kotlin {

    // Función que verifica si dos palabras son anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Primero, comprobamos si las palabras tienen la misma longitud
        if (palabra1.length != palabra2.length) {
            return false // Retornamos 'false' si las longitudes son diferentes
        }

        // Convertimos ambas palabras a arreglos de caracteres
        val arregloPalabra1 = palabra1.toCharArray()
        val arregloPalabra2 = palabra2.toCharArray()

        // Ordenamos los arreglos de caracteres
        val arregloOrdenado1 = arregloPalabra1.sortedArray()
        val arregloOrdenado2 = arregloPalabra2.sortedArray()

        // Comparamos los arreglos de caracteres ordenados
        return arregloOrdenado1.contentEquals(arregloOrdenado2) // Si son iguales, retornamos 'true'
    }
}