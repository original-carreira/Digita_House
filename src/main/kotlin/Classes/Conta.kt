package Classes

class Conta(numeroConta:Int, saldo: Double, titular: String) {
    fun deposito(quantiaEntrada: Int, saldo: Double): Double {
        return quantiaEntrada + saldo
        }
    fun saque(quantiaSaida:Float,saldo: Float): Float {
        return saldo - quantiaSaida
    }
}
