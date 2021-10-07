package com.kotlin.interfaces

    class SportCar(startEngine: Boolean = true, gear: Int = 5, speed: Int = 80, type: String = "Lamborghini"): Vehicle(startEngine, gear, speed, type) {
        override fun changeGear(){
            return println(5)
        }
        override fun speedUp(){
            return println(80)
        }

       override fun printState(){
             return println("moving")
        }
}