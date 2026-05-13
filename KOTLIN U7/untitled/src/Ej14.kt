class Ej14 (
    val nombre : String,
    val edad : Int
) {
    fun jubilacion (edad : Int): Int{
        if (edad < 65){
            return 65 - edad
        }else{
            return 0
        }
    }
}

fun main() {
    val ejemplo = Ej14("Cucaracho",12)
    println("Le quedan ${ejemplo.jubilacion(ejemplo.edad)} años a ${ejemplo.nombre}")
}