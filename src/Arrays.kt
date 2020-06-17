fun main(){

//    println("Pets App")
//    val pet1 = readLine()!!.toString()
//    val pet2 = readLine()!!.toString()
//    val pet3 = readLine()!!.toString()
//
//    println("Your pets are: ")
//    println("Pet1: $pet1")
//    println("Pet2: $pet2")
//    println("Pet3: $pet3")
//
//    //Writing in array
//    var listOfPets  = Array(3, {""})
//        for(i in 0..2){
//            listOfPets[i] = readLine()!!.toString()
//        }
//    println("Your pets are: ")
//    for (i in 0..2){
//        println("Pet $i: ${listOfPets[i]}")
//    }

//    val maxSize = 5
//    var listOfPet  = Array(maxSize){""}
////    for (i in 0 until maxSize)
//    for(i in 0..maxSize-1){
//        listOfPet[i] = readLine()!!.toString()
//    }
//    println("Your pets are: ")
//    for (i in 0..maxSize-1){
//        println("Pet $i: ${listOfPet[i]}")
//    }

    println("Enter number of pets: ")
    val maxSize = readLine()!!.toInt()
    var listOfPet  = Array(maxSize){""}
//    for (i in 0 until maxSize)
    for(i in 0 until maxSize){
        println("Enter Pet name : $i: ")
        listOfPet[i] = readLine()!!.toString()
    }
    println("Your pets are: ")
    for (i in 0 until maxSize){
        println("Pet $i: ${listOfPet[i]}")
    }

}