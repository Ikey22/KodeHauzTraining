//fun sum(num1: Int, num2:Int):Int{
//   var mySum = num1 + num2
//    return mySum
//}

val sum = {num1: Int, num2:Int ->
    num1 + num2
}

fun main(){
//    sum(1,2)
    val addNum = sum(1,2)
    println(addNum)

    println("List of numbers")

    val listOfNumbers = listOf(10,19,18,16)
    //normmal loop
    for (i in listOfNumbers){
        println(i)
    }

    listOfNumbers.forEach { i ->
        println(i)
    }
}