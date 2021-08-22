package Dataclass_Aula_12

fun main(){

    val persona = PessoaNew("victor",963852)
    val persona1 = PessoaNew ("Douglas", 852741)

    print("*****************\n")
    println(persona)
    println(persona===persona1)

    /*val refri1 =CocaCola(2,8.50)
    val refri2 =CocaCola(1,5.80)
    val refri3 =CocaCola(3,6.5)

  println(refri2==refri1)
  println(refri3.hashCode())
  println(refri3.preco == refri2.preco)
  println(refri1)
  println(refri3)
    println(refri3!==refri1)
    println(refri3===refri1)
*/

    /*
    val pessoa1 = Pessoa("victor",1234567)
    val pessoa2 = Pessoa("Cossaco",1234568)
    val pessoa3 = Pessoa("raimundo",7894569)
    val pessoa4 = Pessoa("raimundo",1234560)

***aqui foi usada a função padrão do equals***
    println(pessoa1!=pessoa2) //retorna true porque compara os dois atributos
    println(pessoa1==pessoa2) //retorna false porque compara os dois atributos
    println(pessoa1.equals(pessoa2)) // modo correto de usar o equals - retorna false por que compara as duas propriedades.
    println(pessoa1.rg.equals(pessoa2.rg))// retorna true
    println(pessoa1.nome.equals(pessoa2.nome))//retorna false*/

/*aqui é usada a função sobrescrita do esquals

    println(pessoa1!=pessoa2) // retorna false por que está cmparando apenas o atributo rg
    println(pessoa1==pessoa2)
    println(pessoa1.equals(pessoa2))//retorna true
    println(pessoa1.nome.equals(pessoa2.nome))//retorna false porque compara o atributo nome
    println("**********")
    println(pessoa3==pessoa4)
    println(pessoa3.nome==pessoa4.nome)
    println(pessoa4.equals(pessoa2))

    print(*****)

    println(pessoa2)
    println(pessoa1.hashCode())

 */


}