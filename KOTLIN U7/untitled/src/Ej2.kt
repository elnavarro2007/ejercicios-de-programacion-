import java.util.Scanner

fun main() {
    val Scanner = Scanner(System.`in`)
    println("Introduce un numero")
    var num = Scanner.nextInt()

    print(recursiva(num))

}


fun recursiva(num: Int): Int {
    if (num == 0 || num == 1) {
        return 1;
    } else {
        return num * recursiva(num - 1)
    }
}