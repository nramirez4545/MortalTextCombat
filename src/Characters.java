import java.util.Random;
import java.util.Scanner;

public class Characters {
	
	private int hp;
	private String name;
	private int strength;
	private int dmg;
	EnemyAI bot = new EnemyAI(100);

	public Characters(int hp, String name, int strength) {
		
		this.hp = hp;
		this.name = name;
		this.strength= strength;
				
	}
	
	public void easyBattle() {
		FightClass easyfight = new FightClass (this.hp, this.dmg);
		easyfight.easy();
		
	}
	
	
}
