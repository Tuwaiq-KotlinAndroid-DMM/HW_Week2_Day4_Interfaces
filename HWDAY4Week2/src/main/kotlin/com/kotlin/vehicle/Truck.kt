package com.kotlin.vehicle

class Truck(
    startEngine: Boolean,
    type: String,
    speed: Int,
    gear: Int
) : Vehicle(startEngine, type, speed, gear) {
    override fun changeGear(Cargear: Int) {
        if (startEngine) {
            if (Cargear in 0..10)
                gear = Cargear
        } else
            gear = 0

    }
     override fun speedUp(){
        speed += 5
    }
}