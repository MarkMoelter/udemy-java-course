import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMaxChallenge {

  public static void main(String[] args) {
    challenge();
  }

  public static void challenge() {
    ArrayList<Double> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Enter a number or any character to quit: ");
      try {
        numbers.add(Double.parseDouble(scanner.nextLine()));
        System.out.println("Minimum: " + Collections.min(numbers));
        System.out.println("Maximum: " + Collections.max(numbers));
      } catch (NumberFormatException e) {
        System.out.println("Quitting");
        break;
      }
    }
  }
}