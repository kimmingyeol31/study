package ZombieGame;

public class Zombie extends Unit {
	public Zombie(String name, int position, int map) {
		super(name, position, map);
	}
	
	public void move(int action) {
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
}