package com.kotlin.vehiclecars

fun main (){
    var Vehicle = vehicle ()
    var mySportCar = SportCar ()
    var myTruck = Truck ()
    print("SportCar present state: ")
    mySportCar.printStates()
    println("Speed: ${mySportCar.speed} Gear: ${mySportCar.gear}")

    print("Truck present state: ")
    myTruck.printStates()
    println("Speed: ${myTruck.speed} Gear: ${myTruck.gear}")


//
//    myTruck.speedUp()
//     (Vehicle.printStates())
//    println(mySportCar.changeGear())
//    (mySportCar.speedUp())
//   println (myTruck.changeGear())
//    (myTruck.speedUp())

}