import java.util.Random;
import java.util.Scanner;

public class FightClass {

	private int hp;
	EnemyAI bot = new EnemyAI(100);
	private int dmg;
	private int healingPotion;
	private int damagePotion;
	private boolean dmgAmp;
	private int xp;

	public FightClass(int hp, int dmg, int healingPotion, int damagePotion, boolean dmgAmp, int xp) {
		this.hp = hp;
		this.dmg = dmg;
		this.healingPotion = healingPotion;
		this.damagePotion = damagePotion;
		this.dmgAmp = dmgAmp;
		this.xp = xp;
	}

	public void easy() {

		Random rand = new Random();
		
		System.out.println("Starting Battle!");
		System.out.println("Player health: " + this.hp);
		System.out.println("Player Potions: "+this.healingPotion);
		System.out.println("AI health: " + bot.getHealthpoints());
		while (this.hp > 0 && bot.getHealthpoints() > 0) {
			
			System.out.println("Type 1 to attack.");
			System.out.println("Type 2 to use healing potion.");
			System.out.println("Type 3 to use damage amplify.");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			System.out.println(new String(new char[70]).replace("\0", "\r\n"));
			if (choice == 1) {
				this.dmg = rand.nextInt(20);
				System.out.println(this.dmg);
				if (this.dmgAmp == true) {
					this.dmg = (int) Math.floor(this.dmg*1.5);
				}
				System.out.println("You hit the enemy for " + this.dmg + " damage.");
				System.out.println(" ");
				bot.damageEnemyHP(this.dmg);
				System.out.println("Player health: " + this.hp);
				System.out.println("AI health: " + bot.getHealthpoints());
				if (bot.getHealthpoints() > 0) {
					System.out.println("AI will now attack");
					int dmg1 = rand.nextInt(20);
					// bot.setBotdmg(dmg1);
					this.hp = this.hp - dmg1;
					System.out.println("The enemy hit you for " + dmg1 + " damage.");
					System.out.println(" ");

					System.out.println("Player health: " + this.hp);
					System.out.println("AI health: " + bot.getHealthpoints());
				}
			}
			if (choice == 2) {
				if (this.hp > 85) {
					if (this.healingPotion > 0) {
						this.hp = 100;
						this.healingPotion--;
						System.out.println("You've used a healing potion.");
					}
					else {
						System.out.println("You don't have any healing potions.");
					}
				}
				if (this.hp <= 85) {
					if (this.healingPotion > 0) {
						this.hp += 15;
						this.healingPotion--;
						System.out.println("You've used a healing potion.");
					}
					else {
						System.out.println("You don't have any healing potions.");
					}
				}
			}
			if (choice == 3) {
				if(this.damagePotion > 0) {
					this.dmgAmp = true;
					this.damagePotion--;
				}
				else {
					System.out.println("You don't have any damage amp potions.");
				}
			}
			if (this.hp <= 0) {
				System.out.println("You have died. The enemy has won.");
				System.out.println("DEFEAT!");
			}
			if (bot.getHealthpoints() <= 0) {
				System.out.println("The enemy has died. You have won.");
				System.out.println("VICTORY!");
				System.out.println("You've earned 50 xp.");
				this.xp += 50;
			}
			
		}
	}

	public int getHealingPotion() {
		return healingPotion;
	}

	public int getDamagePotion() {
		return damagePotion;
	}

	public int getXP() {
		// TODO Auto-generated method stub
		return this.xp;
	}

}
