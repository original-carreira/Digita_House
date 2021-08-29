package Collections_Aula16

fun main(){
    val dictionary = mapOf("ovos" to  0,"aguia" to 1,"escopeta" to 2,"Cavalo" to 3,"dentista" to 4,"fogo" to 5)

    if ("ovos" in dictionary) println("Value by key \"ovos\": ${dictionary["ovos"]}")
    if ("aguia" in dictionary) println("O valor da chave \"aguia\":${dictionary["aguia"]}")
    if (2 in dictionary.values) println("O valor 1 está no dicionário")
    if (dictionary.containsValue(2)) println("O valor 2 istá no dicionário")
    if (dictionary.containsKey("escopeta")) println("A chave \"aguia\" está no dicionario")
    if (dictionary.containsKey("ovos")) println(" O valo da chave \"ovos\": ${dictionary["ovos"]}")

    println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$")

    val joao = listOf("Juan","El divino","Maromba","Zé bonitinho")
    val miguel = listOf("Dark Knight","Bruce","Ventania")
    val maria = listOf("Ju","Mary","Ventania")
    val lucas = listOf("Lukinha","Jorge","Geroge","Flynn")
    val apelidos = mapOf("João" to joao,"Miguel" to miguel,"Maria" to maria,"Lucas" to lucas)

    println("todas as chaves: ${apelidos.keys}")
    println("todos os valores ${apelidos.values}")
    if (apelidos.containsKey("João")) println("A chave \"João\" está no dicionário com o valor: ${apelidos["João"]}")
    if (apelidos.containsValue(miguel)) println("O valor \"miguel\" possui a chave: ${"Miguel"}")
    if (maria in apelidos.values) println("$maria" + "${apelidos["Maria"]}"  + apelidos.entries)
    println(apelidos.equals(joao == maria))

}

