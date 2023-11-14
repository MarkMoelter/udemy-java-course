package Polymorphism;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {

  private final String title;

  public Movie(String title) {
    this.title = title;
  }

  public void watchMovie() {
    String instanceType = this.getClass().getSimpleName();
    System.out.println(title + " is a " + instanceType + " film");
  }
}