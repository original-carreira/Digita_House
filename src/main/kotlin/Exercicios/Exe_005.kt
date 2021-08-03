fun main(){
    println(comparaNum(100,20,30,5))
}

fun comparaNum(numA:Int,numB:Int,numC:Int,numD:Int):Boolean{
    return (numA > numC && numA > numD) || (numB > numC && numB > numD)
}

/* versão inicial do código, antes da verificação de redundância do IF.
fun comparaNum(numA:Int,numB:Int,numC:Int,numD:Int):Boolean{
    if ((numA > numC && numA > numD) || (numB > numC && numB > numD) ){
        return true
        } else {
            return false
    }
}
 */