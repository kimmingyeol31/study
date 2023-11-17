package ZombieGame;

import java.util.Random;

public class Unit {
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
	
	public void move() {
		int action = r.nextInt(3);
		
		if (action == 0) {
			left();
		}
		else if (action == 1) {
			right();
		}
		else if (action == 2) {
			System.out.printf("\"%s\"이 움직이지 않았습니다. 현재 위치는 \"%d\"입니다.\n", name, position);
		}
	}
	
	protected void positionCheck() {
		if (position > map) position = map;
		else if (position < 1) position = 1;
	}
}
