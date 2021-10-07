fun main(args: Array<String>) {
var sport = SportCar()
println("SportCar present state :")
    sport.changeGear(2)
    sport.speedUp()

    var truck = Truck()
    println("\n")
    println("Truck present state :")
    truck.changeGear(6)
    truck.speedUp()

    println("\n")
    println("Truck present state :")
    truck.changeGear(0)
    truck.speedUp()
}