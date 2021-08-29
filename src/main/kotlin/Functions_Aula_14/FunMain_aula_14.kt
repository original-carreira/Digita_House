package Functions_Aula_14

fun main(){

    val produto11 = Produto("Leite Moça",9.50)
    val produto12 = Produto("açucar",4.00)
    val produto13 = Produto("macarrão", 3.59)
    val produto14 = Produto("arroz",5.50)
    val produto15 = Produto("Óleo", 11.89)
    val listaProduto10 = Fornecedor()

    listaProduto10.addProduto(produto11)
    listaProduto10.addProduto(produto12)
    listaProduto10.addProduto(produto13)
    listaProduto10.addProduto(produto14)
    listaProduto10.addProduto(produto15)
    listaProduto10.entrar(produto14)
    listaProduto10.listarProdutos()




}