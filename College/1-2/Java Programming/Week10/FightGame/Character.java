package FightGame;

import java.util.Random;

public class Character {
	String name;
	int hp;
	int maxAtk;
	
	Random r = new Random();
	
	Character(String name, int hp, int maxAtk) {
		this.name = name;
		this.hp = hp;
		this.maxAtk = maxAtk;
	}
	
	public int attack() {
		return r.nextInt(1, maxAtk + 1);
	}
}
