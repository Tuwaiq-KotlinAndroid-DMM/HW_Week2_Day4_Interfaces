package com.kotlin.HW

fun main() {
println("enter a speed for soprt car")
var i = readLine()!!.toInt()
    var sport = SportCar(i)
    sport.changeGear(i)
    print("SportCar present state:")
    sport.printStates()
    print("speed ")
    print(sport.speed)
    print("\t")
    print(" gear")
    println(sport.gear)


    println("enter a speed for soprt car")
    var o = readLine()!!.toInt()
    var truck = SportCar(o)
    truck.changeGear(o)
    print("SportCar present state:")
    truck.printStates()
    print("speed ")
    print(truck.speed)
    print("\t")
    print(" gear")
    println(truck.gear)








//    println("  enter a speed for truck")
//    var o = readLine()!!.toInt()
//    var truck = Truck(o)
//    truck.changeGear(o)
//    println("Truck present state:")
//
//    println("speed")
//    println(truck.speed)
//    println(" gear")
//    println(truck.gear)



}