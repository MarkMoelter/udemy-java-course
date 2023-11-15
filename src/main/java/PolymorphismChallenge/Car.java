package PolymorphismChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

  private final String description;

  public Car(String description) {
    this.description = description;
  }

  public void startEngine() {
    System.out.println("Car -> startEngine");
  }

  protected void runEngine() {
    System.out.println("Car -> runEngine");
  }

  public void drive() {
    System.out.println("Car -> driving, type is " + getClass().getSimpleName());
    runEngine();
  }
}