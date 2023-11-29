package OopMasterChallenge;

public class DeluxeBurger extends Burger {

  public DeluxeBurger(double basePrice) {
    super(basePrice);
    maxToppings = 5;
  }

  @Override
  public double getTotalPrice() {
    return basePrice;
  }
}