// Base class (superclass)
open class Persons(val name: String, val age: Int) {
    fun display() {
        println("Name: $name, Age: $age")
    }
}

// Derived class (subclass)
class Students(name: String, age: Int, val studentId: String) : Persons(name, age) {
    fun study() {
        println("$name is studying.")
    }
}

class Teacher(name: String, age: Int, val subject: String) : Persons(name, age) {
    fun teach() {
        println("$name is teaching $subject.")
    }
}

fun main() {
    val students = Students("John", 20, "S12345")
    val teacher = Teacher("Mrs. Smith", 35, "Mathematics")

    students.display()
    students.study()

    println()

    teacher.display()
    teacher.teach()
}
