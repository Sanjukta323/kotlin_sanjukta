class Car (var brand:String,var year:Int,var color:String){
    fun brake(){
        println("Braking")
    }

    fun ride(){
        println("Riding")
    }
}

fun main(){

    var c1 = Car ("BMW", 2020, "Red")
    //assesing attributes
    println(c1.brand)
    println(c1.year)
    println(c1.color)

    //assesing methods
    c1.brake()
    c1.ride()
}