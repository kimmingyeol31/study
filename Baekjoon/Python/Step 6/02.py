import sys
input = sys.stdin.readline

chess_list = [1, 1, 2, 2, 2, 8]
current_chess = [int(i) for i in input().split(" ")]

for i in range(len(chess_list)):
    print(chess_list[i] - current_chess[i], end=" ")