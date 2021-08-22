package Dataclass_Aula_12

class CocaCola(var tamanho:Int,var preco:Double) {

    override fun equals(other: Any?): Boolean {
        return (other is CocaCola && other.tamanho == this.tamanho)
    }

    override fun toString(): String {
        return "Seu produto tem o tamanho de $tamanho e tem o preço de R$ $preco"
    }

    override fun hashCode(): Int {
        return this.tamanho
    }
}