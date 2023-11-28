package PolymorphismChallenge;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Car myCar = new Car("2022 Blue Ferrari 296 GTS");
    Car ferrari = new GasPoweredCar("A yellow gas powered car", 15.4, 6);
    Car tesla = new ElectricCar("A red electric car", 568, 75);
    Car myHybridCar = new HybridCar("A green hybrid car", 16, 8, 8);

    ArrayList<Car> cars = new ArrayList<>();

    cars.add(myCar);
    cars.add(ferrari);
    cars.add(tesla);
    cars.add(myHybridCar);

    for (var car : cars) {
      runRace(car);
    }
  }

  public static void runRace(Car car) {

    car.startEngine();
    car.drive();
    System.out.println();

  }
}