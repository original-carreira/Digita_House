package Exercicios

fun main(){
    val victor = DataPessoa("victor",39)
    val douglas = victor

    println("São a mesma pessoa victor e douglas?")
    if (victor===douglas){
        println("Sim, são a mesma pessoa - mesmo local de memoria")
    }else{
        println("não são a mesma pessoa - o validador verifica o local de memória diferente")
    }

    println("**********************\n*******************")
    println("São a mesma pessoa victor e douglas?")
    if (victor==douglas){
        println("Sim, são a mesma pessoa -mesmo local de memória")
    }else{
        println("Não são a mesma pessoa - o validador não verifica se estão apontando para o mesmo local de memória")
    }
    println(victor==douglas)
    println(victor===douglas)
    println(victor.nomePessoa.equals(douglas.nomePessoa))

    println("&&&&&&&&&&&&&&&")

    val x = 10
    val y = 10
    println("O numero 10 da variavel X é igual ao numero 10 da variavel Y?")
    if (x === y) {
        println("Sim, pois estão apontando para o mesmo local de memória")
    } else {
        println("Não, pois não estão apontando para o mesmo local da memória e o validador === verifica isso =D")
    }

    println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%")
    val geovani1 = DataPessoa("Geovani", 22)
    val geovani2 = DataPessoa("Geovani", 22)

    println("São Geovani1 e Geovani2, as mesmas pessoas?")
    if (geovani1 == geovani2) {
        println("Sim, pois a validação do Equals está comparando atributos")
    } else {
        println(
            """
            Não, pois a validação do Equals não está comparando atributos
            O Compilador faz com que os objetos se tornem diferentes devido a posição da memória em que cada um está
            Para ter o resultado esperado, é necessário sobrescrever a função Equals ou usar uma Data Class
        """.trimIndent()
        )
    }

}