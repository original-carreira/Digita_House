package Classes

class Aposentado(
    var idade:Int,
    var sexo: Char,
    var contribuicao:Int){
    fun CalculaAposentadoria():Boolean{
            return sexo == 'F' && idade >= 60 && contribuicao >= 30 || sexo == 'M' && idade >= 65 && contribuicao >= 30
        }
    }
