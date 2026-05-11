import java.util.Scanner

fun main(args: Array<String>) {
    val Scanner = Scanner(System.`in`)
    print("Introduce una palabra : ")
    var palabra = Scanner.nextLine()
    palabra = palabra.lowercase()
    if(palabra == palabra.reversed()){
        print("Es palindromo")
    }else{
        print("no es palindromo")
    }
}