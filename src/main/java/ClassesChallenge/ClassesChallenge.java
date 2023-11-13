package ClassesChallenge;

public class ClassesChallenge {

  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount(1, 1000, "Mark", "mark@bank.com", "1234567890");
    System.out.println(myAccount.getBalance());

    System.out.println(myAccount.depositFunds(100));
    System.out.println(myAccount.getBalance());

    System.out.println(myAccount.withdrawFunds(2000));
    System.out.println(myAccount.getBalance());

  }
}