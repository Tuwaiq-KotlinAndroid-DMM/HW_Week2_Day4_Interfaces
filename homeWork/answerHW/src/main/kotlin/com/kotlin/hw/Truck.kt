package com.kotlin.hw

class Truck(_speed:Int,_name:String) : Vehicle(_speed,_name) {

    override fun changeGear(a: Int) {
        if(startEngine){
           if (a >= 0 && a <=5)
               gear = a
            else
                gear = 0
        }else
            gear = 0

        // in below, the change of gear depends on speed , because the question wasn't clear enough for me
        /*when (speed)
        {
            in 1..20 -> gear =1
            in 20..40 -> gear =2
            in 40..60 -> gear = 3
            in 60 ..80 -> gear = 4
            in 80 ..100 -> gear = 5
            else -> gear = 0
        }*/

    }

    override fun speedUp() {
         speed +=5

    }
}