fun main() {
    print(binario(13))
}
fun binario (num : Int) : String {
    var concatenar = ""
    var n = num
    while (n > 0){
        var resto = n % 2
        concatenar = resto.toString() + concatenar
        n /=  2
    }
    return concatenar

}