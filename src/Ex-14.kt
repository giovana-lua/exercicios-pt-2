fun main() {
    val numeros = listOf(10.0, 20.0, 20.0, 29.90)

    var somaCompra = 0.0

    for (numero in numeros) {
        somaCompra += numero
    }
    println(somaCompra)
}