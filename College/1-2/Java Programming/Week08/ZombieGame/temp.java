//package ZombieGame;
//
//import java.util.*;
//
//public class temp {
//    public static void main(String[] args) {
//        int zombieAmount = 2;
//        boolean isCatch = false;
//
//        Random r = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int[] zombieList = resetZombiePosition(zombieAmount);
//        int player = 0;
//
//        while (true) {
//            ZombieGame.erase();
//            System.out.println("1(왼쪽), 2(오른쪽), 3(점프) 중 하나를 입력하세요.");
//            ZombieGame.mapRender(player, zombieList);
//            if (isCatch) {
//                System.out.print("좀비에게 잡혔습니다. 처음 위치에서 다시 시작합니다.");
//                isCatch = false;
//            }
//
//            int userInput = scanner.nextInt();
//
//            switch (userInput) {
//                case 1:
//                    player -= 1;
//                    break;
//                case 2:
//                    player += 1;
//                    break;
//                case 3:
//                    player += r.nextInt(3) + 1;
//                    break;
//            }
//
//            for (int i = 0; i < zombieList.length; i++) {
//                int currentPosition = zombieList[i];
//                int newPosition = r.nextInt(currentPosition - 1, currentPosition + 2);
//
//                if (newPosition > 19) newPosition = 19;
//                else if (newPosition < 0) newPosition = 0;
//
//                zombieList[i] = newPosition;
//            }
//
//            if (player < 0) player = 0;
//
//            System.out.print("\n");
//
//            for (int zombiePosition : zombieList) {
//                if (zombiePosition == player) {
//                    isCatch = true;
//                    player = 0;
//                    zombieList = resetZombiePosition(zombieAmount);
//                    break;
//                }
//            }
//
//            if (player >= 19) {
//                ZombieGame.erase();
//                ZombieGame.mapRender(player, zombieList);
//                System.out.print("미션 클리어!!! 목적지에 도착했습니다.");
//                break;
//            }
//        }
//        scanner.close();
//    }
//
//    public static void mapRender(int player, int[] zombieMap) {
//        int[] map = new int[20];
//
//        for (int position : zombieMap) {
//            map[position] = 2;
//        }
//
//        if (player >= 19) {
//            map[19] = 1;
//        }
//        else {
//            map[player] = 1;
//        }
//
//        for (int i : map) {
//            if (i == 0) {
//                System.out.print("_");
//            }
//            else if (i == 1) {
//                System.out.print("🧍");
//            }
//            else if (i == 2) {
//                System.out.print("🧟");
//            }
//        }
//
//        System.out.print("\n");
//    }
//
//    public static void erase() {
//        for (int i = 0; i < 50; i++) {
//            System.out.println();
//        }
//    }
//
//    public static int[] resetZombiePosition(int zombieAmount) {
//        Random r = new Random();
//        int[] zombieList = new int[zombieAmount];
//
//        for (int i = 0; i < zombieList.length; i++) {
//            int position;
//
//            do {
//                position = r.nextInt(1,20);
//            } while (contains(zombieList, position));
//
//            zombieList[i] = position;
//        }
//
//        return zombieList;
//    }
//
//    public static boolean contains(int[] array, int diffNumber) {
//        boolean isContains = false;
//
//        for (int number : array) {
//            if (number == diffNumber) {
//                isContains = true;
//                break;
//            }
//        }
//
//        return isContains;
//    }
//}