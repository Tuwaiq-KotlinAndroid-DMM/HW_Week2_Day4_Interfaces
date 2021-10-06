package com.kotlin.solution

class SportCar(startEngine: Boolean, _type: String, speed: Int, gear: Int) : Vehicle(startEngine, _type, speed, gear) {

    override fun changeGear(g: Int) {
        if (startEngine == true) {
            if (gear < 5) {
                if (g < 6) {

                    gear = gear + 1

                }
            }
        } else {
            gear

        }
    }

    override fun speedUp() {
        speed += 20
    }



}