package com.kotlin.vehicle

class Truck(startEngine: Boolean, type: String,  speed:Int, gear: Int) :Vehicle (startEngine,type,speed,gear){
    override   fun isMoving():Boolean {
        startEngine = speed > 0
        return startEngine
    }
    override  fun speedUp(): Int {
        return if (startEngine){
            speed
        } else 0
    }
    override  fun changeGear():Int {
        return if (startEngine){
            gear
        } else 0
    }
    override   fun setType():String{
        return type
    }
    override   fun printStates(){

        if (speed == 0 || !startEngine){
            println("SportCar present state : Not Moving")
        }
        else if ( speed > 0){
            println("SportCar present state : Moving")
        }
    }
}