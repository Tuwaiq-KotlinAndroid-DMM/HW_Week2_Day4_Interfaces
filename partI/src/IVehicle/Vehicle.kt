package IVehicle

open class Vehicle(var _startEngine:Boolean,
                   var _type:String,
                   var _speed:Int,
                   var _gear:Int):IVehicle {

    override fun isMoving(): Boolean {
         if(_speed > 0){
             _startEngine = true
         }else{
             _startEngine = false
         }
        return _startEngine


    }

    open fun speedUp(){

    }

    open fun changeGear(input:Int) {

    }

    open fun setType() {

    }
   open fun printStates() {

    }

}