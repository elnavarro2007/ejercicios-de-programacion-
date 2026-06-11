package Ev3.Kotlin

class Alumno(
    val nombre: String,
    val notas: List<Int>
) {
    fun media(): Double {
        return notas.average()
    }

    fun aprobado() : Boolean{
        return media() >= 5.00
    }
}


fun procesoAlumnos(alumnos : List<Alumno>){
        for (alumno in alumnos){
            println("nombre : ${alumno.nombre}")
            println("Media : ${alumno.media()}")
            println("Aprobado : ${alumno.aprobado()}")
        }
}

fun main() {
    val a1 = Alumno("Gilipollas",listOf(8,1,2,10,7))

    val lista = listOf(a1)
    procesoAlumnos(lista)
}