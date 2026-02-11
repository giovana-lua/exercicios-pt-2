import model.Funcionario
import model.Gerente

fun main() {
    val funcionarioComum = Funcionario("jose", 1500.0)
    val gerente = Gerente("roberto", 2000.0)

    println("funcionario ${funcionarioComum.verificarSalario()}")
    println("gerente ${gerente.verificarSalario()}")
}