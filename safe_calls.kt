fun main(){
   // var a:String? = null
    println(lengthString(null)) //safe call implementation
    println(lengthString("")) //safe call implementation
}
 

fun lengthString(a:String?):Int? {
    return a?.length
}