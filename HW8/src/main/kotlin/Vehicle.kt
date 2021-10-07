open class Vehicle(_startEngine:Boolean, _type:String, _speed:Int,_gear:Int) : IVehicle {

    var startEngine = _startEngine
    var type = _type
    var speed =_speed
    var gear = _gear
    override fun isMoving():Boolean {
      if (speed > 0){
          return true
    }else
        return false
    }

   open  fun speedUp(){
         speed ++
     }

   open fun changeGear(number: Int){
        gear =+ number
    }

    fun applyBrakes(){
        speed = 0
    }

    fun setType(){
        type = "car"
    }

    fun printStates(){
  println("the state of the vehicle either is moving or not: ${isMoving()}")
    }
}