public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage <= 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of the game");
        }
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    public static void main(String[] args) {
        Player player1 = new Player("Halil", 100, Weapon.KNIFE);
        System.out.println("Initial health: " + player1.healthRemaining());
        player1.loseHealth(30);
        System.out.println("After damage: " + player1.healthRemaining());

        player1.restoreHealth(20);
        System.out.println("After restoring health: " + player1.healthRemaining());
    }
}
