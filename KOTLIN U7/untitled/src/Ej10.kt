fun main() {
    var frase = "Hola soy Diego"
    var reverso = ""

    for (i in frase.length -1 downTo 0){
        reverso = reverso + frase[i]
    }
    print(reverso)
}