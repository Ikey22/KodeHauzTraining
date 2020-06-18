
fun main(){

    addNum(3,7,9)

}

fun addNum( x: Int, y: Int){
    var sum = x + y
    println("$x plus $y = $sum")
}
fun addNum(x:Int, y:Int, z: Int){
    var sum = x + y + z
    println("$x plus $y plus $z= $sum")
}
fun addNum(x: Int, y:Int, z: Double) {
    var sum = x+y+z
//    sum.toDouble()
    println("$x plus $y plus $z= $sum")
}