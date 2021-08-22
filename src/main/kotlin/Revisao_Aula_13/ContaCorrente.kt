package Revisao_Aula_13

class ContaCorrente(numeroConta: Long, saldoContaBancaria: Double,TaxaDeOperacao:Double = 0.25) : ContaBancaria(numeroConta,saldoContaBancaria),IImprimivel {
    override fun fazerDeposito(valorDeposito: Double) {
        TODO("Not yet implemented")
    }

    override fun transferir() {
        TODO("Not yet implemented")
    }

    override fun sacarDinheiro(valorSaque: Double) {
        TODO("Not yet implemented")
    }

    override fun mostrarDados() {
        println("Seus dados são: Numero da conta: ${this.numeroConta} e saldo da conta: R$ ${this.saldoContaBancaria}")
    }

}