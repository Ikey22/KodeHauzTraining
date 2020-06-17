fun main(){

    val message = " Welcome to Kodehauz"
    val name = "Chris"
    val allMessage = "$name, $message"
//    println(message)
//    println(allMessage[1])
//
//    println(allMessage.toLowerCase())
//    println(allMessage.toUpperCase())
//    println(message.trim())

    val tokens = message.trim().split(" ")
    for (token in tokens){
        if (!token.contains("to") && !token.contains("is"))
            println(token)
    }
}