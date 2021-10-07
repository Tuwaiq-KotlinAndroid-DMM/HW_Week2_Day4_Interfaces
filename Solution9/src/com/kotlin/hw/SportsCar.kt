package com.kotlin.hw

class SportsCar( speed:Int,  gear:Int):Vehicle(speed,gear) {

    override fun changegear(gear: Int) {
        if(startengine==true)
        {
            if(gear>=0 && gear<=5)
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
        this.speed=this.speed+20
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

    override fun printstate()
    {
        if(speed>0)
        {
            println(" Sportscar State: moving,speed: "+speed+" gear: "+gear)
            startengine=true

        }
        else
        {
            println("state:Stopped, speed"+speed+" gear: "+gear)
            startengine=false
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