package com.kotlin.vehicle

class SportCar(
    startEngine: Boolean,
    type: String,
    speed: Int,
    gear: Int
) : Vehicle(startEngine, type, speed, gear) {
    override fun changeGear(Cargear: Int) {
        if (startEngine) {
            if (Cargear in 0..5)
                gear = Cargear

        } else
            gear = 0

    }
    override fun speedUp(){
        speed += 20
    }
}
