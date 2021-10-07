package com.kotlin.interfaces

  class Truck(startEngine: Boolean = false, gear: Int = 0, speed: Int = 0, type: String = "MiniCab"): Vehicle(startEngine, gear, speed, type) {

      override fun changeGear(){
          return println(0)
      }
       override fun speedUp(){
           return println(0)
       }


      override fun printState(){
          return println("not moving")
      }

 }