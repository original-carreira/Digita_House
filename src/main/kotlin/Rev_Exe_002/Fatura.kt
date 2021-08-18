package Rev_Exe_002

class Fatura(numFaturado: Int, descricaoItem: String, qtdItem: Int, precoUnit: Double) {
    var qtdItem = qtdItem
    var preçoUnit = precoUnit
    var descricaoItem = descricaoItem

    init {
        if (qtdItem > 0) {
            qtdItem == 0
        }
        if (precoUnit > 0) {
            precoUnit == 0.0
        }
    }

    fun totalDoITem(qtdItem: Int, precoUnit: Double): Double {
        return qtdItem * precoUnit
    }
    fun totalDaFatura(){

    }
}
