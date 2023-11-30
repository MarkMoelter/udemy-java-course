package OopMasterChallenge;

public class DeluxeBurger extends Burger {

  public DeluxeBurger(double basePrice) {
    super("deluxe", basePrice);
    setMaxToppings(5);
  }

  @Override
  public double getAdjustedPrice() {
    return getBasePrice();
  }

  @Override
  public double getExtraPrice(String toppingName) {
    return 0.0;
  }
}