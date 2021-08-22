package Lambda_Aula_14

class Fornecedor {
    var produtosLista = mutableListOf<Produto>()

    fun entrar(produto: Produto){
        produtosLista.add(produto)
    }

    fun listaProduto() {
        for (imprimive in produtosLista) {
            println("Sua lista de produtos: ${imprimive.descricao}, preço:${imprimive.preco}")
        }
    }

    fun menu(){}
}

