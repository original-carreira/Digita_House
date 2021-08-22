package Visibilidade_Heranca

class contaPoupanca(var rendaContaJuros:Double, numeroConta: Long,saldoConta:Double,cliente: Cliente):Conta(numeroConta,saldoConta,cliente) {
    fun recolheJuros():Double{
        val redimentoDaConta = saldoConta * (rendaContaJuros / 100)
        saldoConta =+ redimentoDaConta
        return redimentoDaConta
    }
}