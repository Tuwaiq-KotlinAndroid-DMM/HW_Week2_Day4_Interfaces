package com.kotlin.solution

open class Vehicle(var startEngine: Boolean, var _type: String, var speed: Int, var gear: Int) : IVehicle {
    override fun isMoving() {
       if(speed>0){
           startEngine = true
       }else{
           startEngine = false
       }
    }

    open fun speedUp() {
        speed++

    }

   open fun changeGear(g:Int) {

        gear +=gear
//        if (gear == 1) {
//            speed = 25
//        } else if (gear == 2) {
//            speed = 40
//        } else if (gear == 3) {
//            speed = 60
//        } else if (gear == 4) {
//            speed = 80
//        } else {
//            println("you have reached the max speed")
//        }
    }

    fun applyBrakes() {
        speed = 0
        gear = 0

    }

    fun setType(t: String) {
        _type = t

    }

    open fun printStates() {
        if (speed > 0 && gear > 0) {
            println("$_type present state : (Moving) \n The speed: $speed  The gear : $gear")
        } else {
            println("$_type present state :(Stopped) \n The speed: $speed  The gear : $gear")
        }
    }



}
