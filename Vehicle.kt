package com.kotlin.homeworkweek2day4

open class Vehicle(var startEngine: Boolean = true, var type: String, var speed: Int, var gear: Int) : IVehicle {

    override fun isMoving(): Boolean {

        startEngine = speed > 0
        return startEngine
    }
        open fun speedup(): Int {
            return speed
        }

        open fun changeGear(_gear: Int) {
            gear = 0
        }

        fun applyBrakes() {
            speed = 0
        }

        fun setType(): String {
            return type
        }

        fun printStates() {
            if (speed > 0) {
                println("Moving")
            } else if(speed == 0) {
                println("Stopped")
            }
        }



    }
