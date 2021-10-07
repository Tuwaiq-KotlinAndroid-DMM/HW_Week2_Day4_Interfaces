class SportCar:Vehicle(false, "car", 30,2) {

    override  fun changeGear(number: Int){
       var  number = 0
        if (gear > 0){
            number.rangeTo(5)
        }else{
            number = 0
            }
        print("gear:$gear\t")
    }

  override  fun speedUp(){
        speed += 20
      print("speed: $speed\t")
    }


}