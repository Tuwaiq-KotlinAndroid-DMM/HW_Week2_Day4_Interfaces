package com.kotlin.vehicles

class Truck(startEngine: Boolean, type: String, speed: Int, gear: Int) : Vehicle(startEngine, type, speed, gear) {
    override fun changeGear(value: Int) {
        if (startEngine) {
            if (value >= 0 && value <= 10) {
                gear = value
            } else gear = 0
        } else
            gear = 0
    }

    override fun speedUp() {
        if (startEngine)
            speed += 5
    }

    override fun printStates() {
        var state = ""
        if (isMoving()) {
            state = "(Moving)"
        } else {
            state = "(Stopped)"
        }
        println("Truck present state: $state")
        println("speed: $speed gear:$gear")
    }
}