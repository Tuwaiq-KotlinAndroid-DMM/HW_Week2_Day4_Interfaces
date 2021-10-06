package com.kotlin.vehiclecars

class SportCar : vehicle (true,"MUSTANG",120, 5) {

    override fun changeGear () : Int {
        if (speed >= 20 && speed <40){
            gear = 1
        }  else if (speed >=40 && speed <60){
            gear = 2
        }  else if (speed >=60 && speed <80){
            gear = 3
        }  else if (speed >=80 && speed <100){
            gear = 4
        }
        else if (speed >=100 && speed <120){
            gear = 5
        }
        return gear
 }

    override fun speedUp() {
        speed+=20
    }

}