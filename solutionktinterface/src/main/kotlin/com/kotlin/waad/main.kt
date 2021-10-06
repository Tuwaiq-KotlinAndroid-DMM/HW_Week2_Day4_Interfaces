package com.kotlin.waad

fun main() {
    var car=SportCar(80)
 println(car.isMoving())//ok
    car.changeGear()
    println(car.gear)
    car.speedUp()
    println(car._speed)
    println(car.printStates())//ok
 var car2=Truck(40)
    println(car2.isMoving())
    car2.changeGear()
    println(car2.gear)
    car2.speedUp()
    println(car2._speed)
    println(car2.printStates())
    var car3=Truck(0)
    println(car3.isMoving())
    car3.changeGear()
    println(car3.gear)
    car.speedUp()
    println(car3._speed)
    println(car3.printStates())


}