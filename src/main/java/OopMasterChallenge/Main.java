package OopMasterChallenge;

public class Main {

  public static void main(String[] args) {
    Meal meal = new Meal();
    meal.addBurgerToppings("Bacon", "Cheese", "Mayo");
    meal.setDrinkSize("large");
    meal.printItemizedList();

    Meal secondMeal = new Meal("turkey", "7-up", "chile");
    secondMeal.addBurgerToppings("lettuce", "cheese", "mayo");
    secondMeal.setDrinkSize("small");
    secondMeal.printItemizedList();

    Meal deluxeMeal = new Meal(new DeluxeBurger(5.0), "coke", "fries");

    deluxeMeal.addBurgerTopping("Bacon");
    deluxeMeal.addBurgerTopping("Bacon");
    deluxeMeal.addBurgerTopping("Bacon");
    deluxeMeal.addBurgerTopping("Bacon");
    deluxeMeal.addBurgerTopping("Bacon");
    deluxeMeal.printItemizedList();
  }
}