package com.kotlin.vehicle

fun main() {


    var miniTruck = Truck(true, "small truck", 100, 5)

    miniTruck.speedUp()

    miniTruck.changeGear(2)

    miniTruck.printStates()


    var largeTruck = Truck(false, "big truck", 0, 0)

    largeTruck.changeGear(-1)

    largeTruck.speedUp()

    largeTruck.printStates()

    var sport = SportCar()

    sport.speedUp()

    sport.isMoving()

    sport.changeGear(5)

    sport.printStates()


}