package com.kotlin.hw

open class Vehicle(var _speed:Int,var _name:String):IVehicle {

    protected var startEngine :Boolean = false
    var typeCar  =_name
    var speed :Int = _speed
    var gear :Int = 0


    override fun isMoving():Boolean{
        startEngine = speed > 0
        return startEngine
    }


     open fun speedUp(){


     }

    open fun changeGear(a:Int){

    }

     fun applyBrakes(){
        speed = 0

    }

     fun setType(a:String){
        
    }

    open fun printStates(){
        var str:String
        if (isMoving())
            str = "moving"
        else
            str ="stopped"

        println("SportCar present state : $str\n" +
                "speed: $speed\t gear: $gear")


    }

}