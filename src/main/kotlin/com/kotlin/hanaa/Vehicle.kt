package com.kotlin.hanaa

open class Vehicle(var startEngine:Boolean=true, var speed: Int, var type:String, var gear: Int) : IVehicle {


    override fun isMoving(): Boolean {
        if (speed > 0)
            return true
        else
            return false
    }

    open fun speedup() {
    }

  open fun changeGear(G:Int) {
    }

    open fun applyBrakes() {
        speed = 0
    }

  open  fun setType() {
    }

    open fun printStates(): String {
        var state: String
        if (isMoving())
            return "moving"
        else
            return "stopped"


    }
}


