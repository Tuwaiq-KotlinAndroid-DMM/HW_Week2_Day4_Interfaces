package com.kotlin.vehicle

fun main(){

    val sportCar = SportCar(true,"SportCar",80,5)
    sportCar.printStates()

    val truck = SportCar(true,"Truck",40,2)
    truck.printStates()
    truck.applyBrakes()
    truck.changeGear(0)
    truck.printStates()
}