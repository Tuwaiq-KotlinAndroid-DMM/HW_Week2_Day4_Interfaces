package com.kotlin.waad

class SportCar(_speed:Int):Vehicle(_speed = 80) {
    override fun changeGear() {
        if (startEngine){
            if (speed in 0..20)
                gear=1
            else if (speed in 21..41)
                gear=2
            else if (speed in 50..60)
                gear=3
            else if (speed in 70..80)
                gear=4
            else if (speed in 90..100)
                gear=5
            else gear=0

        }
    }
    override fun speedUp() {
        speed+=20
    }
}