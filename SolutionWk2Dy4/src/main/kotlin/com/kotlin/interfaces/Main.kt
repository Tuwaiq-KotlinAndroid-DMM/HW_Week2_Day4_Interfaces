package com.kotlin.interfaces

fun main() {
    var _Vehicle = Vehicle(true, 0, 0, "Corolla")
    println(_Vehicle.speedUp())
    println(_Vehicle.changeGear())
    println( _Vehicle.printState())

    var _SportCar = Vehicle(true, 2, 40, "Corolla")
    println(_SportCar.speedUp())
    println(_SportCar.changeGear())
    println(_SportCar.printState())

    var _Truck = Vehicle(true, 2, 40, "Corolla")
   println( _Truck.speedUp())
   println( _Truck.changeGear())
   println( _Truck.printState())


}