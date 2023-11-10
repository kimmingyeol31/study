package FightGame;

public class Game {

	public static void main(String[] args) {
		Character ryu = new Character("류", 100, 20);
		Character ken = new Character("켄", 200, 10);
		
		while (true) {
			System.out.printf("%s의 남은체력: %d\n", ryu.name, ryu.hp);
			System.out.printf("%s의 남은체력: %d\n", ken.name, ken.hp);
			
			System.out.println();
			
			int ryuATK = ryu.attack();
			System.out.printf("%s(이)가 공격했습니다. 입힌 피해: %dHP\n", ryu.name, ryuATK);
			
			ken.hp -= ryuATK;
			
			int kenATK = ken.attack();
			System.out.printf("%s(이)가 공격했습니다. 입힌 피해: %dHP\n", ken.name, kenATK);
			
			ryu.hp -= kenATK;
			
			System.out.println();
			
			if (ryu.hp < 1 || ken.hp < 1) {
				break;
			}
		}
		
		
		if (ryu.hp < 0) {
			System.out.println("켄이 이겼습니다!");
		}
		else {
			System.out.println("류가 이겼습니다!");
		}
	}

}
