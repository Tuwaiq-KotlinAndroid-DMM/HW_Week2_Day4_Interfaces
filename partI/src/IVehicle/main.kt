package IVehicle

fun main(){
    var sportCar = SportCar(true,"Formula 1",0,0)
    sportCar.speedUp()          //20
    sportCar.changeGear(5)
    sportCar.speedUp()
    sportCar.printStates()
    var truck = Truck(true,"Truck",0,0)
    truck.speedUp()          //5
    truck.changeGear(2)
    truck.speedUp()
    truck.printStates()




}