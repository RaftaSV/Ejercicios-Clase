package com.desarrollo.miappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //calculoSalario
       // tabla(2)
        //Empleado()
        var dado =  Dado(7)
        dado.valor
        dado.tirar()
        dado.imprimir()

    }


    class salario(var nombre: String, var pagoHora : Float , var horasTrabajadas: Int, var horasExtras: Int ){

    }
// Ejercicio 1
    fun calculoSalario(){
       var salario1 = salario("Rafael Gonzalez",10f, 8,7)
        var horasTotales = salario1.horasTrabajadas + salario1.horasExtras
        var salarioEmpleado : Float = (salario1.horasTrabajadas * salario1.pagoHora) + ((salario1.horasExtras *salario1.pagoHora)*2)
        println("El empleado ${salario1.nombre} tiene un salario de $salarioEmpleado por haber trabajado en total $horasTotales horas")
    }
    // Ejercicio 2
    fun tabla(valor: Int){
        println("TABLA DE MULTIPLICAR DEL $valor")
        for(i in 1..10){
            var multiplicacion : Int = i*valor
            println("$valor * $i = $multiplicacion")

        }

    }
    // Ejercicio 3
    fun Empleado(){
       var Empleado = empleado.empleado()
        Empleado.nombre="Jose Portillo"
        Empleado.Area="Administrativa"
        Empleado.cargo="Gerente"
        Empleado.tiempoDeTrabajo=13
        Empleado.sueldo=956.90f

        println("${Empleado.nombre} trabaja en area ${Empleado.Area} con el cargo de ${Empleado.cargo} " )
        println("a trabajado para la empresa ${Empleado.tiempoDeTrabajo} años")
        println("Tiene un salario de $${Empleado.sueldo}")

    }
    // Ejercicio

    class Dado(valor: Int){
        var valor: Int = 1
            set(valor) {

                if (valor >=1 && valor <= 6)
                    field = valor
                else
                    field = 1
            }

        init {
            this.valor = valor
        }

        fun tirar() {
            valor = ((Math.random() * 6) + 1).toInt()
        }

        fun imprimir() = println("Valor del dado: $valor")
    }




}