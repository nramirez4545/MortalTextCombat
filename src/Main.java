import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Character objects
		Inventory R1 = new Inventory(0, 0, 0);
		Characters raymond = new Characters(40, "Raymond", 25, 0, R1);
		Menu menu1 = new Menu();
		menu1.battleChoices();
		Scanner scan5 = new Scanner(System.in);
		int choice = scan5.nextInt();
		if (choice == 1) {
			raymond.easyBattle();
		}
		if (choice == 2) {
			Shop rshop = new Shop(raymond);
		}
	}

}
