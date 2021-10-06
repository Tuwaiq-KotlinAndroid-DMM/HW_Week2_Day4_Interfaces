package com.kotlin.interfaceivehicle

import javax.script.AbstractScriptEngine

class SportCar(startEngine:Boolean, type:String, Speed: Int, gear : Int ): Vehicle(true, "boch", 120,3) {


    override fun changeGear(gGear: Int) {
        if (_startEngine) {
            when {
                (gGear >= 0 && gGear <= 5) -> _Gear = gGear
                else -> _Gear = 0
            }
            _Gear = 0
        }
    }

    override fun speedUp() {
         _Speed += 20

    }




}

