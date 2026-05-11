import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    println("Introduce dos numeros")
    var num1 = scanner.nextInt()
    var num2 = scanner.nextInt()

    if (num1 > num2){
        print( "$num1 es mayor que $num2")
    }else if (num2 > num1) {
        print("$num2 es mayor que $num1")
    } else {
        print("son iguales")
    }

}