package com.kotlin.Vehcle

class Sportcar :Vehcle{
    fun main() {
        var sportCar = (true, "SportCar", 60, 3)
        sportCar.speedUp()
        sportCar.changeGear(5)
        sportCar.printStates()

        var truck1 = Truck(true, "Truck", 35, 0)
        truck1.speedUp()
        truck1.changeGear(2)
        truck1.printStates()

        var truck2 = Truck(false, "Truck", 0, 0)
//    truck2.speedUp()
        truck2.changeGear(-1)
        truck2.printStates()
    }

}