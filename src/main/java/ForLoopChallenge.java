public class ForLoopChallenge {

  public static void main(String[] args) {
    System.out.println("Prime Count: " + challenge(10, 30));
  }

  public static int challenge(int min, int max) {
    if (max > 1000) {
      return -1;
    }

    int primeCounter = 0;
    for (int i = min; i < max; i++) {
      if (isPrime(i)) {
        System.out.println("Prime: " + i);
        primeCounter++;
      }
      if (primeCounter >= 3) {
        return primeCounter;
      }

    }

    return primeCounter;
  }

  public static boolean isPrime(int number) {
    if (number <= 2) {
      return (number == 2);
    }

    for (int divisor = 2; divisor < number; divisor++) {
      if (number % divisor == 0) {
        return false;
      }
    }

    return true;
  }
}