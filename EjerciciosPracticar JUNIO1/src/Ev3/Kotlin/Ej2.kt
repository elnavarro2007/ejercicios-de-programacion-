package Ev3.Kotlin

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Introduce un numero")
    val num = scanner.nextInt()
    println(factorial(num))





}

fun factorial (num : Int) : Int{
    if (num == 0 || num == 1){
        return 1
    }else{
        return num * factorial(num - 1)

    }

}