package com.kotlin.vehicles

fun main() {
    var sport = SportCar(false, "Sport", 0, 0)
    sport.speedUp()
    sport.changeGear(3)
    sport.printStates()
    sport.startEngine = true
    sport.speedUp()
    sport.changeGear(2)
    var truck = Truck(false, "Truck", 0, 0)
    truck.speedUp()
    truck.changeGear(5)
    truck.printStates()
    truck.startEngine = true
    truck.speedUp()
    truck.changeGear(1)
    sport.printStates()
    truck.printStates()


}