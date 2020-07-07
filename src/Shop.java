import java.util.Scanner;

public class Shop  {
	
	Menu menu  = new Menu();
	private int xp;
	private int healingPotion;
	private int damagePotion;
	private int resistancePotion;


	public Shop(int xp, int healingPotion, int damagePotion, int resistancePotion) {
		this.xp = xp;
		this.healingPotion= healingPotion;
		this.damagePotion = damagePotion;
		this.resistancePotion = resistancePotion;
	}

	public void Buy() {
		menu.shopChoices();
		Scanner scan5 = new Scanner(System.in);
		int choices = scan5.nextInt();
		if (choices == 1) {
			System.out.println("You've bought the healing potion for 50 xp.");
			this.healingPotion += 1;
			this.xp -= 50;
		}
		if (choices == 2) {
			System.out.println("You've bought the damage amp potion for 50 xp.");
			this.damagePotion += 1;
			this.xp -= 50;
		}
		if (choices == 3) {
			System.out.println("You've bought the resistance potion for 50 xp.");
			this.resistancePotion += 1;
			this.xp -= 50;
		}
	}

	public int getXp() {
		return xp;
	}


	public int getHealingPotion() {
		return healingPotion;
	}


	public int getDamagePotion() {
		return damagePotion;
	}


	public int getResistancePotion() {
		return resistancePotion;
	}

	

	}

