package com.kotlin.interfaces

class SportCar:Vehicle() {

    var t =ttype
    override fun changeGear():Int {
        var newgear=0
        if(startEngine==true){
            println("change the gear between 1 and 5")
             newgear= readLine()!!.toInt()
            when{
                newgear>0 && newgear<5 -> {

                    return newgear
                }
                else-> {
                    newgear = 0

                }

            }
        }
        return newgear
    }

    override fun speedUp():Int {
        speed +=20
        return speed

    }
}