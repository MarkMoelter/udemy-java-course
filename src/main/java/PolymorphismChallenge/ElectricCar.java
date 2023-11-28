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

  @Override
  public void startEngine() {
    System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
  }

  @Override
  protected void runEngine() {
    System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
  }
}