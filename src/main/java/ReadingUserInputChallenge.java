import java.util.Scanner;

public class ReadingUserInputChallenge {

  public static void main(String[] args) {
    challenge();
  }

  public static void challenge() {

    Scanner scanner = new Scanner(System.in);

    int counter = 1;
    double sum = 0;

    do {
      System.out.println("Enter number #" + counter + ":");
      try {
        sum += Double.parseDouble(scanner.nextLine());
        counter++;
      } catch (NumberFormatException e) {
        System.out.println("Invalid number");
      }
    } while (counter <= 5);
    System.out.println("The sum of the 5 numbers = " + sum);
  }
}