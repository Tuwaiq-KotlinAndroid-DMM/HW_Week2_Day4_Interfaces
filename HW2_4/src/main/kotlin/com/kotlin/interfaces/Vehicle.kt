package com.kotlin.interfaces

open class Vehicle :IVehicle {
    var startEngine: Boolean= false
     lateinit var ttype: String
     var speed:Int= 0
    var gear:Int =0


    override fun isMoving():Boolean {
       if(speed > 0)
           return true
        else
            return false
    }

    open fun speedUp():Int{
     return speed++

    }
    open fun changeGear():Int{
     println("Gear number: ")
       gear= readLine()!!.toInt()
       return gear
    }
    fun applyBrakes():Int{
      speed=0
        return speed
    }
    fun setType():String{
    println("Type of vehicle either sport or truck")
        ttype= readLine()!!
        return ttype

    }
    fun printStates(){
println("moving or not moving?")
        var status= readLine()

            println("car is $status")
    }

}