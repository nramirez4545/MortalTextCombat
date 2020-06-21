import java.util.Random;
import java.util.Scanner;

public class Characters {
	
	private int hp;
	private String name;
	private int strength;
	private int dmg;

	public Characters(int hp, String name, int strength) {
		
		this.hp = hp;
		this.name = name;
		this.strength= strength;
				
	}
	
	public void easyBattle() {
		Random rand = new Random();
		EnemyAI bot = new EnemyAI(100);
		System.out.println("Starting Battle!");
		System.out.println("Player health: " + this.hp);
		System.out.println("AI health: " + bot.getHealthpoints());
		while (this.hp > 0 && bot.getHealthpoints() > 0) {
			System.out.println("Type 1 to attack.");
			Scanner input = new Scanner(System.in);
			if (input.nextInt() == 1) {
				this.dmg = rand.nextInt(20);
				System.out.println("You hit the enemy for " + this.dmg + " damage.");
				System.out.println(" ");
				bot.damageEnemyHP(this.dmg);
				System.out.println("Player health: " + this.hp);
				System.out.println("AI health: " + bot.getHealthpoints());
				if (bot.getHealthpoints() > 0) {
					int dmg1 = rand.nextInt(20);
					//bot.setBotdmg(dmg1);
					this.hp = this.hp - dmg1;
					System.out.println("The enemy hit you for " + dmg1 + " damage.");
					System.out.println(" ");
					System.out.println("Player health: " + this.hp);
					System.out.println("AI health: " + bot.getHealthpoints());
				}
			}
			if (input.nextInt() == 2) {
				if (this.hp > 85) {
					this.hp = 100;
				}
				else {
					this.hp = this.hp + 15;
				}
				System.out.println("Your health has increased to " + this.hp);
			}
		}
		if (this.hp <= 0) {
			System.out.println("You have died. The enemy has won.");
			System.out.println("DEFEAT!");
		}
		if (bot.getHealthpoints() <= 0) {
			System.out.println("The enemy has died. You have won.");
			System.out.println("VICTORY!");
		}
	}
}
