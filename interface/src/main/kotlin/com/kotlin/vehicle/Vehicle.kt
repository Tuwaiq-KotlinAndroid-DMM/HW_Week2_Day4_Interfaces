package com.kotlin.vehicle

open class Vehicle(var startEngine: Boolean, private var type: String, var speed: Int, var gear: Int) : IVehicle {


    override fun isMoving(): Boolean {
       return speed > 0
    }

   open fun speedUp(){
        speed+=10
    }
    open fun changeGear(number:Int){
        gear = number
    }

    fun applyBrakes(){
        speed=0
    }
    fun setType(name:String){
        type = name
    }

    fun printStates(){
        if (isMoving())
            println("$type present state: (Moving)")
        else
            println("$type present state: (Stopped)")

        println("Speed: $speed  gear: $gear")
    }
}