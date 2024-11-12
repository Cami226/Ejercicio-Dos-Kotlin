package com.bootcamp.ejerciciodoskotlin



fun calcularPrecioEntrada(edad: Int, diaSemana: String): String {
    if (edad < 0 || edad > 100) {
        return "Error: Edad ingresada no es valida"
    }

    return when {
        edad < 4 -> "Entrada gratuita para menores de 4 años"
        edad in 5..15 -> "El precio de la entrada es 15.000 CLP"
        edad in 16..60 -> {
            val precioAdulto = 30000
            val descuento = if (diaSemana.equals("lunes", ignoreCase = true) ||
            diaSemana.equals("martes", ignoreCase = true)) 5000
        else 0

        "El precio de la entrada es ${precioAdulto - descuento} CLP."
    }

        edad > 60 -> "El precio de la entrada es 20.000 CLP"

        else -> "Error: Edad no válida"
    }
}

fun main(){

    println(calcularPrecioEntrada(3, "miércoles"))
    println(calcularPrecioEntrada(15, "miércoles"))
    println(calcularPrecioEntrada(10, "sábado"))
    println(calcularPrecioEntrada(25, "lunes"))
    println(calcularPrecioEntrada(35, "miércoles"))
    println(calcularPrecioEntrada(70, "domingo"))
    println(calcularPrecioEntrada(105, "jueves"))
}


