package CompositionChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DishWasher {

  private boolean hasWorkToDo;

  public void doDishes() {
    if (hasWorkToDo) {
      System.out.println("Doing dishes");
      hasWorkToDo = false;
    }
  }
}