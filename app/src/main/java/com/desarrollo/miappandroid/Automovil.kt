package com.desarrollo.miappandroid


    class Automovil(mar:String,col:String,pre:Int){
        var marca = mar
        var color = col
        var precio = pre
        var velocidadMax =null


        fun encender(){
            println("El vehiculo $marca esta encendido")
        }

        fun  apagar(){
            println("El vehiculo esta apagado")
        }
        fun acelerar(){
            println("El carro esta acelerando")
        }
        fun detener(){
            println("El carro esta detenido")
        }
    }
