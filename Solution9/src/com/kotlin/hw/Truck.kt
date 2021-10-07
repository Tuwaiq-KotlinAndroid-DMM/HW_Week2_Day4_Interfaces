package com.kotlin.hw

class Truck( speed:Int,  gear:Int):Vehicle(speed,gear) {

    override fun changegear(gear: Int) {
        if(startengine==true)
        {
            if(gear>=0 && gear<=10)
            {
                this.gear=gear
            }
            else
            {
                println("Invalid")
            }

        }
        else
        {
            this.gear=0
        }
    }

    override fun speedUp() {
        this.speed=this.speed+5
    }

    override fun printstate()
    {
        if(speed>0)
        {
            println(" Truck State: moving,speed: "+speed+" gear: "+gear)
            startengine=true

        }
        else
        {
            println(" Truck state:Stopped, speed"+speed+" gear: "+gear)
            startengine=false
        }

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

    override fun settype(type:String)
    {
        this.type=type
    }

    override fun applaybreaks()
    {
        speed=0
    }
}