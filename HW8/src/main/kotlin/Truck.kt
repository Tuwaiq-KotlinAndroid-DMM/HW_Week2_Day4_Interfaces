class Truck : Vehicle(false, "car", 50,1) {
    override  fun changeGear(number: Int){
        var  number = 0
        if (gear > 0){
            number.rangeTo(10)
        }else{
            number = 0
        }
      print("gear:$number\t")
    }

    override  fun speedUp(){
        speed += 5

        print("speed: $speed\t")
    }
}