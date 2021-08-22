package Interfaces_Aula_11

fun main(){
    val foto = Foto("casebre","Texto")
    val doc = Documento("oficio","pdf")
    val contrato = Contrato("trabalho","oficial")
    val impresso = Impressora()

    impresso.adicionar(foto)
    impresso.adicionar(doc)
    impresso.adicionar(contrato)
    impresso.imprimeTudo()

}