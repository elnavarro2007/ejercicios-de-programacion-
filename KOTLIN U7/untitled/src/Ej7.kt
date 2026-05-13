import java.util.Scanner

fun main() {
    val Scanner = Scanner(System.`in`)
    var frase = listOf("Hola", "soy", "Diego", "Navarro", "po")

    frase = frase.sortedBy {  it.length}

    print(frase)
}