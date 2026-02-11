fun main() {
    val idade = listOf(12,18,3,24,5,10,19)

        val filtrado = idade.filter { it >= 18}

    var soma = 0.0
    var quantidade = 0


    for ( n in filtrado) {
        soma += n
        quantidade ++
    }

   if (quantidade > 0) {
       val media = soma / quantidade
       println("Média $media")
   }else {
       println("Nenhum número foi encontrado")
   }
}