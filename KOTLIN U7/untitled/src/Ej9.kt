fun main() {
    var lista = listOf("Sacarina","Pene", "Pene", "Hojaldre","Pistacho", "Pistacho")
    print(eliminarDuplicados(lista))
}
fun eliminarDuplicados (lista : List<String>) : List<String> {
    var listaCopia = mutableListOf<String>()

    for (item in lista) {
        if (item !in listaCopia) {
            listaCopia.add(item)
        }
    }

    return listaCopia

}