

//import calculatorvar sum : (Int, Int)->Int = {a,b -> a+b }

fun calculator(a : Int, b : Int, operation : (Int, Int)->Int) :Int{
    return operation(a, b)
}

val sum: Int.(Int) -> Int = { other -> this + other }



fun main()
     {
   var res1 =  calculator(20, 30) {a,b -> a+b}
   println(res1)
    var res2 = calculator (20,3) {a,b -> a*b}
    println(res2)

    val result = 5.sum(3) // Calls the lambda with receiver, adding 3 to 5
    println("Result: $result")
}