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

  /**
   * Burger constructor.
   * @param name The name of the burger.
   * @param price The price of the burger.
   */
  public Burger(String name, double price) {
    super("Burger", name, price);
  }

  /**
   * Get the name of the burger.
   * @return The name of the burger.
   */
  @Override
  public String getName() {
    return super.getName() + " BURGER";
  }

  /**
   * Get the price of the burger plus the price of the toppings.
   * @return The price of the burger plus toppings.
   */
  @Override
  public double getAdjustedPrice() {
    double total = getBasePrice();
    for (Item topping : toppings) {
      total += topping.getAdjustedPrice();
    }
    return total;
  }

  /**
   * Get the price of each extra or topping.
   * @param toppingName The name of the topping.
   * @return The price of the topping.
   */
  public double getExtraPrice(String toppingName) {
    return switch (toppingName.toUpperCase()) {
      case "AVOCADO", "CHEESE" -> 1.0;
      case "BACON", "HAM", "SALAMI" -> 1.5;
      default -> 0.0;
    };
  }

  /**
   * Add a topping to the burger.
   * @param topping The topping to add to the burger.
   */
  private void addTopping(Item topping) {
    if (toppings.size() < maxToppings) {
      toppings.add(topping);
    } else {
      System.out.println("Max topping limit reached, unable to add topping");
    }
  }

  /**
   * Add a topping to the burger
   * @param toppingType The name of the topping to add to the burger.
   */
  public void addTopping(String toppingType) {
    addTopping(new Item("topping", toppingType, getExtraPrice(toppingType)));
  }

  /**
   * Print an itemized list of the burger and its toppings.
   */
  public void printItemizedList() {
    printItem("BASE BURGER", getBasePrice());
    for (var topping : toppings) {
      topping.printItem();
    }
  }

  /**
   * Print the itemized list and the burger's total.
   */
  @Override
  public void printItem() {
    printItemizedList();
    System.out.println("-".repeat(30));
    super.printItem();
  }
}