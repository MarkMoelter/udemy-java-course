package PolymorphismChallenge;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    var myCar = new Car("2022 Blue Ferrari 296 GTS");
    var myGasPoweredCar = new GasPoweredCar("A yellow gas powered car", 15.4, 6);
    var myElectricCar = new ElectricCar("A red electric car", 100, 50);
    var myHybridCar = new HybridCar("A green hybrid car", 50, 25, 4);

    var cars = new ArrayList<Car>();

    cars.add(myCar);
    cars.add(myGasPoweredCar);
    cars.add(myElectricCar);
    cars.add(myHybridCar);

    for (var car : cars) {
      runRace(car);
    }

  }

  public static void runRace(Car car) {

    car.startEngine();
    car.drive();

  }
}