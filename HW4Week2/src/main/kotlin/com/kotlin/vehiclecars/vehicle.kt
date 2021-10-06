package com.kotlin.vehiclecars

open class vehicle (var startEngine: Boolean = true , var type: String = "BMW" , var speed: Int = 240, var gear: Int = 10) : Ivehicle {

    override fun isMoving() : Boolean {
    return speed > 0
    }
   open fun speedUp(){
    }
 open fun changeGear ():Int {
     return 0

 }
   open fun applyBrakes(){
        speed = 0
    }
  open fun setType (){
   }
    fun printStates(){
        if ( speed > 0)
            println("is moving")
    else
         println ("is not moving ")
}}