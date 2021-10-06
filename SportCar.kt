package com.kotlin.homeworkweek2day4

class SportCar(startEngine: Boolean, type: String, speed: Int, gear:Int)
    :Vehicle(startEngine,type,speed,gear) {

  fun changeGear() {
        gear =  if(startEngine && speed in 0..5)
            return gear

        else 0
    }

     fun speedup(){
        speed += 20
    }
}
