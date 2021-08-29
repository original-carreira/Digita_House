package Functions_Aula_14

class Produto (var descricao:String,var preco:Double) {

    override fun toString(): String {
        return "$descricao - $preco"
    }
}