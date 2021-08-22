package Interfaces_Aula_11

class Documento(override var nome: String, override var tipoDocumento: String) : IImpressao {
    override fun imprimir() {
        println("eu sou um documento word")
    }
}