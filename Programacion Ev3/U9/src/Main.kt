
/* click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter. */

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Introduce dos numeros, a continuacion te dire cual es mayor")
    val num1 : Int = scanner.nextInt()
    var num2 : Int  = scanner.nextInt()
    if (num1 > num2) {
        println("El mayor es "+num1)
    }else
        println("El mayor es"+num2)
}