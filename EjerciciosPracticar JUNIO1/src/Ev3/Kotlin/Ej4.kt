package Ev3.Kotlin

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Introduce un numero")
    val num = scanner.nextInt()
    var contador = 0;

    for (i in 1..num ){
        if (num % i == 0){
            contador++
        }
    }
    if (contador == 2){
        println("Es primo")
    }else{
        println("No es primo")
    }
}