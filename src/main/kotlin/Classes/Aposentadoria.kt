package Classes

class Aposentado(
    var idade:Int,
    var sexo: Char,
    var contribuicao:Int){
    init {
        fun CalculaAposentadoria(idade: Int,sexo: Char,contribuicao: Int):Boolean{
            return sexo == 'F' && idade > 60 && contribuicao >= 30 || sexo == 'M' && idade >65 && contribuicao >= 30
        }
    }
}