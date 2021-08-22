package Visibilidade_Heranca

import java.util.function.DoubleToIntFunction
import kotlin.contracts.Returns

open class Conta(var numeroConta:Long, var saldoConta: Double = 0.0, cliente: Cliente) {
    fun fazerDeposito(valorDeposito:Double):Unit{
        saldoConta = saldoConta + valorDeposito
    }

    fun consultaSaldo(saldoConta: Double): Double {
        return saldoConta
    }

    open fun sacarDinheiro(saldoConta: Double,valorSaque:Double): Double {
        if (valorSaque > saldoConta && saldoConta > 0.0){
            var valorSaqueAut = saldoConta - valorSaque
            return valorSaqueAut
        }else if (valorSaque === saldoConta && saldoConta > 0.0){
            var valorSaqueAut = saldoConta
        }else {
            println("Voce não possui saldo suficiente")
        }
        return saldoConta
    }
}