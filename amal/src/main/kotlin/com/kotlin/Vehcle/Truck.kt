package com.kotlin.Vehcle

class Truck {


    class Truck(startEngine: Boolean, type: String, speed: Int, gear: Int) : Vehicle(
        startEngine,
        type,
        speed,
        gear
    ) {
        override fun changeGear(newGear: Int) {
            gear = if (startEngine && newGear in 0..10)
                newGear
            else
                0
        }

        override fun speedUp() {
            speed += 5
        }
    }

}