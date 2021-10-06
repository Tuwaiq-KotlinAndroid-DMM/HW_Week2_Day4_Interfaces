import com.kotlin.hw.SportCar
import com.kotlin.hw.Truck

fun main(args: Array<String>) {

    println("Enter your speed: ")
    var speedSport = readLine()!!.toInt()
    var sportCar = SportCar(speedSport)
    println("SportCar present state : ${sportCar.printStates()}")
    sportCar.changeGear(speedSport)
    println("speed: ${sportCar.speed}\t gear: ${sportCar.gear}")
    println()
    println("Enter your speed: ")
    var speedTruck = readLine()!!.toInt()
    var truck = Truck(speedTruck)
    println("SportCar present state : ${truck.printStates()}")
    truck.changeGear(speedTruck)
    println("speed: ${truck.speed}\t gear: ${truck.gear}")

}