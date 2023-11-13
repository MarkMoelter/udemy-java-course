package CompositionChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoffeeMaker {

  private boolean hasWorkToDo;

  public void brewCoffee() {
    if (hasWorkToDo) {
      System.out.println("Brewing coffee");
      hasWorkToDo = false;
    }
  }
}