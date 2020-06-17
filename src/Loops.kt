fun main() {

//    println("Ab")
//    println("Ab")
//    println("Ab")
//    println("Ab")
//    println("Ab")
//    println("Ab")
//    println("For Loop")
//    for (i in 1..6){
//        println("Ab")
//    }

//    val names = listOf<String>("Anita", "Chris", "Daniel")
//    for (i in names) println(names)

//    for (i in 0 until 10 step 2) {
//        println(i)
//    }
//    println("For Loop")
//    for (i in 1..10 step 2) {
//        println("Counter: $i")
//    }
//
//    println("While Loop")
//    var i = 1
//    while (i<=10){
//        println("Counter: $i")
//        i+=2
//    }
//
//    println("Do While Loop")
//    i=1
//    do {
//        println("Counter: $i")
//        i+=2
//    }while (i<=10)

    //Nested loops
//    for (i in 1..2){
//        println("Enter your name: ")
//        val name = readLine()!!.toString()
//        println("Location: ")
//        val location = readLine()!!.toString()
//        var petName: String? = null
//        var petName: String? = ""
//
//        for(PetId in 1..2){
//            println("Enter Pet $PetId")
//            petName += readLine()!!.toString() + ", "
//        }
//        println("name: $name")
//        println("Location: $location")
//        println("PetName: $petName")
//        if(petName!!.contains("Dog", true)){
//            println("We have a program for you dog")
//        }
//    }

    //Break and Contunue
//
//    println("Continue Example")
//    for (number in 1..10){
//        if (number==4){
//            continue
//        }
//        println(number)
//    }

    println("Break Example")
   loop@ for (number in 1..10){
        println("Number: $number")
        for (innerloop in 1..7){
            println("Inner loop: $innerloop")
            if (innerloop==4){
                break@loop
            }
        }

        println(number)
    }
    println("The end")
}