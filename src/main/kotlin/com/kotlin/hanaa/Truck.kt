package com.kotlin.hanaa

class Truck(startEngine: Boolean = true, speed: Int, type: String, gear: Int) :
    Vehicle(startEngine, speed, type, gear) {

    override fun changeGear(G: Int) {
        if (G >= 0 && G <= 10 && startEngine) {
            gear = G

        } else {
            gear = 0
        }
        println("gear: $gear")
    }

    override fun speedup() {
        speed += 5 //that’s mean speed = speed + 5

        println("the speed is $speed")

    }


}