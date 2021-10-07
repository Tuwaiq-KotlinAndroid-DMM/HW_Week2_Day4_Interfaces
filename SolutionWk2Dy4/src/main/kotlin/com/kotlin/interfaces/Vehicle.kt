package com.kotlin.interfaces

  open class Vehicle( startEngine: Boolean = true, gear: Int = 2, speed: Int = 40, type: String = "Corolla" ) :IVehicle {
      override fun isMoving(): Boolean {
      return true }


      open fun changeGear() {
          return println(2)
      }
     open fun speedUp(){
         return println(40)
     }
      open fun printState(){
return println("moving")
      }

  }




