package Functions_Aula_15

class Produto(var nome:String,var preco:Double) {

    override fun toString(): String {
        return "Produto: $nome - preço: $preco"
    }
}