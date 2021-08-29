import Functions_Aula_14.Produto

//var listaExemplo = mutableListOf<Produto>()
/*fun addProduto(produto: Produto){
    listaExemplo.add(produto)
}*/
//fun listarOsExemplos(){

    /*var d =listaExemplo.joinToString("|") // coloca um separador e ordena em uma única linha
    println(d) */

    /*val sb = StringBuilder()        //preciso de mais exercícios pra enterder StringBuilder
    for (elemento in listaExemplo) {
        sb.append(elemento).append(", ")
    }
    val c = sb.toString().substring(0, sb.length - 2)
    println(c)
    */

    /*var lista = listaExemplo
    for (i in lista){
        println(i.toString())
    }
    */

    //println(listaExemplo.joinToString(" | ")) // resultado em única linha usando um separador!

    //listaExemplo.forEach { System.out.print(it.toString()) } ***Essa aqui não separa os itens!!!!
    //listaExemplo.forEach { item -> print("$item ,") } //precisa melhorar a separação dos itens
    //listaExemplo.forEach(System.out::print) // o mesmo da anterior....
    //listaExemplo.onEach { println(it) } // faz uma lista item por linha.
    //listaExemplo.forEachIndexed { index, produto -> println("posição $index contem $produto") } // Aqui imprime um item por linha informando o index do item

    /*forEach e forEachIndexed: Iteram sobre cada um dos elementos,
        aplicando-se uma função. o forEachIndexed recebe, além do elemento,
        qual é a posição da lista em que ele se encontra.
        Essas funções atuam como substituidoras do for convencional.
         */
}