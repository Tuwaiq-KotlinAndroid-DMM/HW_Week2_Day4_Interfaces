import com.kotlin.vehicle.SportCar
import com.kotlin.vehicle.Truck

fun main() {
    val sportCar = SportCar(true,"SportCar",80,5)
    println(sportCar.isMoving())
    println(sportCar.gear)
    println(sportCar.speed)
    println(sportCar.printStates())



    val truck = Truck(false,"Truck",40,2)
    println(truck.isMoving())
    println(truck.gear)
    println(truck.speed)
    println(truck.printStates())


}
