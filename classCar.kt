class Car {

    //attributes
    var name : String = "Ford"
    var model : String = "Focus"
    var year : Int = 2020
    var color : String = "Blue"

    //methods
    fun drive(){
        println("I'm driving")
    }

    fun stop(){
        println("I'm stopping")
    }

    fun start(){
        println("I'm starting")
    }

}

fun main(){
    val car = Car()

    //accesing attributes
    println(car.name)
    println(car.model)
    println(car.year)
    println(car.color)

    //changing attributes
    car.year = 2021
    car.color = "Red"

    //accesing changed attributes
    println(car.name)
    println(car.model)
    println(car.year)
    println(car.color)



    //accessing methods
    car.drive()
    car.stop()
    car.start()
    
}