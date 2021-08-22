package Interfaces_Aula_11

class Impressora(){
    var listaImprimivel = mutableListOf<IImpressao>()

    fun adicionar(imprimivel:IImpressao){
        listaImprimivel.add(imprimivel)
    }
    fun imprimeTudo(){
        for (imprimivel in listaImprimivel)
           imprimivel.imprimir()
    }
}
//quando criar o objeto Impressora vai ter as funções de adicionar item na lista e imprimir a lista
// você vai chamar assim: "objetocriado".adicionar || "objetocriado".imprimeTudo