package com.abdu.kotlinbasics

fun main() {



// Lambda Function

    val sum:(Int,Int) -> Int = {a:Int,b:Int -> a+b}
    println(sum(2,3))

    // Shorter Lambda Function
    val sum1 ={a:Int,b:Int -> println(a+b)}
    println(sum1)

    addNumber(2,3)




}

// Normal Function
fun addNumber(a: Int, b: Int) {
    val add = a+b
    println(add)

}



