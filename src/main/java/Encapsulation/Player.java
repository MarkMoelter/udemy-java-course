package Encapsulation;

public class Player {

  private String name;
  private int health;
  private String weapon;

  public Player(String name) {
    this(name, 100, "Sword");
  }

  public Player(String name, int health, String weapon) {
    this.name = name;
    this.health = Math.min(Math.max(health, 1), 100);
    this.weapon = weapon;
  }

  public int healthRemaining() {
    return health;
  }

  public void loseHealth(int damage) {
    health -= damage;
    if (health <= 0) {
      System.out.println("Player knocked out of game");
    }
  }

  public void restoreHealth(int extraHealth) {
    health += extraHealth;

    if (health > 100) {
      System.out.println("Player restored to 100%");
      health = 100;
    }
  }
}