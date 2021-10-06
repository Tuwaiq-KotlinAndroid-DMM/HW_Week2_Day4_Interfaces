package com.kotlin.vehicle

class Truck (startEngine: Boolean, type: String, speed: Int, gear: Int) : Vehicle(startEngine, type, speed, gear) {

    override fun speedUp() {
        speed+=5
    }

    override fun changeGear(number: Int) {
        if (startEngine)
            gear= (0..10).random()
        else
            gear=0
    }
}