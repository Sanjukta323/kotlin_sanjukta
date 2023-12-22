//function in kotlin
​
fun main (){
   var a = 20
   var b = 10
   add (a,b)
   println ("mul = " + mul (a,b))
   
   sayhello()
   
}
​
//function without any parameters and return type
fun sayhello (){
    println ("hello!!!!! world")
}
​
//function with parameters 
​
fun add ( a:Int, b:Int)  {
    println ("sum = "+(a+b))
}
​
//function with parameters and return type
fun mul ( a:Int, b:Int) :Int {
    return a*b
}

