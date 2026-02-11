package model

class ContaBancaria (val nomeTitular: String){

    private var saldo: Double = 0.0

    fun depositar (deposito: Double) {
        saldo += deposito

        println("foram depositados $deposito na conta")
    }

    fun sacar (saque: Double) {
        saldo -= saque

        println("foram depositados $saque na conta")
    }

    fun consultarSaldo ()  :Double{
       return saldo
    }

}