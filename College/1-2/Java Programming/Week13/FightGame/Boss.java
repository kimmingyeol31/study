package FightGame;

public class Boss extends Character {
	public Boss(String name, int hp, int maxAtk) {
		super(name, hp, maxAtk);
		
	}
	
	public int attack(Character enemy) {
		int damage = r.nextInt(1, maxAtk + 1);
		int currentHp = enemy.getHp();
		enemy.setHp(currentHp - damage);
		
		System.out.printf("%s이(가) 공격했습니다. 입힌 피해: %dHP\n", name, damage);
		return damage;
	}
	
	public int specialAttack(Character enemy) {
		int currentHp = enemy.getHp();
		enemy.setHp(currentHp - maxAtk);
		
		System.out.printf("%s이(가) 필살기를 날렸습니다. 입힌 피해: %dHP\n", name, maxAtk);
		return maxAtk;
	}

}