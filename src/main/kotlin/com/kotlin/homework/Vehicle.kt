package com.kotlin.homework

open class Vehicle(var startEngine: Boolean, var type: String, var speed: Int, var gear: Int) : IVehicle {
    override fun isMoving(): Boolean {
        return 0 < speed
    }

    open fun speedUp() {
    }

    open fun changeGear(gear: Int) {
    }

    fun applyBrakes() {
    }

    fun setType(): String {
        return "default value"
    }

    open fun printStates() {

    }
}



