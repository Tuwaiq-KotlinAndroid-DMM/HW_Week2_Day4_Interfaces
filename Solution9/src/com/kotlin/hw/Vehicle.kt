package com.kotlin.hw



open class Vehicle(speed:Int,gear:Int):IVehicle {
var startengine:Boolean=true
var type:String=" "
    var speed:Int=0
    var gear:Int=0
    init {
        this.speed=speed
        this.gear=gear
    }

    override fun isMoving(): Boolean {
        if(speed>0)
        {
            return true
        }
        else
        {
            return false
        }
    }

open fun speedUp()
{
    speed=speed+1
}
    open fun changegear(gear:Int)
    {
        this.gear=gear
    }
    open fun applaybreaks()
    {
        speed=0
    }

    open fun settype(type:String)
    {
        this.type=type
    }
    open fun printstate()
    {
     if(speed>0)
     {
         println("State: moving,speed: "+speed+" gear: "+gear)
         startengine=true

     }
        else
     {
         println("state:Stopped, speed"+speed+" gear: "+gear)
         startengine=false
     }

    }
}