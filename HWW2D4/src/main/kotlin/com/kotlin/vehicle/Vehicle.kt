package com.kotlin.vehicle

open class Vehicle(var startEngine: Boolean = true, var  type: String, var speed: Int, var  gear: Int):IVehicle {

 override   fun isMoving():Boolean {
     startEngine = speed > 0
     return startEngine
    }
   open fun speedUp():Int{
        return speed
    }
  open  fun changeGear():Int{
       return 0
   }
   open  fun applyBrakes(){
       speed = 0
    }
   open  fun setType():String{
        return type
    }
  open  fun printStates(){
        if ( speed > 0){
            "Moving"
        }
        else{
            "Not Moving"
        }
    }
}