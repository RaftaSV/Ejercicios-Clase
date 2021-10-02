package com.desarrollo.miappandroid

import kotlin.math.roundToInt

class empleado {
    class empleado {
        var nombre: String? = null

            get() = field?.toUpperCase()

            set(value) {
                if (value!!.isEmpty()){
                    println("El Nombre debe de tener texto")
                }else{
                    field=value
                }
            }
        var Area : String? = null
            get() = field
            set(value) {
                if (value!!.isEmpty()) {
                    println("El campo debe de estar lleno")

                } else {
                    field = value
                }

            }
        var cargo : String? = null

            get()= field
            set(value) {
                if (value!!.isEmpty()){
                    println("El campo debe de estar lleno")
            }else{
               field=value
                }
            }
        var tiempoDeTrabajo : Int = 0
            get() = field
            set(value) {
                if (value>=1){
                    field=value
                }else{
                    println("El tiempo de trabajo debe ser mayor a 0")
                }
            }
        var sueldo : Float =0.0f
            get() = field

            set(value) {
                if (value > 0.0f) {
                    var salario = value
                    if (tiempoDeTrabajo > 0) {

                        var anios: Int = (tiempoDeTrabajo / 5)

                        if (anios>=1) {

                            for (i in 1..anios)
                            {
                              salario = salario + 25
                            }
                        }
                    }
                    field = salario
                }
                else {
                    println("El salario debe de ser mayor a cero dolares")
                }
            }


    }
}