package com.kotlin.vehicle

fun main(){

    var Sportcar1 = SportCar(true,"SportCar",80,5)
    Sportcar1.printStates()

    var truck = SportCar(true,"Truck",40,2)
    truck.printStates()
    truck.applyBrakes()
    truck.changeGear(0)
    truck.printStates()
}