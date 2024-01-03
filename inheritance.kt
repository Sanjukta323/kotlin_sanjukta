open class Person (var name: String, var age: Int){
   
    init{
        println("name  is $name")
        println("age is $age")
    }

    fun walk(){
        println("$name is walking...")
    }

    fun eat (){
        println("$name is eating...")
    }

    fun talk(){
        println("$name is talking...")
    }
}

class Teacher(name: String, age: Int) :Person(name, age){
   
    fun teach(){
        println("$name is a teacher...")
    }
}

class Player (name: String, age: Int) :Person(name, age){

    fun play(){
        println("$name is a player...")
    }
}

fun main(){
    
    //object of person class
    var p1 = Person("sanjukta", 22)
    
    //using functions of person class
    p1.walk()

    //object of techer class
    var t1 = Teacher("mili", 22)
    
    //fun belonging to teacher class
    t1.teach()
    
    //fun belonging to parent class(Person) class
    t1.walk()

    //object of player class
    var pl1 =  Player("sanju", 22)
    
    //fun of parent class
    pl1.walk()
    pl1.eat()
    pl1.talk()
   
    //fun of player class
    pl1.play()

}