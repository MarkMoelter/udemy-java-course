public class DigitSumChallenge {

  public static void main(String[] args) {
    System.out.println(getEvenDigitSum(2000));
  }

  public static int sumDigits(int number) {
    if (number < 0) {
      return -1;
    }

    int sum = 0;
    while (number > 0) {
      sum += number % 10;
      number = number / 10;
    }

    return sum;
  }

  public static int getEvenDigitSum(int number) {
    if (number < 0) {
      return -1;
    }

    int sum = 0;
    String s = String.valueOf(number);
    char[] numberAsCharArray = s.toCharArray();
    System.out.println(numberAsCharArray);

    for (char c : numberAsCharArray) {
      if (c % 2 == 0) {
        sum += Integer.parseInt(Character.toString(c));
      }
    }
    return sum;
  }
}