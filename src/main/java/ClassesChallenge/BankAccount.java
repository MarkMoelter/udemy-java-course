package ClassesChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {

  private int number;

  private int balance;

  private String customerName;

  private String email;

  private String phoneNumber;

  public BankAccount(int number, int balance, String customerName, String email,
      String phoneNumber) {
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  /**
   * Deposit funds into your account.
   *
   * @param amount The amount to deposit, must be positive.
   * @return 0 for operation success or -1 for operation error.
   */
  public int depositFunds(int amount) {
    if (amount < 0) {
      return -1;
    }
    this.balance += amount;
    return 0;
  }

  /**
   * Withdraw funds from your account.
   *
   * @param amount The amount to withdraw, must be positive.
   * @return 0 for operation success or -1 for operation error.
   */
  public int withdrawFunds(int amount) {
    if (amount > this.balance || amount < 0) {
      return -1;
    }
    this.balance -= amount;
    return 0;
  }
}