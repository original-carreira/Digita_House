package Revisao_Aula_13

open abstract class ContaBancaria (var numeroConta:Long,var saldoContaBancaria:Double = 0.0) {

    open abstract fun fazerDeposito (valorDeposito:Double)

    open abstract fun transferir()

    open abstract fun sacarDinheiro(valorSaque: Double)

}