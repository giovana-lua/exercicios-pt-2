fun main() {
    val preco = listOf(10.0, 20.0, 20.0, 29.90)

    var somaCompra = 0.0

    for (numero in preco) {
        somaCompra += numero
    }
    println(somaCompra)
}