package OopMasterChallenge;


import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meal {

  /**
   * The burger of the meal.
   */
  private Burger burger;

  /**
   * The drink of the meal.
   */
  private Item drink;

  /**
   * The side of the meal.
   */
  private Item side;

  /**
   * Creates a meal with a regular burger, a coke, and fries.
   */
  public Meal() {
    this("regular", "coke", "fries");
  }

  /**
   * Create a meal consisting of a burger, a drink, and a side.
   *
   * @param burgerType The type of burger.
   * @param drinkType  The type of drink.
   * @param sideType   The type of side.
   */
  public Meal(String burgerType, String drinkType, String sideType) {
    this.burger = new Burger(burgerType, 4.0);
    this.drink = new Item("drink", drinkType, 1.00);
    this.side = new Item("side", sideType, 1.50);
  }

  /**
   * Get the total price of the meal.
   *
   * @return The price of the meal.
   */
  public double getTotalPrice() {
    return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
  }

  /**
   * Print out an itemized receipt.
   */
  public void printItemizedList() {
    burger.printItem();
    drink.printItem();
    side.printItem();
    System.out.println("-".repeat(30));
    Item.printItem("TOTAL PRICE", getTotalPrice());
  }

  /**
   * Add 3 toppings to the burger.
   *
   * @param topping1 First topping.
   * @param topping2 Second topping.
   * @param topping3 Third topping.
   */
  public void addBurgerToppings(String topping1, String topping2, String topping3) {
    burger.addTopping(topping1);
    burger.addTopping(topping2);
    burger.addTopping(topping3);
  }

  /**
   * Add toppings to the burger.
   *
   * @param toppings An arraylist of toppings to add.
   */
  public void addBurgerToppings(ArrayList<String> toppings) {
    for (String topping : toppings) {
      burger.addTopping(topping);
    }
  }

  /**
   * Change the size of the drink.
   *
   * @param size The new size of the drink.
   */
  public void setDrinkSize(String size) {
    drink.setSize(size);
  }
}