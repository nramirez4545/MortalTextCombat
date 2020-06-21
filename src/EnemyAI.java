
public class EnemyAI {
	
	private int hp;
	private int botdmg;
	
	public int getBotdmg() {
		return botdmg;
	}

	public void setBotdmg(int botdmg) {
		this.botdmg = botdmg;
	}

	public EnemyAI(int hp)
	{
		this.setHealthpoints(hp);	
	}

	public int getHealthpoints() 
	{
		return hp;
	}

	public void setHealthpoints(int hp) 
	{
		this.hp = hp;
	}
	
	public int damageEnemyHP(int dmg)
	{
		this.hp = this.hp - dmg;
		return this.hp;
	}

}
