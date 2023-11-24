package FightGame;

import java.util.Random;

public class Character {
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
	
	public int attack(Character enemy) {
		int damage = r.nextInt(1, maxAtk + 1);
		int currentHp = enemy.getHp();
		enemy.setHp(currentHp - damage);
		
		System.out.printf("%s이(가) 공격했습니다. 입힌 피해: %dHP\n", name, damage);
		return damage;
	}
}
