package com.kotlin.vehicle

open class Vehicle(var startEngine: Boolean, var type: String, var speed: Int, var gear: Int) : Ivehicle {
    override fun isMoving(): Boolean {
        if (speed > 0) return true
    } else
    return false

    open fun speedUp() {
    }

    open fun changeGear(value: Int): {}
    gear = value

    fun applyBrakes() {}

    fun setTypes(): String{
        return type
    }

    fun printStates() {

    if(speed > 0)
    { println("$type present state : (Moving)")}
    else {
        println("$type present state : (Is Not Moving)")
    }
}}