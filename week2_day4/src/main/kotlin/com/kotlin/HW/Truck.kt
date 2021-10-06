package com.kotlin.HW

class Truck(_speed:Int):Vehicle(_speed) {
    override fun changeGear(a: Int) {
        if (IsMoving()) {
            if (speed in 0..10)
                gear = 1
            else if (speed in 11..21)
                gear = 2
            else if (speed in 22..32)
                gear =3
            else if (speed in 33..43)
                gear =4
            else if (speed in 45..55)
                gear =5
            if (speed in 56..66)
                gear = 6
            else if (speed in 67..77)
                gear = 7
            else if (speed in 78..88)
                gear =8
            else if (speed in 89..99)
                gear =9
            else if (speed in 100..110)
                gear =10
        }
        else
            gear = 0
    }
    override fun speedUp() {
         speed+=5

    }














}