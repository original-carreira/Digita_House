package Lambda_Aula_14

fun main(){
    val produto11 = Produto("arroz","6,50")
    val produto12 = Produto("feijão","10,50")
    val produto13 = Produto("macarrão","3,59")
    val fornecedor1 = Fornecedor()

    fornecedor1.entrar(produto12)
    fornecedor1.entrar(produto11)
    fornecedor1.listaProduto()

}