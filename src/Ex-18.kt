import model.Produto

fun main() {


    val produtos =  arrayOf(Produto("celular", 200.0),
                    Produto("pc", 300.0),
                    Produto("mouse", 20.0))





   var produtoMaiorValor = produtos [0]

    for (produto in produtos) {
        if (produtoMaiorValor.preco < produto.preco) {
            produtoMaiorValor = produto
        }
    }

    println("${produtoMaiorValor.preco} ")

}