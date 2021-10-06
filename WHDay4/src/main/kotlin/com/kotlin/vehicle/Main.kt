package com.kotlin.vehicle

fun main() {
    var sport = SportCar(true, "Sport Car:Mazda", 40, 2)
    with(sport) {
        changeGear(5)
        speedUp()
        printState()
    }

    var sport1 = SportCar(false, "Sport Car:Porsche", 0, 0)
    with(sport1) {
        changeGear(0)
        //speedUp() because it has no speed
        printState()
    }

    var truck = Truck(false, "Yellow Truck", 0, 0)
    with(truck) {
        changeGear(0)
        //speedUp() because it has no speed
        printState()
    }
    var truck1 = Truck(true, "Red Truck", 40, 2)
    with(truck1) {
        changeGear(3)
        speedUp()
        printState()
    }
}