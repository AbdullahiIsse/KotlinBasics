package com.abdu.kotlinbasics

fun main() {

    val fruits = setOf("orange","Apple","Mango","Grape","Apple","orange")

    println(fruits.toSortedSet())



    val newFruits = fruits.toMutableList()
    newFruits.add("Watermelon")
    newFruits.add("Pear")
    println(newFruits.elementAt(4))



    val daysOfTheWeek = mapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")
    println(daysOfTheWeek[2])

    for (key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")

    }

    val fruitsMap = mapOf("Favorite" to Fruit("Grape",2.5),"OK" to Fruit("Apple",1.0))

    val newDayOfWeek = daysOfTheWeek.toMutableMap()
    newDayOfWeek[4] = "Thursday"
    newDayOfWeek[5] = "Friday"

    println(newDayOfWeek.toSortedMap())



}

