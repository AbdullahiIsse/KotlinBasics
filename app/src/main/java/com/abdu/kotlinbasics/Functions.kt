package com.abdu.kotlinbasics

fun main(){

    var result = addUp(5,3)
    println("result is $result")

    var avgResult = avg(10.0,0.0)

    println("The average is $avgResult")

}

fun addUp(a: Int,b:Int): Int{

    return a+b
}

fun avg(a:Double, b:Double): Double{

    return (a+b)/2

}

fun myFunction(){

    println("called from my function")



}


