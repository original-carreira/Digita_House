package Classes

class ListaNumeros (var lista:List<Int> = emptyList()){

    fun produto(){
        val numerosLista = lista
        var numeroUm = lista.first()
        for (item in numerosLista){
            numeroUm = lista[item] * numeroUm
            println(numeroUm)
            //println(item * lista[item])
        }
    }
}

fun main(){
    val teste = ListaNumeros(listOf(1,2,3,4,5))
    teste.produto()
}