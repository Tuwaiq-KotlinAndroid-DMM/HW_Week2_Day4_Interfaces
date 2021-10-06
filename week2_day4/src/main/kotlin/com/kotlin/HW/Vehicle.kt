package com.kotlin.HW

open class Vehicle(_speed:Int):IVehicle {
    var startEngine:Boolean=false
    var type:String="sport car"
    var speed:Int= _speed
    var gear:Int=7



    override fun IsMoving():Boolean {
        startEngine = speed>0

        return startEngine


    }
   open fun speedUp(){}
    open fun changeGear(a:Int){}
    open fun applyBrakes(){}

    open fun type(){

    }
    open fun printStates(){

        if (IsMoving())
                println("Moving")
        else
            println("stopped")


    }

}