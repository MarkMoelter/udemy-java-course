package OopMasterChallenge;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

public class Burger extends Item {

  /**
   * The list of toppings added to the burger.
   */
  @Getter
  private final ArrayList<Item> toppings = new ArrayList<>();
  /**
   * The maximum number of toppings to add to the burger.
   */
  @Setter
  private int maxToppings = 3;

  public Burger(String name, double price) {
    super("Burger", name, price);
  }

  @Override
  public String getName() {
    return super.getName() + " BURGER";
  }

  @Override
  public double getAdjustedPrice() {
    double total = getBasePrice();
    for (Item topping : toppings) {
      total += topping.getAdjustedPrice();
    }
    return total;
  }

  public double getExtraPrice(String toppingName) {
    return switch (toppingName.toUpperCase()) {
      case "AVOCADO", "CHEESE" -> 1.0;
      case "BACON", "HAM", "SALAMI" -> 1.5;
      default -> 0.0;
    };
  }

  /**
   * Add a topping to the burger. Can add toppings up to the limit.
   *
   * @param topping The topping to add to the burger.
   */
  private void addTopping(Item topping) {
    if (toppings.size() < maxToppings) {
      toppings.add(topping);
    } else {
      System.out.println("Max topping limit reached, unable to add topping");
    }
  }

  public void addToppings(String topping1, String topping2, String topping3) {
    addTopping(new Item("topping", topping1, getExtraPrice(topping1)));
    addTopping(new Item("topping", topping2, getExtraPrice(topping2)));
    addTopping(new Item("topping", topping3, getExtraPrice(topping3)));
  }

  public void printItemizedList() {
    printItem("BASE BURGER", getBasePrice());
    for (var topping : toppings) {
      topping.printItem();
    }
  }

  @Override
  public void printItem() {
    printItemizedList();
    System.out.println("-".repeat(30));
    super.printItem();
  }
}