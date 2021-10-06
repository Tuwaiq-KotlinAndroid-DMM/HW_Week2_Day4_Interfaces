package com.kotlin.waad

class Truck(_speed:Int):Vehicle(_speed = 40) {
    override fun changeGear() {
        when(speed){
            in 0..10->gear=1
            in 11..21->gear=2
            in 30..40->gear=3
            in 44..50->gear=4
            in 55..60->gear=5
            in 70..75->gear=6
            in 80..85->gear=7
            in 90..95->gear=8
            in 100..105->gear=9
            in 110..115->gear=10
            else->gear=0
        }

    }

    override fun speedUp() {
        speed+=5
    }
}