fun main() {
    
    println(lazyInt)
    println("Before accessing lazyValue")
    println(lazyValue) // The lazyValue is initialized here
    println("After accessing lazyValue")
    println(lazyValue) // The lazyValue is not re-initialized; the previously computed value is returned
}

val lazyValue: String by lazy {
    println("Initializing lazyValue")
    "Hello, Lazy!"


}

val lazyInt :Int by lazy {
    12
}


