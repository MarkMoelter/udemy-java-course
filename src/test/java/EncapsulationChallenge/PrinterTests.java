package EncapsulationChallenge;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PrinterTests {

  @Test
  void printPages_duplexPrinterFivePages_returnsThree() {
    var printer = new Printer(true);
    assertThat(printer.printPages(5)).isEqualTo(3);
  }

  @Test
  void printPages_printerFivePages_returnsFive() {
    var printer = new Printer(false);
    assertThat(printer.printPages(5)).isEqualTo(5);
  }

  @Test
  void addToner_tonerAbove100_returnsNegativeOne() {
    var printer = new Printer(false);
    assertThat(printer.addToner(105)).isEqualTo(-1);
  }

  @Test
  void addToner_tonerBelowZero_returnsNegativeOne() {
    var printer = new Printer(0, false);
    assertThat(printer.addToner(-10)).isEqualTo(-1);
  }
}