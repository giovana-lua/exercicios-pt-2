 fun main() {

  val numeros = 1..100

    for (numero in numeros )
        if ( numero % 3 == 0 &&  numero % 5 == 0)
            println(" $numero: Batata-Quente")
    else if ( numero % 3 == 0)
        println("$numero: Batata")
    else if (numero % 5 == 0)
        println("$numero: Quente")
    else
        println("x")


}