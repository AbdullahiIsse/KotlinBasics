package com.abdu.kotlinbasics

import kotlin.math.floor

fun main() {


val stringList:List<String> = listOf(
    "Dennis","Frank","Micheal","Garry"
)

val mixedTypeList: List<Any> = listOf(
    "Denis",31,5,"BDay",70.5,"weighs","Kg"
)

for (value in mixedTypeList){
    if (value is Int){
        println("Integer: '$value")
    } else if(value is Double){
        println("Double: '$value' with floor value ${floor(value)}")
    } else if (value is String){
        println("String: '$value' of length ${value.length}")
    } else{
      println("Unknown Type")

    }
}


// smart cast

    val obj1: Any = "I have a dream"
    if (obj1 !is String){
        println("Not A String")
    } else{
        println("found a String og length ${obj1.length}")
    }


    // safe casting

    val obj3:Any = 1337
    val str3: String? = obj3 as? String
    println(str3)



}