package PolymorphismChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HybridCar extends Car {

  private final double avgKmPerLitre;
  private final int batterySize;
  private final int cylinders;

  public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
    super(description);
    this.avgKmPerLitre = avgKmPerLitre;
    this.batterySize = batterySize;
    this.cylinders = cylinders;
  }
}