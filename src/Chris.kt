//fun main (){
//    println("You are about to check your result.")
//    println("Input Your Name Below: ")
//    val name = readLine()!!.toString()
//    println("Input Your Reg num Below")
//    val regNum = readLine()!!.toInt()
//    println("To know your grade, input your score below")
//    val score = readLine()!!.toInt()
//    if (score == 0) {
//        println("Dear $name with registration number $regNum\n --------You failed so badly. Hence you are expelled!--------")
//    }
//    if (score in 1..39) {
//        println("Dear $name with registration number $regNum\n --------Your grade is F9; Failed--------")
//    }
//    if (score in 40..44) {
//        println("Dear $name with registration number $regNum\n --------Your grade is E8; Passed--------")
//    }
//    if (score in 45..49) {
//        println("Dear $name with registration number $regNum\n --------Your grade is D7; Passed--------")
//    }
//    if (score in 50..54) {
//        println("Dear $name with registration number $regNum\n --------Your grade is C6; Credit--------")
//    }
//    if (score in 55..59) {
//        println("Dear $name with registration number $regNum\n --------Your grade is C5; Credit--------")
//    }
//    if (score in 60..64) {
//        println("Dear $name with registration number $regNum\n --------Your grade is C4; Credit--------")
//    }
//    if (score in 65..69) {
//        println("Dear $name with registration number $regNum\n --------Your grade is B3; Good--------")
//    }
//    if (score in 70..79) {
//        println("\nDear $name with registration number $regNum\n --------Your grade is B2; Very Good!--------")
//    }
//    if (score in 80..100) {
//        if (score >= 90){
//            println("Dear $name with registration number $regNum\n ********Your grade is A1; You are Phenomenal!!********")
//        }
//        else println("Dear $name with registration number $regNum\n ********Your grade is A1; Excellent********")
//    }
//    else{
//        println("Invalid score")
//    }
//
//}
//fun main () {
//
//    println("You are about to check your result.")
//    println("Input Your Name Below")
//    val name = readLine()!!.toString()
//    println("Input Your Reg num Below")
//    val regNum = readLine()!!
//    println("To know your grade, input your score below")
//    val score = readLine()!!.toDouble()
//
//        when {
//            score == 0.0 -> println("\nDear $name with registration number $regNum\n --------You failed so badly. Hence you are expelled!--------")
//            score in 1..39 -> println("\nDear $name with registration number $regNum\n --------Your grade is F9; Failed--------")
//            score in 40..44 -> println("\nDear $name with registration number $regNum\n --------Your grade is E8; Passed--------")
//            score in 45..49 -> println("\nDear $name with registration number $regNum\n --------Your grade is D7; Passed--------")
//            score in 50..54 -> println("\nDear $name with registration number $regNum\n --------Your grade is C6; Credit--------")
//            score in 55..59 -> println("\nDear $name with registration number $regNum\n --------Your grade is C5; Credit--------")
//            score in 60..64 -> println("\nDear $name with registration number $regNum\n --------Your grade is C4; Credit--------")
//            score in 65..69 -> println("\nDear $name with registration number $regNum\n --------Your grade is B3; Good--------")
//            score in 70..79 -> println("\nDear $name with registration number $regNum\n --------Your grade is B2; Very Good!--------")
//            score in 80..100 -> { if (score >= 90)
//            { println("Dear $name with registration number $regNum\n ********Your grade is A1; You are Phenomenal!!********")
//        }
//        else println("Dear $name with registration number $regNum\n ********Your grade is A1; Excellent********")
//            }
//
//            score > 100 -> println("You entered an invalid score!")
//
//
//
//        }
//
//}

fun main () {
    val r = readLine()!!.toInt()
    val t = r % 2
    if (t == 0) {
        println("That's an even number")
    } else println("It's an odd number!!")
    
}
