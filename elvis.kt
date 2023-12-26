fun main(){
    var a :String? = null 
    //val l1 = a?.length ?: 0  //elvis operator implementation (?:)
    val l = a!!.length
    println (l)

    var aInt: Int? = a as? Int
    //aInt = 12
    println(aInt)
}