fun main(){
    println(imprimeNunPositvo())
}

fun imprimeNunPositvo(){
    for (num in 0..100){
        var result: Int = if (num > 0) num else 0
        println(result)
    }
}

