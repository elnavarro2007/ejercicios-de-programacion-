package Ev3.Kotlin

import java.util.*


fun main() {
    val Scanner = Scanner(System.`in`)
    println("Introduce un numero inicial")
    var num = Scanner.nextInt()
    println("Introduce el numero final")
    var num2 = Scanner.nextInt()

    println(    capicuas(num,num2))

}
// fun numerosCapicuaEnrango(num : Int, num2 : Int): List<Int> {
//     var array = IntArray(num2-num)
//
//
//
// }

fun verificar(num: Int): Boolean {
    val num2 = num.toString()
    return num == num2.reversed().toInt()
}

fun capicuas(num: Int, num2: Int): List<Int> {
    val lista = mutableListOf<Int>()
    for  (n in num..num2){
        if(verificar(n)){
            lista.add(n)
        }
    }

    return lista

}

