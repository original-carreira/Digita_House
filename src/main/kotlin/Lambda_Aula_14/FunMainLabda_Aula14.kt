package Lambda_Aula_14
fun main(){
    val soma:(Int,Int) -> Int={a,b -> a +b}
    val subtrai:(Int,Int) -> Int={a,b -> a - b}
    val multiplica:(Int,Int) -> Int={a,b -> a * b}
    val divide:(Int,Int) -> Int={a,b -> a / b}

    val validaEmail: (String) -> Boolean ={ email:String -> "^([\\w\\-]+\\.)*[\\w\\- ]+@([\\w\\- ]+\\.)+([\\w\\-]{2,3})\$".toRegex().matches(email)}

    val multiplicaItensLista: (List<Int>) -> Int ={ lista:List<Int> -> lista.reduce(multiplica)}
    val somaItensLista: (List<Int>) -> Int ={ lista:List<Int> -> lista.reduce(soma)}
    val subtraiItensLista: (List<Int>) -> Int ={ lista:List<Int> -> lista.reduce(subtrai)}

    println(multiplicaItensLista(listOf(1,2,8,9)))
    println(somaItensLista(listOf(1,2,8,9)))
    println(subtraiItensLista(listOf(1,2,8,9)))


    println(validaEmail("carreira@marinha.com.br"))
    println(validaEmail("jorge_123@hotmail.com"))
    println(validaEmail("rodolfo-rodolfo.ig.com.br"))
    println(validaEmail("CARLOS123@ig.com.br"))

    println("Resultado da soma dos números é ${soma(10,5)}")
    println("Resultado da subtração dos números é ${subtrai(10,5)}")
    println("Resultado da multiplicação é  ${multiplica(10,5)}")
    println("Resulado da divisão dos númeors é ${divide(10,5)}")
}


