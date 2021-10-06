package com.kotlin.HW

class SportCar(_speed:Int):Vehicle(_speed) {
    override fun changeGear(a: Int) {
        if (IsMoving()) {
            if (speed in 0..20)
                gear = 1
            else if (speed in 21..41)
                gear = 2
            else if (speed in 42..62)
                gear =3
            else if (speed in 63..83)
                gear =4
            else if (speed in 84..104)
                gear =5
        }
        else
            gear = 0
    }
    override fun speedUp(){
        speed+=20

    }





}