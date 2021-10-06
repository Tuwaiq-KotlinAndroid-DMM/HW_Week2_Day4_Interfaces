package com.kotlin.vehicle

open class Vehicle ( var startEngine: Boolean,
                     var type: String,
                     var speed: Int,
                     var gear: Int):IVehicle {
    override fun isMoving(): Boolean{
        return speed > 0
    }
    open fun speedUp() {
         speed++
    }
    open fun changeGear(Cargear: Int){
        gear = Cargear
    }
     fun applyBrake() {
        speed= 0
    }
    fun setTyp(cartype:String){
        type=cartype
    }
     fun printStates(){
        var status = if (isMoving()){
            println("The vehicle is moving ")
        }
        else {
            println(" The vehicle is not moving")
        }
    }
}