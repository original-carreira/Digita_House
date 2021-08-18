fun main (){
    print(analisaNumeros(10,30,20))
}

/*fun analisaNumeros (a: Int,b: Int,c: Int): Int{
    if (a > b && a > c){
        return a
    }
    else if (b > a && b > c){
        return b
    }
    else {
        return c
    }
}*/

fun analisaNumeros (a:Int,b:Int,c:Int): Int{
    if(a > b){
        if(a > c){
            return a
        } else {
            return c
        }
    }
    else if(b > c){
        if(b > c){
            return b
        } else {
            return c
        }
    }else {return c}
}