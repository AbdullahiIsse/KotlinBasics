package com.abdu.kotlinbasics

interface Driveable{

    val maxSpeed: Double
    fun drive():String
    fun brake(){
        println("The drivable is braking")
    }





}


open class Cars( override val maxSpeed: Double,val name: String,val brand:String) : Driveable{

    open var range: Double = 0.0


    fun extendRange(amount:Double){

        if (amount>0)
            range+=amount
    }

    open fun drive(distance:Double){
        println("Drove for $distance KM")
    }



    override fun drive(): String {
      return "driving the interface drive"
    }




}


class ElectricCar( maxSpeed: Double,name: String, brand: String,batteryLife: Double) : Cars(maxSpeed,name, brand){

    var chargerType = "Type1"
    override var range = batteryLife*6

    override fun drive(distance: Double) {
     println("Drove for $distance KM on electricity")
    }


    override fun drive(): String{
        return "Drove for $range KM on electricity "
    }

    override fun brake() {
       super.brake()
    }


}


fun main() {
    var myCar = Cars(200.0,"A3","Audi")
    var myECar = ElectricCar(200.0,"S-model","Tesla",85.0)


    myECar.extendRange(200.0)
    myCar.drive(200.0)

    myECar.drive(200.0)
}