package com.kotlin.homework

class SportCar(startEngine: Boolean, type: String, speed: Int, gear: Int) : Vehicle(startEngine, type, speed, gear) {
    override open fun speedUp() {
        speed += 20
    }


    override fun changeGear(g: Int) {
        if (startEngine) {
            when {
                (g >= 0 && g <= 5) -> gear = g
                else -> gear = 0
            }
            gear = 0
        }
    }

    override fun printStates() {
        var state = ""
        if (isMoving()) {
            state = "(Moving)"
        } else {
            state = "(Stopped)"
        }
        println("SportCar present state : $state")
        println("speed: $speed gear: $gear")

    }

}