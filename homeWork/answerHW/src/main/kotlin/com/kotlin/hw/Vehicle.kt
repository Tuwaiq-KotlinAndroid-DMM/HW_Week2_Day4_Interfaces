package com.kotlin.hw

open class Vehicle(var _speed:Int):IVehicle {

    protected var startEngine :Boolean = false
    var typeCar  =""
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

    open fun printStates():String{
        var str:String
        if (isMoving())
            str = "moving"
        else
            str ="stopped"

        return str

    }

}