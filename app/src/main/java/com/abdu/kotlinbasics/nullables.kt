package com.abdu.kotlinbasics

fun main() {

    //var name :String = "Denis"


    var nullableName :String? = "Denis"
   // nullableName = null




   // var len = name.length
    var len2 = nullableName?.length
   // nullableName?.let { println(it.length) }
    val name = nullableName ?: "Guest"

    println("name is $name")

    nullableName!!.toLowerCase()

    //println(nullableName?.toLowerCase())

  /*  if (nullableName!=null){
        var len2 = nullableName.length
    } else{
        null
    }*/

}