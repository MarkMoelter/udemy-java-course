package OopMasterChallenge;


import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Drink {

  /**
   * The type of the drink.
   */
  private final String type;

  /**
   * The size of the drink.
   */
  private String size;

  /**
   * The price of the drink.
   */
  private double price;


  /**
   * Constructor to set the type and size of the drink.
   * @param type The type of the drink.
   * @param size The size of the drink. Must be 'Small', 'Medium', or 'Large'.
   */
  public Drink(String type, String size) {
    this.type = type;
    setSize(size);
  }

  /**
   * Set the size of the drink.
   * @param size The size of the drink. Must be 'Small', 'Medium', or 'Large'.
   */
  public void setSize(String size) {
    this.size = size;
    setPrice(size);
  }

  /**
   * Set the price of the drink based on the size of the drink.
   * @param size The size of the drink. Must be 'Small', 'Medium', or 'Large'.
   */
  private void setPrice(String size){
    this.price = switch (size) {
      case "Large" -> 3.00;
      case "Medium" -> 2.00;
      case "Small" -> 1.00;
      default -> throw new RuntimeException("Drink size value not 'Small', 'Medium', or 'Large'");
    };
  }
}