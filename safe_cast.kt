fun main() {
       
    safecast(null)
    safecast("sanjukta")
    
}

fun safecast(str : String?) {
    val res : String? = str as? String
    println(res)
}
