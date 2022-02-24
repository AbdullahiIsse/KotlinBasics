package com.abdu.kotlinbasics

fun main() {

    val months = listOf("January","February","March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    println(anyTypes.size)
   // println(months[1])



    val additionalMonths = months.toMutableList()

    val newMonths = arrayOf("April","May","June","July","August","September","October","November")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("December")
    println(additionalMonths)

    val days = mutableListOf<String>("Mon","Tue","Wed")

    days.add("Thu")
    days[2] = "Sunday"
   // days.removeAt(1)
    val removeList = mutableListOf<String>("Mon","Wed")
    //days.removeAll(removeList)
    days.removeAll(days)
    println(days)

}