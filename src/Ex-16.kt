fun main() {
    val numero = 5

    // long armazena valores grandes, atribuindo o valor inicial a 1
    var resultado: Long = 1

 for (n in 1..numero)
     //pegando o valor atual e multiplicando por n com o novo valor
    resultado *= n

    println( "O fatorial de $numero é: $resultado!")

}