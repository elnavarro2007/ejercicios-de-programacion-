import java.util.Scanner

fun main() {
    val Scanner = Scanner(System.`in`)
    print("Introduce un numero, sera la longitud del array : ")
    val num = Scanner.nextInt()
    var array = IntArray(num)
    println(" " )

    for (i in 1..num){
        print("Introduce un numero, quedan ${num-i} espacios : ")
        var num2 = Scanner.nextInt()
        array[i-1] = num2
    }
    array.sort()
    print("Array completo : ${array.contentToString()} " )
    println(" ")

    println("El segundo numero mas grande es ${array[array.size - 2]}")

}