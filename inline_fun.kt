fun main() {
    val result = addNumbers(5, 7)
    println("Sum: $result")
}

inline fun addNumbers(a: Int, b: Int): Int {
    return a + b
}
