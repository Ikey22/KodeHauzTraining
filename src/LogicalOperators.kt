fun main(){
    val a = 10
    val b = 9
    val c = -1
    var result: Boolean

    result = (a>b) && (a<c)
    println(result)
    result = (a>b) || (a<c)
    println(result)

    val x = 171
    val y = 3
    val z = x.or(y)
    val t = x.and(y)

    println("result is $z")
    println("result is $t")


}