# HW_Week2_Day4_Interfaces
The Home Work has to be delievered before 9AM: ⚠️

> Note: You must save all your solution as `solution.kt` to be submitted before 9AM. ⚠️
# Instructions 📋


### Write an interface named 'Vehicle' with following features:

Interfce functions:
- changeGear(int): Sets the gear number
- speedUp(int): Increments speed value.
- applyBrakes(int): Sets the speed to zero.
- printStates(): print the state of the vehicle.

### Write a class named 'Car' which implements from Vehicle interface with following features:

Properties:
- startEngine: boolean value for the engine state
- type: string value for the type of the vehicle 
- speed: int value for the speed of the vehicle
- gear: int value for the gear number of the vehicle


### Write a subclass named 'SportCar' which inherent from Car class with following features:

Class functions:
- changeGear(int): Checks the engine if it started it will change the gear number to a number between 0 and 5 otherwise sets to zero.
- speedUp(int): Increments speed value by 20.
- applyBrakes(int): Sets the speed to zero.
- printStates(): print the state of the vehicle.

### Write a subclass named 'Truck' which inherent from Car class with following features:

Class functions:
- changeGear(int): Checks the engine if it started it will change the gear number to a number between 0 and 10 otherwise sets to zero.
- speedUp(int): Increments speed value by 5.
- applyBrakes(int): Sets the speed to zero.
- printStates(): print the state of the vehicle.

Output:
```console
SportCar present state :
speed: 80 gear: 5
Truck present state :
speed: 40 gear: 2
```

