package FightGame;

public class Boss extends Character {
	public Boss(String name, int hp, int maxAtk) {
		super(name, hp, maxAtk);
		
	}
	
	public int specialAttack() {
		this.hp -= 10;
		return this.maxAtk;
	}

}
