package OopMasterChallenge;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Meal {

  /**
   * The burger of the meal.
   */
  private Burger hamburger;

  /**
   * The drink of the meal.
   */
  private Drink drink;

  /**
   * The side of the meal.
   */
  private Side side;


  public Meal() {
    this(new Burger(3.50), new Drink("Coke", "Small"), new Side("Fries", 1.00));
  }

  /**
   * Add toppings to the burger.
   *
   * @param topping The topping to add to the burger.
   */
  public void addTopping(Topping topping) {
    hamburger.addTopping(topping);
  }

  /**
   * Change the size of the drink.
   *
   * @param newSize The new size of the drink.
   */
  public void changeDrinkSize(String newSize) {
    drink.setSize(newSize);
  }

  /**
   * Print out an itemized receipt.
   */
  public void printReceipt() {
    System.out.printf("Burger -> $%.2f%n", hamburger.getBasePrice());
    for (var topping : hamburger.getToppings()) {
      System.out.printf("\tTopping: %s -> $%.2f%n", topping.type(), topping.price());
    }
    System.out.printf("Drink -> $%.2f%n", drink.getPrice());
    System.out.printf("Side -> $%.2f%n", side.price());
    System.out.printf("Total price -> $%.2f%n", getTotalPrice());
  }

  /**
   * Get the total price of the meal.
   *
   * @return The price of the meal.
   */
  public double getTotalPrice() {
    double total = 0;

    total += hamburger.getTotalPrice();
    total += drink.getPrice();
    total += side.price();

    return total;
  }
}