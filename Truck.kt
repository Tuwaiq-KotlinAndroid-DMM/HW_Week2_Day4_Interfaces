package com.kotlin.homeworkweek2day4

class Truck(startEngine: Boolean, type: String, speed: Int, gear:Int)
    :Vehicle(startEngine,type,speed,gear) {

       override  fun changeGear(): Int {
        gear =  if(startEngine && changeGear() in 0..10)
            changeGear()
        else{
           return 0 }
        }

    fun speedup(){
        speed += 5
    }
}

