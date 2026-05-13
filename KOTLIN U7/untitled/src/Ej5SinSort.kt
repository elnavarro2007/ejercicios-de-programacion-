fun main() {
    var num = intArrayOf(1,4,7,8,10,12,200,198)


    for (i in 0 until num.size - 1) {
        for (j in 0 until num.size - i - 1) {
            // Comparar elementos adyacentes
            if (num[j] > num[j + 1]) {
                // Intercambiar si están en el orden incorrecto
                val temp = num[j]
                num[j] = num[j + 1]
                num[j + 1] = temp
            }
        }
    }
    for (i in 0..num.size -1 ){
        print(" "+num[i] +" ")
    }
    print("El segundo numero mas grande es ${num[num.size - 2] }")

}