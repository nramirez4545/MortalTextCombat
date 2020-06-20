
public class EnemyAI {
	
	private int hp;
	
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
