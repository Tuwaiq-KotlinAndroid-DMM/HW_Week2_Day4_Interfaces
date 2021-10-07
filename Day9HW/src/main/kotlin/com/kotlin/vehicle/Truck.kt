package com.kotlin.vehicle

class Truck():Vehicle("","",0,0) {

   override fun changeGear(value:Int){

       if(startEngine){
       if(value =>0 && value=<10)
           gear = value
       } else gear = 0
}}