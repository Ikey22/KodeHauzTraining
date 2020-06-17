fun main(){
//
//    println("Enter your age: ")
//    val age = readLine()!!.toInt()
//
//    if (age <18){
//        println("You are not an adult yet")
//    }else{
//        println("Congrats!! You're an adult")
//    }

    //Using IF statemrnt
//    println("Enter your grade")
//    val grade = readLine()!!.toInt()
//
//    if (grade >=90){
//       if (grade>93){
//           println("A+")
//       }else{
//           println("A-")
//       }
//    }
//    if (grade in 80..90){
//        println("You have an A-")
//    }else if (grade < 70){
//        println("You passed")
//    }


    //Using When Statement
//    println("Enter your grade")
//    val grade = readLine()!!.toInt()
//
//    when{
//        grade>=90 -> println("A")
//        grade in 80..89 -> println("B")
//        else -> println("Fail")
//    }


//    val foodId = readLine()!!.toInt()
//
//    when(foodId){
//        1 -> {
//            println("You want a sandwich")
//        }
//        10 -> {
//            println("You want burger")
//        }
//        else ->{
//            println("You haven't made an order")
//        }
//
//    }

    val isMarried = true
    val GPA =3.8

    val isQualified = if (isMarried && GPA==3.8) 1 else 0
    if (isMarried && GPA>=3.8){
        println("You have qualified")
    }else{
        println("You didn't qualify")
    }
    println(isQualified)

    val isGood = when(GPA){
        4.0 -> true
        else -> false
    }
    println(isGood)
}