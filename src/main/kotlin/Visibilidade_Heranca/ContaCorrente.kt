package Visibilidade_Heranca

class ContaCorrente(var limiteconta: Double, numeroConta: Long,saldoConta: Double, cliente: Cliente):Conta(numeroConta,saldoConta,cliente) {
    override fun sacarDinheiro(saldoConta: Double,valorSaque:Double): Double {
        if (valorSaque > saldoConta || saldoConta >= limiteconta){
            var valorSaqueAut = (saldoConta + limiteconta) - valorSaque
            return valorSaqueAut
        }else if (valorSaque === saldoConta || saldoConta == limiteconta){
            var valorSaqueAut = saldoConta
        }else {
            println("Voce não possui saldo suficiente")
        }
        return saldoConta
    }


    fun chequeDeposito(cheque:Cheque):Double{
        return cheque.valor
    }

}