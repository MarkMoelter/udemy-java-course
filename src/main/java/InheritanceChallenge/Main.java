package InheritanceChallenge;

public class Main {

  public static void main(String[] args) {
    SalariedEmployee myEmp = new SalariedEmployee("Mark", "08/23/1998", "01/01/2020", 80000);

    System.out.println(myEmp);

    System.out.println(myEmp.getAge());
    System.out.println(myEmp.collectPay());

    System.out.println(myEmp.isRetired());
    myEmp.retire();
    System.out.println(myEmp.isRetired());

  }
}