import com.kotlin.hw.SportCar
import com.kotlin.hw.Truck

fun main(args: Array<String>) {

    println("Enter your speed: ")
    var speedSport = readLine()!!.toInt()
    println("Enter your car: ")
    var carSport = readLine()!!
    var sportCar = SportCar(speedSport,carSport)
    sportCar.isMoving()
    sportCar.changeGear(4)
   sportCar.printStates()
    println()
    println("Enter your speed: ")
    var speedTruck = readLine()!!.toInt()
    println("Enter your car: ")
    var carTruck = readLine()!!
    var truck = Truck(speedTruck,carTruck)
    truck.isMoving()
    truck.changeGear(3)
    truck.printStates()

}