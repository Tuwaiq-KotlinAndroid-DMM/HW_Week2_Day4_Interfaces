package com.kotlin.vehicle

class SportCar(startEngine: Boolean, type: String, speed: Int, gear: Int) : Vehicle("", "", 0, 0) {
    override fun changeGear(value: Int) {
        if (startEngine)
            if (value >= 0 && value <= 5)
                gear = value
    } else
    {
        gear = 0
    }


    override fun speedUp() {
        speed += 20
    }
}