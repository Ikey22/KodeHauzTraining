import java.util.*

fun main() {
    println("Enter number of pets: ")

    var listOfPet = LinkedList<String>()

    do {
        println("Enter prt name or exit to quit: ")
        val petName = readLine()!!.toString()
        if (petName != "quit") {
            listOfPet.add(petName)
        }
    } while (petName != "quit")

//    for (i in 0 until maxSize){
    for (i in 0 until listOfPet.size) {
        println("Enter Pet name : $i: ")
        listOfPet.add(readLine()!!.toString())
//        listOfPet[i] = readLine()!!.toString()
//    }
        println("Your pets are, using Index: ")
        for (i in 0 until listOfPet.size) {
            println("Pet $i: ${listOfPet[i]}")
        }

        println("Your pets are, using Object: ")
        for (pet in listOfPet) {
            println("Pet $pet")
        }


    }
}