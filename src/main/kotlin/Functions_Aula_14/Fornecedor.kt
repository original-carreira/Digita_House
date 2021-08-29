package Functions_Aula_14

class Fornecedor {
    var listaProdutos = mutableListOf<Produto>()
    fun addProduto(produto: Produto){
        listaProdutos.add(produto)
    }
    fun listarProdutos(){

        /*var d =listaProdutos.joinToString("|") // coloca um separador e ordena em uma única linha
        println(d)
        */

        /*val sb = StringBuilder()        //preciso de mais exercícios pra enterder StringBuilder
        for (elemento in listaProdutos) {
            sb.append(elemento).append(", ")
        }
        val c = sb.toString().substring(0, sb.length - 2)
        println(c)
        */

        /*var lista = listaProdutos
        for (i in lista){
            println(i.toString())
        }
        */

        //println(listaProdutos.joinToString(" | ")) // resultado em única linha usando um separador!

        //listaProdutos.forEach { System.out.print(it.toString()) } ***Essa aqui não separa os itens!!!!
        listaProdutos.forEach { item -> print("$item ,") } //precisa melhorar a separação dos itens
        //listaProdutos.forEach(System.out::print) // o mesmo da anterior....
        //listaProdutos.onEach { println(it) } // faz uma lista item por linha.
        //listaProdutos.forEachIndexed { index, produto -> println("posição $index contem $produto") } // Aqui imprime um item por linha informando o index do item

    /*forEach e forEachIndexed: Iteram sobre cada um dos elementos,
        aplicando-se uma função. o forEachIndexed recebe, além do elemento,
        qual é a posição da lista em que ele se encontra.
        Essas funções atuam como substituidoras do for convencional.
         */
    }

    fun entrar(produto: Produto){
        println("Descrição item ${produto.descricao} com preço: ${produto.preco}")
    }

    override fun toString(): String {
        return listaProdutos.joinToString (" | ")
    }
}