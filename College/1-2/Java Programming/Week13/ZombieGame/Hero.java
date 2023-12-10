package ZombieGame;

public class Hero extends Unit {
	int hp;
	
	public Hero(String name, int position, int map, int hp) {
		super(name, position, map);
		this.hp = hp;
	}
	
	public void jump() {
		int jumpAmount = super.r.nextInt(1, 4);
		
		position += jumpAmount;
		super.positionCheck();
		
		System.out.printf("\"%s\"이 \"%d\"만큼 점프하여 현재 위치는 \"%d\"입니다.\n", name, jumpAmount, position);
	}

	@Override
	public void move(int userSelect) {
		if (userSelect == 1) {
			left();
		}
		else if (userSelect == 2) {
			right();
		}
		else if (userSelect == 3) {
			jump();
		}
		
	}
}