fun main() {
<<<<<<< HEAD
    var idade = listOf(12,18,3,24,5,10,19,8)

    val filtrado = idade.filter { it >= 18}
=======
    val idade = listOf(12,18,3,24,5,10,19)

        val filtrado = idade.filter { it >= 18}
>>>>>>> 4fa59bc2c47774b1c00eddc64bfa35a25257690a

    var soma = 0.0
    var quantidade = 0


    for ( n in filtrado) {
        soma += n
        quantidade ++
    }

<<<<<<< HEAD
    if (quantidade > 0) {
        val media = soma / quantidade
        println("Média: $media")
    }else {
        println("Nenhum número foi encontrado")
    }
    //averege
=======
   if (quantidade > 0) {
       val media = soma / quantidade
       println("Média $media")
   }else {
       println("Nenhum número foi encontrado")
   }
>>>>>>> 4fa59bc2c47774b1c00eddc64bfa35a25257690a
}