package com.kotlin.vehicle

class SportCar(startEngine: Boolean, type: String, speed: Int, gear: Int) : Vehicle(startEngine, type, speed, gear) {
    override fun changeGear(gearOfCar: Int) {
        if (startEngine) {
            if (gearOfCar <= 10 && gearOfCar >= 0)
                gear = gearOfCar
        } else {
            gear = 0
        }

    }

    override fun speedUp() {
        speed += 20
    }


}