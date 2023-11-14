package EncapsulationChallenge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Printer {

  private final boolean duplex;
  private int tonerLevel;
  private int pagesPrinted = 0;

  public Printer(int tonerLevel, boolean duplex) {
    this.tonerLevel = tonerLevel;
    this.duplex = duplex;
  }

  public Printer(boolean duplex) {
    this(100, duplex);
  }

  public int addToner(int tonerAmount) {
    int tempAmount = tonerLevel + tonerAmount;

    if (tonerAmount <= 0 || tonerAmount > 100 || tempAmount > 100) {
      return -1;
    }

    tonerLevel += tonerAmount;
    return tonerLevel;
  }

  public int printPages(int pages) {
    if (pages < 0) {
      return -1;
    }

    int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
    pagesPrinted += jobPages;
    return jobPages;
  }
}