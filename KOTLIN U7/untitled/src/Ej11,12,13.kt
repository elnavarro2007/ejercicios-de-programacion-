data class Ej11(
    val nombre: String,
    val precio: Double,
    val stock: Int


)

fun main() {
    val p = listOf(
        Ej11("pene", 1.99, 20),
        Ej11("pene", 1.99, -1)
    )

    val disponible = p.filter { it.stock > 0 }
    println(disponible)
    val suma = p.filter { it.stock >0 }  .sumOf { it.precio  }
    println(suma)
}
