fun main(){
//val x = "hello there"
//val y = 53
//val z: Double = 1.24
//    println(z)
//    println(y)
//    println(x)
//
//    println("does this condition come out to be : ${y >50}")
//    println("type a number :")
//    val input = readln()
//    val inputAsInteger = input.toIntOrNull() ?: 0
//    val inputAsInteger = input.toIntOrNull()
//    val isEven = inputAsInteger?.rem(2)==0
//    println("Is your number even $isEven")
//    println("you typed: $input")
//    if(inputAsInteger!=null){
//        val output = if(inputAsInteger%2==0){
//            "yeah it is even"
//        }else{
//            "no it is not even"
//        }
//        println(output)
//        val output = when{
//            inputAsInteger %2==0 -> "The number is even"
//            inputAsInteger <10 -> "number is odd and less than 10"
//            else -> "number is odd and greater than 20"
//        }
//
//        println(output)
//    }
//    val output2 = when(inputAsInteger){
//        null -> "dude enter a valid num"
//        3 -> "yeah its 3"
//        in 10..20 -> "its between 10 and twenty"
//        else -> "great"
//    }
//    println(output2)
//    val favNum = intArrayOf(20,5,4,89,69);
    println("Enter a string: ")
    val str = readln();
//    val finalString = buildString {
//        for (i in str.lastIndex downTo  0){
//            append(str[i])
//       }
//    }
//    val finalString = buildString {
//        for (i in 0 .. str.lastIndex){
//            val x = str.lastIndex-i
//            append(str[x])
//        }
//    }// until excludes the last one
//    println(finalString)
       println(str.reverse())
}
//fun reverse(stringToReverse: String){
//    val finalStr = buildString {
//        for (i in stringToReverse.lastIndex downTo 0){
//            append(stringToReverse[i])
//        }
//    }
//    println("Reversed String is : $finalStr");
//}
//fun reverse(stringToReverse: String): String{
//    val finalStr = buildString {
//        for (i in stringToReverse.lastIndex downTo 0){
//            append(stringToReverse[i])
//        }
//    }
//    return ("Reversed String is : $finalStr");
//}// fun also supports default case like in csharp here you just have to assign stringToReverse some initial string

fun String.reverse(): String{
    val finalStr = buildString {
        for (i in this@reverse.lastIndex downTo 0){
            append(this@reverse[i])
        }
    }
    return ("Reversed String is : $finalStr");
}//extension fxn applied like String.valueOf

//operators are similar here
