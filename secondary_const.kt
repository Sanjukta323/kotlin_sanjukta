class Student {
    var name: String = ""
    var age: Int = 0
    var marks: Int = 0

    // secondary constructor
    constructor(name: String, age: Int, marks: Int) {
        this.name = name
        this.age = age
        this.marks = marks
    }

    

    fun display() {
        println("name = $name")
        println("age = $age")
        println("marks = $marks")
    }
}

fun main() {
    
    val s1 = Student("Sanjukta", 14, 23)
    s1.display()

    
}
