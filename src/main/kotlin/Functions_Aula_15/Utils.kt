package Functions_Aula_15

import java.text.SimpleDateFormat
import java.util.*

fun cabecalhoDoComprovante(){
    println("############################# Meu Supermercado #############################")
}

fun dataDaCompra (){
    val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
    val dataCorrente = sdf.format(Date())
    System.out.println(dataCorrente)
}
fun imprimeListaCompra(list: ArrayList<Produto>){
    println(list.forEach { System.out.print(it.toString()) })
    //println(list.forEach { item -> print("$item ,")})
    //list.onEach { println(it)}
}
fun adicionaRodape(list: ArrayList<Produto>){
    var total = 0.0
    list.forEach{ (+ it.preco).also { total = it } }

}