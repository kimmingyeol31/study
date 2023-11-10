package ZombieGame;

import java.util.*;

public class Hero {
	String name;
	int position;
	int hp;
	int map;
	Random r = new Random();
	
	public Hero(String name, int position, int hp, int map) {
		this.name = name;
		this.position = position;
		this.hp = hp;
		this.map = map;
	}
	
	public void rightMove() {
		position += 1;
		positionCheck();
		
		System.out.printf("\"%s\"이 오른쪽으로 이동하여 현재 위치는 \"%d\"입니다.\n", name, position);
	}
	
	public void leftMove() {
		position -= 1;
		positionCheck();
		
		System.out.printf("\"%s\"이 왼쪽으로 이동하여 현재 위치는 \"%d\"입니다.\n", name, position);
	}
	
	public void jump() {
		int jumpAmount = r.nextInt(1, 4);
		
		position += jumpAmount;
		positionCheck();
		
		System.out.printf("\"%s\"이 \"%d\"만큼 점프하여 현재 위치는 \"%d\"입니다.\n", name, jumpAmount, position);
	}
	
	private void positionCheck() {
		if (position > map) position = map;
		else if (position < 1) position = 1;
	}
}