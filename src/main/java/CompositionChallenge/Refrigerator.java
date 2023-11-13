package CompositionChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Refrigerator {

  private boolean hasWorkToDo;

  public void orderFood() {
    if (hasWorkToDo) {
      System.out.println("Ordering food");
      hasWorkToDo = false;
    }
  }
}