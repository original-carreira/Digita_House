package Interfaces_Aula_11

class Foto(override var nome: String, override var tipoDocumento: String) :IImpressao {
    override fun imprimir() {
        println("Eu sou uma selfie")
    }
}