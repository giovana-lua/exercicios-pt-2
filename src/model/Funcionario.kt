package model

open class Funcionario (
    val nome: String,
    val salario: Double) {

     open fun verificarSalario(): Double {
        return salario + (salario * 0.2)
    }
}