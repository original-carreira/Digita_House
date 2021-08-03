fun main(){
    print(ImprimePares())
}

fun ImprimePares ():String{
    var num:Int = 0
    for (num in 1..100){
        if (num % 2 == 0){
            println("$num ")
        }
    }
    return "fim do código"
}

/*fun ImprimePares ():Int{
    for (num in 1..100){
        if (num % 2 == 0){
            println("$num ")
        }
    }
    return 0
}*/
