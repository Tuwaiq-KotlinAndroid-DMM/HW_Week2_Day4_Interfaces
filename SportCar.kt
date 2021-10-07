package com.kotlin.homeworkweek2day4

class SportCar(startEngine: Boolean, type: String, speed: Int, gear: Int) : Vehicle(startEngine, type, speed, gear) {

    override fun changeGear(_gear: Int) {
        if (startEngine && speed in 0..5)
            gear = gear
        else gear = 0
    }

    override fun speedup(): Int {
        speed += 20
        return speed
    }
}
