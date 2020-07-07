public class Menu {
	public Menu() {
		
	}
	public void battleChoices() {
		System.out.println("1. Quick Attack");
		System.out.println("2. Healing");
		System.out.println("3. Resistance");
		System.out.println("4. Strength");
		System.out.println("5. Open Inventory");
	}
	
	public void shopChoices() {
		System.out.println("1. Buy healing potion for 50 XP");
		System.out.println("2. Buy stength potions for 50 XP");
		System.out.println("3. Buy damage resistance potions for 50 XP");
		System.out.println("4. Exit shop");
	}
	
	public void mainMenu() {
		System.out.println("1. Enter battle");
		System.out.println("2. Enter shop");
		System.out.println("3. Save");
		System.out.println("4. Load");
	}
}