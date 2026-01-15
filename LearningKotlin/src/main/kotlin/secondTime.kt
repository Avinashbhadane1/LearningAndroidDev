class secondTime {

}

//        val str = "hello"
//    println(str.reversed())
//fun reversed(stringToReverse:String = "Hello World!"
//): String{
//    val finalString = buildString {
//        for (i in stringToReverse.lastIndex downTo 0){
//            append(stringToReverse[i])
//        }
//    }
//    return finalString
//}
//fun String.reversed(): String{
//    val finalString = buildString {
//        for (i in this@reversed.lastIndex downTo 0){
//            append(this@reversed[i])
//        }
//    }
//    return finalString
//}
fun main(){
    val circe = circle(redius = 4)
    println(circe.redius)
    println("the area of circle circe is ${circe.area} and circumference is ${circe.circumference}")
}
class circle(val redius:Int){
    val area = Math.PI*redius*redius
    val circumference = Math.PI*redius
}

