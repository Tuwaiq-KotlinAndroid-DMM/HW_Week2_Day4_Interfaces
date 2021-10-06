package com.kotlin.hw

class Truck(car:String,speed:Int,gear:Int,startEngine:Boolean): Vehicle(car,speed,gear,startEngine) {
    override fun changeGear(x: Int) {
        if ( startEngine){
            if (x in 0..10){
                gear = x
            }
            else
                gear = 0
        }
        else
            gear = 0
    }
    override fun speedUp() {
        speed+= 5

    }
}