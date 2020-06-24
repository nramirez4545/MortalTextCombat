import java.util.Scanner;

public class Shop {
	private Characters raymond;
	Menu menu  = new Menu();

	public Shop() {
		
	}

	public Shop(Characters raymond) {
		this.raymond = raymond;
	}
	
	public void Buy() {
		menu.shopChoices();
		Scanner scan5 = new Scanner(System.in);
		int choices = scan5.nextInt();
		if (choices == 1) {
			
		}
	}
}
