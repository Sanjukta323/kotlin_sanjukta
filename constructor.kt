class student(
    var name: String = "",
    var age: Int = 0,
    var gender: String = "",
    var address: String = "",
    var phone: String = "",
    var email: String = ""
){
    fun display(name: String, age: Int, gender: String){
         println("Name: $name, Age: $age, Gender: $gender")
    }
}
    
fun main(){
    var student1 = student(name = "John", age = 25, gender = "Male", address = "New York", phone = "1234567890", email = "efpyi@example.com")
    var student2 = student(name = "Jane", age = 26, gender = "Female", address = "New York", phone = "1234567890",  email = "efpyi@example.com")
    
    //displaying student1

    println(student1.name)
    println(student1.age)
    println(student1.gender)
    println(student1.address)
    println(student1.phone)

    //displaying student2

    println(student2.name)
    println(student2.age)
    println(student2.gender)
    println(student2.address)
    println(student2.phone)

    //displaying student1 by using display function
    student1.display(student1.name, student1.age, student1.gender)

    //displaying student2 by using display function
    student2.display(student2.name, student2.age, student2.gender)
}