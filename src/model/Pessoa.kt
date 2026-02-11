package model

class Pessoa {

    var nome: String = ""
    var idade: Int = 0
    var cidade: String = ""

    fun apresentar () {
        println( "$nome tem $idade anos e mora em $cidade!")
    }
}