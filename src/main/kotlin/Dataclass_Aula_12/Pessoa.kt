package Dataclass_Aula_12

data class Pessoa(var nome:String,var rg:Int){
    override fun toString(): String {
        return "Seu Registro é $rg e seu nome é $nome"
    }
    //ou pode ser assim(função top level: overrride fun toString():String = "Seu Registro é $rg e seu nome é $nome"

    override fun equals(other: Any?): Boolean {
        return (other is Pessoa && other.rg == this.rg)
    }

    override fun hashCode(): Int {
        return this.rg
    }

}