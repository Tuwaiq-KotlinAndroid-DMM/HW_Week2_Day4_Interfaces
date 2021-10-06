package com.kotlin.hw
class SportCar(_speed:Int):Vehicle(_speed) {
    override fun speedUp(){
        speed +=20
    }

    override fun changeGear(a: Int) {

        if (startEngine){
            when (speed)
            {
                in 1..20 -> gear =1
                in 20..40 -> gear =2
                in 40..60 -> gear = 3
                in 60 ..80 -> gear = 4
                in 80 ..100 -> gear = 5
                else -> gear = 0
            }

        }else
            gear = 0

    }


}
