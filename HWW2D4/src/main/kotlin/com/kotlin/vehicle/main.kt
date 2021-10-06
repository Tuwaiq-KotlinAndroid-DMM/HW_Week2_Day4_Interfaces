package com.kotlin.vehicle

fun main() {
    var S = Sportcar(true,"Ford",60,5)
    println("Type ${S.setType()}")
    println("Speed of the car is ${S.speedUp()}")
    println("Gear : ${S.changeGear()}")
    S.printStates()
    var t = Truck(true,"VW",20,2)
    println("Type ${t.setType()}")
    println("Speed of the car is ${t.speedUp()}")
    println("Gear : ${t.changeGear()}")
    t.printStates()
    var b = Truck(false,"VW",0,0)
    println("Type(steady) ${b.setType()}")
    println("Speed of the car is ${b.speedUp()}")
    println("Gear : ${b.changeGear()}")
    b.printStates()
}