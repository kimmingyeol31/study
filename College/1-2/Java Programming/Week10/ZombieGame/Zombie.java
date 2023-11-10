package ZombieGame;

import java.util.*;

public class Zombie {
	String name;
	int position;
	int map;
	
	static Random r = new Random();
	
	public Zombie(String name, int position, int map) {
		this.name = name;
		this.map = map;
		this.position = position;
	}
	
	public void move() {
		position += r.nextInt(3) - 1;
		
		if (position < 1) position = 1;
		else if (position > map) position = map;
		
		System.out.printf("\"%s\"의 현재 위치는 \"%d\"입니다.\n", name, position);
	}
}