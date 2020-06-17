fun main(){

    var listImmutable = listOf("Chris", "Ezinne")
//    list[0] = "Charles
    for(name in listImmutable){
        println(name)
    }

    var listMutable = mutableListOf("Chris", "Ezinne")
    listMutable[0] = "Charles"
    for(name in listMutable){
        println(name)
    }

    var listfUserI = mapOf(1 to "Chris", 2 to "Ezinne")
    println(listfUserI[1])

    var listfUserM = mutableMapOf(1 to "Chris", 2 to "Ezinne")
    println(listfUserM[2])

}