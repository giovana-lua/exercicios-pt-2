import model.ContaBancaria

fun main() {

    val contaBancaria = ContaBancaria( "maria")

    println("${contaBancaria.nomeTitular}")

    contaBancaria.depositar(200.0)
    contaBancaria.sacar(50.0)

    val saldo = contaBancaria.consultarSaldo()

    println("Seu saldo é de $saldo reais!")
}