package OopMasterChallenge;

import lombok.Getter;

@Getter
public class Item {

  private final String type;
  private final String name;
  private final double basePrice;
  private String size = "MEDIUM";

  public Item(String type, String name, double price) {
    this.type = type.toUpperCase();
    this.name = name.toUpperCase();
    basePrice = price;
  }

  public static void printItem(String name, double price) {
    System.out.printf("%20s:%6.2f%n", name, price);
  }

  public String getName() {
    return switch (type) {
      case "SIDE", "DRINK" -> size + " " + name;
      default -> name;
    };
  }

  public double getAdjustedPrice() {
    return switch (size) {
      case "SMALL" -> getBasePrice() - 0.5;
      case "LARGE" -> getBasePrice() + 1;
      default -> getBasePrice();
    };
  }

  public void setSize(String size) {
    this.size = size.toUpperCase();
  }

  public void printItem() {
    printItem(getName(), getAdjustedPrice());
  }
}