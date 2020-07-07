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
			
			
		}
		
	
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getHealingPotion() {
		return healingPotion;
	}

	public void setHealingPotion(int healingPotion) {
		this.healingPotion = healingPotion;
	}

	public int getDamagePotion() {
		return damagePotion;
	}

	public void setDamagePotion(int damagePotion) {
		this.damagePotion = damagePotion;
	}

	public int getResistancePotion() {
		return resistancePotion;
	}

	public void setResistancePotion(int resistancePotion) {
		this.resistancePotion = resistancePotion;
	}
	

	}

