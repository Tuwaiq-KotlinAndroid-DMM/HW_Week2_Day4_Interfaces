package com.kotlin.waad

open class Vehicle(var _speed:Int):IVehicle {
    var startEngine:Boolean=false
    var type:String="Kia"
    var speed:Int=_speed
    var gear:Int=0
    override fun isMoving():Boolean{
        if (speed>0)
            return startEngine
        else return startEngine
    }
    open fun speedUp() {

     }
     open fun changeGear(){
     }
   open  fun applyBrakes(){
         speed=0
     }
    fun setType() {

    }
    open fun printStates(){
        var veh=String
        if (isMoving())
            println("moving")
        else
            println("not moving")
    }
    }


