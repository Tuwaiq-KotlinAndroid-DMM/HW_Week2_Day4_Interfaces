package com.kotlin.vehicle

class SportCar(startEngine: Boolean, type: String, speed: Int, gear: Int) : Vehicle(startEngine, type, speed, gear) {

   override fun changeGear(number:Int){
         if (startEngine)
             gear= (0..5).random()
       else
           gear=0
   }

    override fun speedUp() {
        speed+=20
    }
}