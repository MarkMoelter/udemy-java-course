package OopMasterChallenge;

public class Main {

  public static void main(String[] args) {
    Meal defaultMeal = new Meal();

    Meal regularMeal = new Meal(
        new Burger(3.50),
        new Drink("Sprite", "Small"),
        new Side("Jalapeno Poppers", 2.00)
    );

    Meal deluxeMeal = new Meal(
        new DeluxeBurger(4.50),
        new Drink("Fanta", "Large"),
        new Side("Onion Rings", 1.00)
    );

    defaultMeal.addTopping(new Topping("Ketchup", 0.50));
    defaultMeal.printReceipt();
  }
}