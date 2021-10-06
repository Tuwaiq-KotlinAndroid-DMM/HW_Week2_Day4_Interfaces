package com.kotlin.homeworkweek2day4

fun main() {
var spCar = SportCar(true,"Sport Car",80, 5)
    println(spCar.startEngine)
    println(spCar.type)
    println(spCar.speed)
    println(spCar.gear)



    var truck = Truck(false , "Truk", 0, 0)
    println(truck.startEngine)
    println(truck.type)
    println(truck.speed)
    println(truck.gear)

}