package com.kotlin.vehicle

import kotlin.properties.Delegates

class SportCar(startEngine: Boolean = true, type: String = "ferari", speed: Int=370, gear: Int=5):
    Vehicle(true,"Sports car", 300,5) {





    override fun changeGear(num: Int) {
        if (startEngine == true) {

            if (num in 0..5) {

                gear = num
            } else {
                gear = 0
            }
        }

    }

    override fun speedUp() {

        if (startEngine==true) {
      speed + 20  }
    }

    override fun printStates() {
        var movement = "condition"
        if (isMoving()) {
            movement = "Moving" }
        else {
            movement = "stopped" }

        println("sports car present state: $movement")
        println("the speed = $speed the gear = $gear")


    }
    }

