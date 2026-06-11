package Ev3.Kotlin

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Introduce dos numeros")
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    if (a > b){
        print("${a} es mayor que ${b}")
    }else{
        print("${b} es mayor que ${a}")

    }
}