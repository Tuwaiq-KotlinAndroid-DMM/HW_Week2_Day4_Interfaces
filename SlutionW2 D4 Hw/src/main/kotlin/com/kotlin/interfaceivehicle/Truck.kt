package com.kotlin.interfaceivehicle

class Truck (): Vehicle(true, "havy duty", 15,1) {




     fun getGear(rGear : Int):Int  {
        _Gear = if (_startEngine && rGear in 0..10)
               return rGear
        else
            return 0

    }
}
