package com.abdu.kotlinbasics

import java.lang.IllegalArgumentException

fun main() {
//
//    var bob = Person("bob","bib" ,22);
//    var john = Person()
//    var johnPeterson = Person(lastname = "Peterson")
//
//    var samsung = MobilePhone("Android","Samsung","Galaxy S22 Ultra")
//
//    bob.hobby = "to skateBoard"
//    bob.stateHobby()
//
//    var myCar = Car();
//
//    println(" brand is : ${myCar.myBrand}")
//
//    myCar.maxSpeed = 111
//
//    println("Maxspeed is ${myCar.maxSpeed}")
//
//
// val user1 = User(1,"bob")
//
//
//
//
//    val updateduser = user1.copy(name = "Denis panjuta")
//
//    println(user1)
//    println(updateduser)
//
//    println(updateduser.component1())
//    println(updateduser.component2())
//    val (id,name) = updateduser
//
//    println("id = $id, name=$name")



    var samsung = MobilePhone("Android","Samsung","Galaxy S22 Ultra",12)
    samsung.chargeBattery()


}

class Person(firstName:String = "john",lastname: String = "doe"){

    var firstName : String? = null
    var age : Int? = null
    var hobby : String = "Watch Netflix"


    init {
        this.firstName = firstName
        println("Person created with firstName = $firstName and lastname = $lastname")
    }


    constructor(firstName: String,lastname: String,age:Int) : this(firstName,lastname){
        this.age = age


        println("Person created with firstName = $firstName,lastname = $lastname and age = $age")
    }

    fun stateHobby(){
        println(" ${firstName} hobby is $hobby")
    }


}

class MobilePhone(osName:String,brand:String, model:String,battery:Int){

    var battery : Int;

    init {
        this.battery = battery
        println("Here the osName is $osName, brand is $brand, model is $model")
    }

    fun chargeBattery(){
        var before = battery
        println("the phones battery is $battery")
        while (battery<50){
            battery++
            println(battery)

        }
        var after = battery
        println("the phones battery is after charge $battery")

        println("the phone has been charged ${after - before} times")

    }


}

fun myFunction(a:Int){

     var a = a
    println("a is $a")
}

class Car(){

     lateinit var owner : String

    val myBrand: String = "BMW"

    get() {
        return field.toLowerCase()
    }



    var maxSpeed: Int = 250
    //get() = field
    set(value){
        field = if (value > 0){
             value
        } else throw IllegalArgumentException("Maxspeed can not be less than 0")
    }

    var mymodel : String = "m5"
    private set


init {
    this.mymodel = "m3"
    this.owner = "frank"
}

}

data class User(val id:Long,var name:String)
