package com.kotlin.vehicle

class Truck(startEngine: Boolean, type: String, speed: Int, gear: Int) : Vehicle(startEngine, type, speed, gear){


    override fun changeGear(num: Int) {
        if (startEngine == true) {

            if (num in 0..10) {

                gear = num
            } else {
                gear = 0
            }
        } }


        override fun speedUp() {
       if (startEngine==true) {speed+5}
    }
    override fun printStates() {
        var movement = "condition"
        if (isMoving()) {
            movement = "Moving" }
        else {
            movement = "stopped" }

        println("the truck car present state: $movement")
        println("the speed = $speed the gear = $gear")


    }
}