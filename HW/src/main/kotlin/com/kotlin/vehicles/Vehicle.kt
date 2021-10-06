package com.kotlin.vehicles

open class Vehicle(var startEngine: Boolean, var type: String, var speed: Int, var gear: Int) : IVehicle {

    override fun isMoving(): Boolean {
        return speed > 0
    }

    open fun speedUp() {
        
    }

    open fun changeGear(value: Int) {

    }

    fun applyBreaks() {
        speed = 0
    }

    fun assignType(value: String) {
        type = value
    }

    open fun printStates() {

    }
}