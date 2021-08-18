package Rev_Exe_002


fun main() {
    val itemFatura = Fatura(1, "cotonete", 12, 0.8)
    val itemFatura2 = Fatura(2,"escova",2,2.05)

    println(
        "O item ${itemFatura.descricaoItem} irá custar o total de ${
            itemFatura.totalDoITem(
                itemFatura.qtdItem,
                itemFatura.preçoUnit
            )
        }"
    )


}