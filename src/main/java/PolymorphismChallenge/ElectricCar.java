package PolymorphismChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectricCar extends Car {

  private final double avgKmPerCharge;
  private final int batterySize;

  public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
    super(description);
    this.avgKmPerCharge = avgKmPerCharge;
    this.batterySize = batterySize;
  }
}