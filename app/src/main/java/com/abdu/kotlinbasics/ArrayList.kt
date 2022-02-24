package com.abdu.kotlinbasics

fun main() {


    val arraylist  = ArrayList<String>()
    arraylist.add("One")
    arraylist.add("Two")

    println(arraylist)

    for (i in arraylist){
        println(i)
    }

    val aList:ArrayList<String> = ArrayList<String>(5)
    var list:MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    aList.addAll(list)

    println(aList)

    val itr = aList.iterator()
    while (itr.hasNext()){
        println(itr.next())
    }

    println("size of arraylist = ${aList.size}")

    println(aList.get(1))


    val aListD = ArrayList<Double>()
    val listD = mutableListOf<Double>(1.0,2.0,3.0,4.0,5.0)

    aListD.addAll(listD)

    println(aListD)

    println("The Average is ${aListD.sum()/aListD.size}")

    var test = 0.0
    for (i in aListD){
        test +=i
    }

    println("The Average is "+ test/aListD.size)












}