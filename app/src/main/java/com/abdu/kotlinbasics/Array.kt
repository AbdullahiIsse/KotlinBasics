package com.abdu.kotlinbasics

fun main() {


    //val numbers:IntArray = intArrayOf(1,2,3,4,5,6)

   // val numbers = intArrayOf(1,2,3,4,5,6)

    val numbers = arrayOf(1,2,3,4,5,6)

   println("Initial values ${numbers.contentToString()}")

    numbers [0] = 6
    numbers [1] = 5
    numbers [4] = 2
    numbers [5] = 1

    println("Final values ${numbers.contentToString()}")


    //val numbersD:DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)

    val numbersD = arrayOf(1.0,2.0,3.0,4.0,5.0,6.0)

    println("Initial values ${numbers.contentToString()}")

    numbersD [0] = 6.0
    numbersD [1] = 5.0
    numbersD [4] = 2.0
    numbersD [5] = 1.0

    println("Final values ${numbers.contentToString()}")


    val days:Array<String> = arrayOf("Sun","Mon","Tues","Wed","Thurs","Fri","Sat")

    println(days.contentToString())

    val fruit = arrayOf(Fruit("Apple",2.5), Fruit("Grape",3.5))

    for (fruits in fruit){
        println("${fruits.name}")
    }

    for(index in fruit.indices){
        println("${fruit[index].name} is in index $index")
    }

    val mix = arrayOf("Sun","Mon","Tues",1,2,3,Fruit("Apple",2.5))

    println(mix.contentToString())

}

data class Fruit(val name:String,val price:Double)