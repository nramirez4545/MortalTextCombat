import java.util.Random;
import java.util.Scanner;

public class Characters {
	
	private int hp;
	private String name;
	private int strength;
	private int dmg;
	EnemyAI bot = new EnemyAI(100);
	private int xp;
	private Inventory r1;

	public Characters(int hp, String name, int strength, int xp, Inventory r1) {
		
		this.hp = hp;
		this.name = name;
		this.strength= strength;
		this.xp = xp;
		this.r1 = r1;
	}
	
	@Override
	public String toString() {
		return "Characters [hp=" + hp + ", name=" + name + ", strength=" + strength + ", dmg=" + dmg + ", bot=" + bot
				+ ", xp=" + xp + ", r1=" + r1 + "]";
	}

	public void easyBattle() {
		FightClass easyfight = new FightClass (this.hp, this.dmg);
		easyfight.easy();
		
	}
	
	
}
