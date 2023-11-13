package InheritanceChallenge;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString.Exclude;


@NoArgsConstructor
public class SalariedEmployee extends Employee {
  @Exclude
  private double annualSalary;

  @Getter
  private boolean isRetired;

  public SalariedEmployee(String name, String birthDate, String hireDate,
      double annualSalary, boolean isRetired) {
    super(name, birthDate, hireDate);
    this.annualSalary = annualSalary;
    this.isRetired = isRetired;
  }

  public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
    this(name, birthDate, hireDate, annualSalary, false);
  }

  @Override
  public double collectPay() {
    double paycheck = annualSalary / 26;
    double adjustedPay = isRetired ? 0.9 * paycheck : paycheck;

    return Math.round(adjustedPay * 100) / 100.0;
  }

  public void retire() {
    this.isRetired = true;
  }

  @Override
  public String toString() {
    return "SalariedEmployee{" +
        "isRetired=" + isRetired +
        ", endDate='" + endDate + '\'' +
        '}';
  }
}