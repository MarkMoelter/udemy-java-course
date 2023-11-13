package CompositionChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SmartKitchen {

  private CoffeeMaker brewMaster;
  private DishWasher dishWasher;
  private Refrigerator iceBox;

  public SmartKitchen() {
    this.brewMaster = new CoffeeMaker();
    this.dishWasher = new DishWasher();
    this.iceBox = new Refrigerator();
  }

  public void addWater() {
    this.brewMaster.setHasWorkToDo(true);
  }

  public void pourMilk() {
    this.iceBox.setHasWorkToDo(true);
  }

  public void loadDishwasher() {
    this.dishWasher.setHasWorkToDo(true);
  }

  public void setKitchenState(boolean coffeeFlag, boolean dishWasherFlag, boolean refrigeratorFlag) {
    brewMaster.setHasWorkToDo(coffeeFlag);
    dishWasher.setHasWorkToDo(dishWasherFlag);
    iceBox.setHasWorkToDo(refrigeratorFlag);
  }

  public void doKitchenWork() {
    brewMaster.brewCoffee();
    dishWasher.doDishes();
    iceBox.orderFood();
  }
}