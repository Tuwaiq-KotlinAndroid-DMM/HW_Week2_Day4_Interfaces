package com.kotlin.hw

class Truck(_speed:Int) : Vehicle(_speed) {

    override fun changeGear(a: Int) {
        if(startEngine){
            when(speed){
                in 0..5 -> gear = 1
                in 6 ..11 -> gear = 2
                in 12 ..17 -> gear =3
                in 18 .. 23 -> gear = 4
                in 24 .. 29 -> gear = 5
                in 30 .. 35 -> gear = 6
                in 36 ..41 -> gear = 7
                in 42 .. 47 -> gear =8
                in 48 .. 53 -> gear =9
                in 54 .. 59 -> gear = 10
                else -> gear = 0
            }

        }else
            gear = 0
    }

    override fun speedUp() {
         speed +=5

    }
}