fun main(){

    var listOfUsers = HashMap<Int, String>()
    listOfUsers[123] = "Chris"
    listOfUsers[456] = "Charles"
    listOfUsers[789] = "Ezinne"

    println("Print ID 123: ${listOfUsers[123]}")
    for(key in listOfUsers.keys){
        println("$key: ${listOfUsers[key]}")
    }
}