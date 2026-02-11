package model

class Gerente(nome: String, salario: Double): Funcionario(nome, salario) {

    override fun verificarSalario(): Double {
        return salario + (salario * 0.2)
    }

}