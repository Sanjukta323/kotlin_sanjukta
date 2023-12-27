fun main(){

    val student = mutableMapOf<Int, String>()
    student.put (1,"John")
    student.put (2,"Mary")
    student.put (3,"Peter")
    student[8] = "hello"
    println(student.size)
    println(student[1])
    println(student.get(2))
    println(student.containsKey(1))
    println(student.containsValue("John"))
    println(student.keys)
    println(student.values)
    println(student.entries)
    println(student.clear())
    println(student.isEmpty())
    println(student.remove(1))

    //immutable map example

    val student2 = mapOf(1 to "John", 2 to "Mary", 3 to "Peter", 8 to "hello")
    
    println(student2.size)
    println(student2[1])
    println(student2.get(2))
    println(student2.containsKey(1))
    println(student2.containsValue("John"))
    println(student2.keys)
    println(student2.values)
    println(student2.entries)
   // student2[1] = "sanjukta"
   // println(student2.clear())
    println(student2.isEmpty())
   // println(student2.remove(1))

}