package com.Greet.people

class Greeter {

    var text: String = ""
//    fun greet(){
//        println("Hello object world")
//    }
//    fun greet(name : String){
//    println("Hi $name")

    //}
    fun greet(name: String): String {
//       return name
        return "$text $name"
    }
}