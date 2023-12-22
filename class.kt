class rectangle ( val height : Int, val width: Int){
    val per = 2* (height + width)
}
​
fun main (){
    val rect = rectangle (3,4)
    println(rect.per)
}
