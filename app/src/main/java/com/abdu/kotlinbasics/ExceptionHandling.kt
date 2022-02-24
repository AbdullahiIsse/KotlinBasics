package com.abdu.kotlinbasics

import java.lang.ArithmeticException
import java.lang.NumberFormatException

fun main() {


val str = getNumber("10.6")
    println(str)

    validate(17)



}

fun getNumber(str:String):Int{

    return try {
        Integer.parseInt(str)

    } catch (e:NumberFormatException){
        0
    } catch (e:ArithmeticException){
        0
    }

}

fun validate(age:Int){

    if (age<18){
        throw ArithmeticException("under age")
    } else{
        println("eligible to drive")
    }


}