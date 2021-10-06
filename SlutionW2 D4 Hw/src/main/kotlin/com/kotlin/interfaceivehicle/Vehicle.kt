package com.kotlin.interfaceivehicle

   open class Vehicle(): IVehicle

   { var _Speed:Int = 0
        var _Type : String= ""
       var _startEngine : Boolean = false
       var _Gear : Int =0

       constructor( startEngine : Boolean, Type : String,
                  Speed : Int, Gear : Int) : this() {
                       _startEngine = startEngine
                            _Type = Type
                         _Speed = Speed
                        _Gear = Gear

    }

       override fun isMoving(): Boolean {
           _startEngine == _Speed > 0
           return _startEngine
       }

       open fun speedUp() {
            this._Speed
       }

       open fun changeGear (gGear :Int) {
       _Gear = gGear



   }
       open fun applyBrakes(){

       }



       open fun setType(): String {
           return ""
       }


       open fun printStates(): String
       { var statecar : String
           if (_Speed > 0)
               statecar = "Moving"
           else
               statecar = "Not Moving"
           return statecar

       }

   }