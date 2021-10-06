package com.kotlin.vehicle

open class Vehicle (var startEngine: Boolean, var type: String,
               var speed: Int, var gear: Int): IVehicle {

    override fun isMoving(): Boolean {

      return speed > 0 }

   open fun speedUp() {

       speed++

    }

    open fun changeGear(num: Int) {

        0

    }
    open fun applyBrakes() {

        speed = 0

    }
    @JvmName("")
    fun setType(value: String) {
        type = value
    }
    open fun printStates() {
var movement = "condition"
    if (isMoving()) {
       movement = "Moving" }
         else {
       movement = "stopped" }

        println("Truck present state: $movement")
        println("speed: $speed gear:$gear")


}

}