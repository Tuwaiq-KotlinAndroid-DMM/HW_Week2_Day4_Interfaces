package com.kotlin.homeworkweek2day4

open class Vehicle( var startEngine: Boolean = true, var type: String, var speed: Int, var gear: Int): IVehicle {

    override fun isMoving(): Boolean {

       startEngine = speed>0
            return startEngine

    fun speedup():Int{
        return speed
    }

    fun changeGear(): Int{
        return 0
    }
    fun applyBrakes() {
        speed = 0
    }
    fun setType():String{
    return type
}
    fun printStates(){
      if(speed > 0)
          "Moving" }
    else( speed == 0) { "Stopped" }

    }

}
