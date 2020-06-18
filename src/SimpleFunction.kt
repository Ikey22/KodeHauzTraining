fun myMessage(){
    println("Hello People!!")
    println("How may we help you today? ")
}

fun displayInfo(vararg names:String){
    for (i in names){
        println(i)
    }
}

//fun addNumbers(message:String, x:Double, y:Double){
//    var sum = x + y
//    println("$message, $x plus $y = $sum")
//}

//fun addNum( x: Int =3, y: Int=5){
//    var sum = x + y
//    println("$x plus $y = $sum")
//}

fun returnNumber(message:String, x:Double, y:Double): Double{
    val sum = x + y
    return sum


}
fun main(){
    myMessage()
//    addNumbers("Chris", 2.0, 4.5)
//    addNum()
//    addNum(2,5)
//    addNum(8,6)
//    addNum(9,4 )

    var returnSum = returnNumber("Chris", 2.0, 4.8)
    println("returnSum is: $returnSum")

    returnSum = returnNumber("Chris", 2.1, 4.9)
    println("returnSum is: $returnSum")

    displayInfo(names = *arrayOf("ndin", "chris", "Ezinne", "ayo"))
}

/*
1. A function that returns hello world
   A function that reverses a string
   A function that returns the grater of three numbers

 */