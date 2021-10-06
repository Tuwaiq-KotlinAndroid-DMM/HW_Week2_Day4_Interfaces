package IVehicle

 class SportCar(_startEngin:Boolean,
                _type:String,
                _speed:Int,
                _gear:Int): Vehicle(_startEngin,_type,_speed, _gear) {

     override fun changeGear(input: Int) {
         if (_startEngine) {

             if(input < 0 || input > 5){
                 _gear = 0
                 println("invalid number")
         } else{
                 _gear = input

             }
         }
     }

     override fun speedUp() {
         if (_startEngine)
             _speed += 20
        }
     override fun printStates() {
         if (isMoving()){
             println("the state of the sport car: is moving")
         }else{
             println("the state of the sport car: is stopped")
         }
         println("speed = ${_speed} gear: ${_gear}")
     }
                }




