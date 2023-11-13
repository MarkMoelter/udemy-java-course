import java.util.ArrayList;

public class WhileLoopChallenge {

  public static void main(String[] args) {
    for (Integer integer : challenge(5, 20)) {
      System.out.println(integer);
    }
  }

  public static boolean isEvenNumber(int number) {
    return number % 2 == 0 && number != 0;
  }

  public static ArrayList<Integer> challenge(int start, int end) {
    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
    int i = start;

    while (i <= end) {
      if (isEvenNumber(i)) {
        evenNumbers.add(i);
      }
      if (evenNumbers.size() == 5) {
        break;
      }
      i++;
    }
    return evenNumbers;
  }

}