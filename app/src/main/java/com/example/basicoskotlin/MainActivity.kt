package com.example.basicoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variablesYConstantes()
        tiposDeDatos()
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
    }
}