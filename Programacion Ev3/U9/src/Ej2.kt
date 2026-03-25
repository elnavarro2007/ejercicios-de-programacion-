import java.util.Scanner


fun factorial(number: Int) {
    val initialNumber: Int = number
    var factorial: Long = 1

    for (i in 1..initialNumber) {
        factorial = factorial * i.toLong()
    }

    println("Factorial of $number! is $factorial")
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Introduce un numero : ")
    val num : Int = scanner.nextInt()
    factorial(num)
}