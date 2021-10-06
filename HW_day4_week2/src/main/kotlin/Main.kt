import com.kotlin.hw.Sportcar
import com.kotlin.hw.Truck

fun main(args: Array<String>) {

   var sportcar= Sportcar("lexus",100,3,true)
   sportcar.isMoving()
   sportcar.speedUp()
   sportcar.changeGear(4)

   print("SportCar present state : ")
   sportcar.printStates()

   println("speed : ${sportcar.speed}\t gear : ${sportcar.gear}")

   var truck= Truck("lexus",100,3,true)
   truck.isMoving()
   truck.speedUp()
   truck.changeGear(4)
   print("SportCar present state : ")
   truck.printStates()

   println("speed : ${truck.speed}\t gear : ${truck.gear}")

  }