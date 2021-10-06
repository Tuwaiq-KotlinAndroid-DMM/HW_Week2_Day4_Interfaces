package com.kotlin.vehiclecars

class Truck : vehicle (true, "Lexus", 100,10){

    override fun changeGear():Int {

        if (speed >=0 && speed < 10) {
            gear = 1 }
        else if (speed >=10 && speed <20){
            gear = 2 }
        else if (speed >=20 && speed <30) {
           gear = 3 }
         else if (speed >=30 && speed <40){
             gear = 4 }
        else if (speed >=40 && speed <50){
             gear = 5 }
        else if (speed >=50 && speed <60){
            gear = 6 }
        else if (speed >=60 && speed <70){
            gear = 7 }
        else if (speed >=70 && speed <80){
            gear = 8 }
        else if (speed >=80 && speed <90){
            gear = 9 }
        else if (speed >=90 && speed <100){
            gear = 10 }
        return gear
    }


    override fun speedUp() {

        speed+=5
    }
}