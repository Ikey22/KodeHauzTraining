fun main(){

    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()
    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()

    val sum = num1 + num2
    println("Sum: $sum")

    val mul = num1 * num2
    println("Mul: $mul")

    val div = num2 / num1
    println("Dice; $div")
}