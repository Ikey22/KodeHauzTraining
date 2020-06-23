package com.Greet.people

fun main(){

    val greeter = Greeter()
    greeter.text = "Hi"
//    greeter.greet("Chris")
    println(greeter.greet("Chris"))

}