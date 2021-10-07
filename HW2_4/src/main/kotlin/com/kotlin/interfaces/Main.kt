package com.kotlin.interfaces

fun main() {
    val vehicle=Vehicle()
    vehicle.setType()
    println(vehicle.ttype)

    if(vehicle.ttype=="sport"){
        val sportCar=SportCar()
        println(sportCar.isMoving())
        println(sportCar.speed)
        println(sportCar.changeGear())

    }else if(vehicle.ttype=="truck"){
        val truck=Truck()
        println(truck.isMoving())
        println(truck.speed)
        println(truck.changeGear())
    }


}