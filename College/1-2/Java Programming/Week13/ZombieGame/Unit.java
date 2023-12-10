package ZombieGame;

import java.util.Random;

public abstract class Unit {
	String name;
	int position;
	int map;
	Random r = new Random();
	
	public Unit(String name, int position, int map) {
		this.name = name;
		this.position = position;
		this.map = map;
	}
	
	public void right() {
		position += 1;
		positionCheck();
		
		System.out.printf("\"%s\"이 오른쪽으로 이동하여 현재 위치는 \"%d\"입니다.\n", name, position);
	}
	
	public void left() {
		position -= 1;
		positionCheck();
		
		System.out.printf("\"%s\"이 왼쪽으로 이동하여 현재 위치는 \"%d\"입니다.\n", name, position);
	}
	
	public abstract void move(int userSelect);
	
	protected void positionCheck() {
		if (position > map) position = map;
		else if (position < 1) position = 1;
	}
}