package com.kotlin.hanaa

fun main (){

    var S = SportCar(true, 60, "BMW", 5)

    println(S.printStates())
    println(S.speedup())
    S.changeGear(5)


    var T = Truck(true,35,"Mercedes",2)

    println(T.printStates())
    println(T.speedup())
    T.changeGear(2)



}