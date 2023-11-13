package ConstructorChallenge;

import lombok.Getter;

@Getter
public class Customer {

  private String name;
  private double creditLimit;
  private String email;

  public Customer(String name, double limit, String email) {
    this.name = name;
    creditLimit = limit;
    this.email = email;
  }

  public Customer(String name, String email) {
    this(name, 1000, email);
  }

  public Customer() {
    this("Default", "default@domain.com");
  }
}