package com.abdu.kotlinbasics

fun main(){

    // Type string
    val myName = "Frank"

    // Type int
    var myage = 31;

    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 1233123123
    val myLong: Long = 13223323

    val myFloat : Float = 13.37F
    val myDouble : Double =  3.1144158

    var isSunny: Boolean = true
    isSunny = false


    val letterChar = 'A'
    val digitalChar = '1'


    val myStr = "Hello World"
    var firstCharInString = myStr[10]
    var lastCharinString = myStr[myStr.length - 1]


    var course: String = "Android Masterclass"

    val floatnumber: Float = 13.37f

    val pi: Double = 3.14159265358979

    var number: Int = 25

    var year : Int = 2022

    var randomNumber: Long = 18881234567

    var isRaining :Boolean = true

    var firstLetterInAlb:Char = 'A'








    //  print("Last character $lastCharinString and the length my string is ${myStr.length}")

    var result = 5+3
    val a = 5.0
    val b = 3

    var resultDouble: Double
    resultDouble =  (a/b)

    println(resultDouble)



    val isEqual = 5==3

    //println("isEqual is $isEqual")


    val isNotEqual = 5!=5
    // println("isEqual is $isNotEqual")


    //println("is5Greater3 ${-5>3}")


    var myNum = 5
    myNum += 3
    myNum*=4

    // println("myNum is $myNum")

    myNum++

    /*  println("myNum is $myNum")
      println("myNum is ${++myNum}")
      println("myNum is ${++myNum}")

      println("myNum is ${--myNum}")
  */

/*
    var heightPerson1 = 170
    var heightPerson2 = 159
    val age = 20 ;

    if (heightPerson1 > heightPerson2){
        println("use raw force")
    } else if (heightPerson1 == heightPerson2){

        println("use your power technique 1337")
    }
    else{
        println("use technique")
    }


    when(age){
        in 0..15 -> println("you are too young")
        16,17 ->  println("yor may drive")
        18,20 -> println("your may vote")
        else ->   println("your are too young")


    }
    var x:Any = "13.37F"

    when(x){
        is Int -> println("$x is an int")
        !is Double -> println("$x is not a double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }


    if (age>= 30)
        println("you are too old")

    if (age >= 21) {
        println("your may drink in us")

    }
    else if (age >= 18) {
        println("your may vote")
    }
    else if (age>=16) {
        println("yor may drive")
    }
    else {

        println("your are too young")

    }

    var name = "dennis"

    if (name == name){
        println("Welcome home dennis")
    } else{
        println("who are you")
    }

    val isRainy = true

    if (isRainy)
        println("its rainy")



    var season = 3

    when(season){

        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4-> println("Winter")

        else-> println("Invalid Season")

    }


    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter")
        else-> println("Invalid Season")

    }*/

    /*var x = 1

    while ( x <= 10){
        println("$x")
        x++
    }
    println("While loop is done")
*/
//    var x = 100
//
//    while (x>= 0){
//        println("$x")
//        x-=2
//    }
//    println("While loop is done")
//    x = 1
//    do {
//        println("$x")
//     x++
//    }while (x<=100)
//    println("do while loop is done")
//
//
//    var feltTemp = "cold"
//    var roomTemp = 10
//
//    while (feltTemp == "cold"){
//        roomTemp++
//        if (roomTemp>= 20){
//            feltTemp = "comfy"
//            println("its comfy now")
//        }
//    }
//
//
//
//    for (num in 1..10){
//        print("$num")
//    }
//
//    for (i in 1 until 10){
//        println("$i ")
//    }
//
//    for (i in 10 downTo 1 step 2){
//        println("$i ")
//    }

//
//    for (i in 0 until 10000){
//        println("$i")
//        if (i == 9001){
//            println("IT'S OVER 9000!!!")
//        }
//    }
//
//
//    var humidityLevel = 80
//    var humidity = "humid"
//
//    while (humidity == "humid"){
//        humidityLevel-=5
//        println("humidity decreased")
//        if (humidityLevel< 60){
//            humidity = "comfy"
//            println("it's comfy now")
//        }
//
//    }


    for (i in 1 until 20){

        if (i/2 == 5){
            continue
        }
        println("$i")
    }

    print("Done with the loop")

    for (i in 1 until 20){

        if (i/2 == 5){
            break
        }
        println("$i")
    }

    print("Done with the loop")






}



