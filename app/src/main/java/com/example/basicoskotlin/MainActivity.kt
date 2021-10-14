package com.example.basicoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variablesYConstantes()
        // tiposDeDatos()
        // condicionalWhen()
        // arreglos()
        bucles()
        // tarea2()
    }
    private fun variablesYConstantes() {
        // Variables
        var myVariable = "Hola mundo"
        println(myVariable)

        myVariable = "Bootcamp mobile"
        println(myVariable)

        // No se puede dar un valor distinto al tipo asignado
        // myVariable = 10

        // Constantes
        val myConstant = 10
        println(myConstant)
        // No se puede cambiar el valor de la constante
        // myConstant = 4
        val mySecondConstant = myVariable
        println(mySecondConstant)
    }

    private fun tiposDeDatos() {
        // String
        val myText = "Soy una cadena"
        var text: String
        text = "Hola"
        val finalText = text + ", " + myText
        println(finalText)

        // Enteros (Byte, Short, Int, Long)
        val myNumber = 10
        val myNumber2: Int = 5
        val myFinalNumber = myNumber + myNumber2
        println(myFinalNumber)

        // Decimales (Float, Double)
        val myFloat: Float = 12.1f
        val myDouble: Double = 15.20
        val myDouble2 = 10.5
        val sumaDouble = myDouble + myDouble2
        println(sumaDouble)

        // Boolean
        val verdad = true
        val falso: Boolean = false
        println(verdad == falso)
        println(verdad && falso)

        val texto = "abc"
        for ( chr in texto) {
            println(chr+1)
        }

    }

    fun condicionalWhen() {
        val age = 25
        val word = "k"

        when(age) {
            0, 1, 2 -> println("Es un bebé")
            in 3..10 -> println("Es un niño")
            in 11..14 -> println("Es un puber")
            in 15..18 -> println("Es un adolescente")
            in 18..23 -> println("Es un joven")
            else -> println("Es un adulto")
        }
        when(word) {
            in "a".."h" -> println("primeras")
            in "i".."m" -> println("intermedias")
            else -> println("últimas")
        }
    }

    fun arreglos() {
        val name = "Deryam"
        val surname = "Hermosilla"
        val company = "drhe12"
        val age = "25"

        // Creación de un Array
        val myArray = arrayListOf<String>()

        // Añadir datos a un Array
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        println(myArray)

        // Añadir un conjunto de datos
        myArray.addAll(listOf("Hola", "everis", "bootcamp"))
        println(myArray)

        // Acceso a datos
        val myAge = myArray[2]
        println(myAge)

        // Modificar datos
        myArray[6] = "bootcamp mobile"
        println(myArray)

        // Eliminar datos
        myArray.removeAt(4)
        println(myArray)

        // Recorrer datos
        myArray.forEach {
            println(it)
        }

        // Otras operaciones
        println(myArray.count())

        println(myArray.first())
        println(myArray.last())
        myArray.clear()
        println(myArray.count())
    }

    fun bucles() {
        
    }

    // fun List<Int>.promedio(): Double = this.average()

    fun List<Int>.promedio(): Double {
        val suma = this.sum()
        val promedio = (suma * 1.0) / this.size

        return promedio
    }
    fun tarea2() {
        //TODO: Crear una función de de extensión que extienda de una Lista que retorne el promedio de los elementos.
        //Para sacar el promedio se debe seguir las siguientes condiciones:
        //a) Se debe eliminar la nota mas baja.
        //b) Se debe duplicar la nota mas alta.
        //c) Puede haber "errores del sistema" por esa razón tiene que validar que la nota este en el rango de 0 a 20.
        //d) Si la nota ingresada es mayor a 20 considerar el valor máximo posible, si es menor a 0 considerar el valor mínimo.

        val notes = listOf(13,22,"18",15,"11",-4,16)

        val notas = mutableListOf<Int>()

        for (note in notes) {
            when(note) {
                is String -> notas.add(note.toInt())
                is Int -> notas.add(note)
            }
        }

        for ((i, n) in notas.withIndex()) {
            try {
                if (n !in 0..20) {
                    throw Exception("No está en el rango")
                }
            } catch (e: Exception) {
                println(e)
                if (n < 0) {
                    notas[i] = 0
                } else if (n > 20) {
                    notas[i] = 20
                }
            }
        }
        notas.sort()
        notas.remove(notas[0])
        notas.add(notas[notas.size-1])

        println("La nota es: ${notas.promedio()}")
    }



    /*
    fun estandarizarLista(notes: List<Any>): List<Any> {
        val notas = mutableListOf<Int>()
        for (note in notes) {
            when(note) {
                is String -> notas.add(note.toInt())
                is Int -> notas.add(note)
            }
        }
        return  notas
    }
    */
}