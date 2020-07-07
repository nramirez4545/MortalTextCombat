import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Character objects

		Characters raymond = new Characters(90, "Raymond", 25, 100, 0, 0, 0); //hp, name, damage, xp, hpotion, dpotion, rpotion
		int choice;

		Menu menu1 = new Menu();
		
		Scanner scan5 = new Scanner(System.in);
		// System.out.println(raymond);
		

		do {
			menu1.battleChoices();
			choice = scan5.nextInt();
			{
				
				if (choice == 1) {
					raymond.easyBattle();
				}
				if (choice == 2) {
					raymond.gotoShop();
					System.out.println(raymond);
				}
				
				if (choice == 3) {
					
					System.out.println(raymond);
				}
			}
		} while (choice != 4);
		main(args);
	}
}
