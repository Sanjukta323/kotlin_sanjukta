// null safety implementation

fun main(){
   var a:String = "sanjukta"
   println(a.length)

   var b:String = ""
   println(b.length)
 
   //here is the errors
   //var c:String = null
   //println(c.length)

   var d:String? = null   //null safety implementation
   println(d)

   var e:Int? = null //null safety implementation
   println(e)
}


