fun main() {

    val p = Person()
    p.age  = 12           //access the setter by default
    println("${p.age}")  //access the getter by default
}

class Person {
    var age: Int = 0

    get() = field

    set(value) {
        field = if (value < 18) 18
        else if (value > 18 ) value
        else value-2 
    }
}
