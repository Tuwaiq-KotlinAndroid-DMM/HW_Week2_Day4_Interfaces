package IVehicle

class Truck(_startEngin:Boolean,
            _type:String,
            _speed:Int,
            _gear:Int): Vehicle(_startEngin,_type,_speed, _gear) {

    override fun changeGear(input: Int) {
        if (_startEngine) {

            if(input < 0 || input > 10){
                _gear = 0
                println("invalid number")
            } else{
                _gear = input

            }
        }
    }

    override fun speedUp() {
        if (_startEngine)
            _speed += 5
    }
    override fun printStates() {
        if (isMoving()){
            println("the state of the Truck : is moving")
        }else{
            println("the state of the Truck: is stopped")
        }
        println("speed = ${_speed} gear: ${_gear}")
    }

}