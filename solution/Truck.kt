package com.kotlin.solution

class Truck(startEngine: Boolean, _type: String, speed: Int, gear: Int) :Vehicle(startEngine, _type, speed, gear) {


    override fun changeGear(g: Int) {
        if(startEngine==true){
            if(gear < 10) {
                if(g < 10){
                    gear++
                }
            }



        }else{
                gear
        }
    }
    override fun speedUp() {
        speed = speed+5
    }

}