package Ev3.Kotlin

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Introduce una frase")
    var frase = scanner.nextLine().lowercase().replace(" ","")

    if (frase == frase.reversed()){
        println("Es palindromo")
    }else{
        print("No es palindromo")
    }

}