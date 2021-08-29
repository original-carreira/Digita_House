package Functions_Aula_15

fun main(){
    dataDaCompra()
    val sal = Produto("Sal Marinho",1.29)
    val macarrao = Produto("Macarrão",3.89)
    val feijao = Produto("Fijão fradinho",11.89)
    val acucar = Produto("Açucar cristal",4.78)
    val azeite = Produto("Azeite de Oliva", 19.99)

    val adiciona = CarrinhoDeCompras()
    val caixa = Caixa()

    adiciona.addListaCarrinho(sal)
    adiciona.addListaCarrinho(macarrao)
    adiciona.addListaCarrinho(feijao)
    adiciona.addListaCarrinho(azeite)
    adiciona.addListaCarrinho(acucar)

    caixa.fechamentoDeConta(cabecalhoDoComprovante(),
        dataCompra = dataDaCompra(),
        listaCarrinho = adiciona.listaCarrinho,
        imprimeListaCompra = imprimeListaCompra(adiciona.listaCarrinho),
        adicionaRodape = adicionaRodape(adiciona.listaCarrinho))

}