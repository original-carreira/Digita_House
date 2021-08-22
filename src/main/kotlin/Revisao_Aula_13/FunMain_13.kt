package Revisao_Aula_13

fun main(){
    val conta1 = ContaCorrente(123,10.0)
    val relatori1 = Relatorio()

    println(conta1.mostrarDados())
    println(relatori1.gerarRelatorio(conta1))
}