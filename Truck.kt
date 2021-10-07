package com.kotlin.homeworkweek2day4

class Truck(startEngine: Boolean, type: String, speed: Int, gear: Int) : Vehicle(startEngine, type, speed, gear) {

    override fun changeGear(_gear: Int) {
        if (startEngine && _gear in 0..10)
            gear = _gear
        else {
            gear = 0
        }
    }

    override fun speedup(): Int {
         speed += 5
        return speed
    }
}

