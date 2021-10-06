package com.kotlin.hw


open class Vehicle(var car: String ,var speed:Int,var gear: Int,var startEngine: Boolean) : IVehicle{






    override fun isMoving():Boolean {
        if(speed > 0)
        return true
        else
            return false
    }

  open  fun speedUp (){
        speed+=1

    }
    open fun changeGear (x:Int){
        gear=x
    }
    fun applyBrakes(){
        speed = 0

    }
    fun setType(y:String){
        car = y

    }
    fun printStates(){
        if ( isMoving())
        println("moving")
        else
            println("Stopped")


    }
}

