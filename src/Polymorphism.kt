
fun showInfo(cardId:Int) {
 println("CardID: $cardId")
}

fun showInfo(name:String){
    println("Name: $name")
}

fun main(){
    showInfo(name = "Chris")
    showInfo("Chris")
    showInfo(1234)
}