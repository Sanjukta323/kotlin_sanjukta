

import kotlin.collections.mutableListOf

//List -> dynamic array

/*
it is of two types ->
1 -- mutable list -> can be changed
2 -- immutable list -> cannot be changed
 */

fun main() {
    
    //immutable list example

    var nums = listOf(12,13,14,15,16,17,18,19,20,21)
    println(nums.size)
    println(nums[0])
    println(nums[1])
    println(nums)
   // nums[0] = 23 -> immutable list cannot be changed
   println (nums.indexOf(13))
   println(nums.lastIndexOf(13))
   println (nums.contains(43))
   println (nums.containsAll(listOf(12,13,14,15,16,17,18,19,20,21)))

   //mutable list example

   val num2 = mutableListOf(12,13,14,15,16,17,18,19)
   num2[0] = 34
   println(num2.size)
   println(num2[0])
   num2.add(23)
   num2.remove(15)
   num2.removeAt(2)
   println(num2)

}