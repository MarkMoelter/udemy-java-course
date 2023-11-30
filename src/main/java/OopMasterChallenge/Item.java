package OopMasterChallenge;

import lombok.Getter;

@Getter
public class Item {

  /**
   * The type of the item.
   */
  private final String type;

  /**
   * The name of the item.
   */
  private final String name;

  /**
   * The price of the item.
   */
  private final double basePrice;

  /**
   * The size of the item.
   */
  private String size = "MEDIUM";

  /**
   * Create an item.
   *
   * @param type  The type of the item.
   * @param name  The name of the item.
   * @param price The name of the item.
   */
  public Item(String type, String name, double price) {
    this.type = type.toUpperCase();
    this.name = name.toUpperCase();
    basePrice = price;
  }

  /**
   * Print the name and price of the item.
   *
   * @param name  The name of the item.
   * @param price The price of the item.
   */
  public static void printItem(String name, double price) {
    System.out.printf("%20s:%6.2f%n", name, price);
  }

  /**
   * Get the name of the item based on the item's type.
   *
   * @return The name of the item.
   */
  public String getName() {
    return switch (type) {
      case "SIDE", "DRINK" -> size + " " + name;
      default -> name;
    };
  }

  /**
   * Get the price of the item based on its size.
   *
   * @return The price of the item.
   */
  public double getAdjustedPrice() {
    return switch (size) {
      case "SMALL" -> getBasePrice() - 0.5;
      case "LARGE" -> getBasePrice() + 1;
      default -> getBasePrice();
    };
  }

  /**
   * Set the size of the item.
   *
   * @param size The size of the item.
   */
  public void setSize(String size) {
    this.size = size.toUpperCase();
  }

  /**
   * Print the name and price of this object.
   */
  public void printItem() {
    printItem(getName(), getAdjustedPrice());
  }
}