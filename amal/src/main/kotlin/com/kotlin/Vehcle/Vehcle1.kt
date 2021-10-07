package com.kotlin.Vehcle


    open class Vehicle(var startEngine: Boolean, var type: String, var speed: Int, var gear: Int)  {
        open fun isMoving(): Boolean {
            return speed > 0
        }

        open fun speedUp() {
            speed++
        }

        open fun changeGear(newGear: Int) {
            gear = newGear
        }

        fun applyBrakes() {
            speed = 0
        }

        @JvmName("setType1")
        fun setType(newType: String) {
            type = newType
        }

        fun printStates() {
            var move = if (isMoving())
                "(Moving)"
            else
                "(Stopped)"
            println("$type present state : $move")
            println("speed: $speed gear: $gear")
        }
    }

}