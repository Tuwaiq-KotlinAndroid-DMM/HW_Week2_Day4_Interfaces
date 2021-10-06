package com.kotlin.vehicle

open class Vehicle(var startEngine: Boolean, var type: String, var speed: Int, var gear: Int) : IVehicle {


    override fun IsMoving(): Boolean {
        if (speed > 0) return true
        else return false
    }

    open fun speedUp() {
        speed++
    }

    open fun changeGear(gearOfCar: Int) {
        gear = gearOfCar

    }

    fun applyBreaks() {
        speed = 0

    }

    fun setTypes(typeOfCar: String) {
        type = typeOfCar
    }

    fun printState() {
        var status = if (IsMoving()) {
            println("$type's status is: moving")
        } else {
            println("$type's  status is: stopped")
        }
        println("$type speed is: $speed and the gear is : $gear")

    }
}
