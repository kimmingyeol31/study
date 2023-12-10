package FightGame;

import java.util.Random;

public abstract class Character {
	String name;
	private int hp;
	int maxAtk;
	boolean isDefenceState = false;
	
	Random r = new Random();
	
	public Character(String name, int hp, int maxAtk) {
		this.name = name;
		this.hp = hp;
		this.maxAtk = maxAtk;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public boolean getDefenceState() {
		return isDefenceState;
	}

	public void setDefenceState(boolean isDefenceState) {
		this.isDefenceState = isDefenceState;
	}
	
	public abstract int attack(Character enemy);
	
	public abstract int specialAttack(Character enemy);
}