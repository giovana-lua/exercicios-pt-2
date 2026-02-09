fun main() {
    var numeros = listOf(1,21,34,46,78,29,32,66,93,81,45)

    val impares  = numeros.filter{ it % 2 !== 0 }

    println(impares)
}