package OopMasterChallenge;

public class Main {

  public static void main(String[] args) {
    Item coke = new Item("drink", "coke", 1.50);
    coke.printItem();
    coke.setSize("large");
    coke.printItem();

    Item avocado = new Item("topping", "avocado", 1.50);
    avocado.printItem();

  }
}