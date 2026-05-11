import java.util.Scanner

fun main() {
    val Scanner = Scanner(System.`in`)
    var contador = 0
    print("Introduce un primo : ")



    val num = Scanner.nextInt()



    for (i in 1..num){
        if (num % i == 0){
            contador++
        }else{

        }
    }
    if (contador > 2){
        print("El numero $num no es primo")
    }else {
        print("El numero $num es primo ")
    }

}