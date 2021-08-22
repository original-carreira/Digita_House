package Dataclass_Aula_12

class PessoaNew(var nome:String,var cpf:Int) {
    override fun toString(): String {
        return "Seu nome é $nome e seu CPF tem o número $cpf"
    }

    override fun hashCode(): Int {
        return this.cpf
    }
}