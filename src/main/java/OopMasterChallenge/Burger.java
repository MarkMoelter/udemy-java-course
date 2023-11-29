package OopMasterChallenge;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@ToString
public class Burger {

  /**
   * The price of the burger with no toppings.
   */
  protected final double basePrice;

  /**
   * The maximum number of toppings to add to the burger.
   */
  protected int maxToppings = 3;

  /**
   * The list of toppings added to the burger.
   */
  private ArrayList<Topping> toppings = new ArrayList<>();

  /**
   * Add a topping to the burger. Can add toppings up to the limit.
   * @param topping The topping to add to the burger.
   */
  public void addTopping(Topping topping) {
    if (toppings.size() < maxToppings) {
      System.out.printf("Adding topping, %s%n", topping);
      toppings.add(topping);
    } else {
      System.out.println("Max topping limit reached, unable to add topping");
    }
  }

  /**
   * The price of the burger with the toppings included
   * @return The price of the burger and toppings combined.
   */
  public double getTotalPrice() {
    double total = basePrice;
    for (Topping topping : toppings) {
      total += topping.price();
    }
    return total;
  }

}