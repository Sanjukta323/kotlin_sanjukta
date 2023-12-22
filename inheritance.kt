//inheritance in kotlin
​
open class shape (){
    val res = 10
}
​
//open class shape
​
class rectangle ( val height : Int, val width: Int) : shape(){
    val per = 2* (height + width)
}
​
fun main (){
    val rect = rectangle (3,4)
    println(rect.per)
    println(rect.res)
}
