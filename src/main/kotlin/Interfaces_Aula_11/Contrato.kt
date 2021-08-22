package Interfaces_Aula_11

class Contrato(override var nome: String, override var tipoDocumento: String) :IImpressao {
    override fun imprimir() {
        println("Eu sou um contrato muito legal")
    }
}