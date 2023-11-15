package PolymorphismChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GasPoweredCar extends Car {

  private final double avgKmPerLitre;
  private final int cylinders;

  public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
    super(description);
    this.avgKmPerLitre = avgKmPerLitre;
    this.cylinders = cylinders;
  }

  @Override
  public void startEngine() {
    System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
  }

  @Override
  protected void runEngine() {
    System.out.printf("Gas -> Usage exceeds the average: %.2f %n", avgKmPerLitre);
  }
}