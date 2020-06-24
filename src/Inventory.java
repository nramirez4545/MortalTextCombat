
public class Inventory {
	private int healingPotion;
	private int strengthPotion;
	private int resistancePotion;

	public Inventory() {
		
	}

	public Inventory(int healingPotion, int strengthPotion, int resistancePotion) {
		this.healingPotion = healingPotion;
		this.strengthPotion = strengthPotion;
		this.resistancePotion = resistancePotion;
	}
	
	public void addHealingPotion() {
		this.healingPotion++;
		System.out.println();
	}

	@Override
	public String toString() {
		return "Inventory [healingPotion=" + healingPotion + ", strengthPotion=" + strengthPotion
				+ ", resistancePotion=" + resistancePotion + "]";
	}
	
	
}
