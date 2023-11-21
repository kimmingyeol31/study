import sys
input = sys.stdin.readline

square_count = int(input())
squares = [list(map(int, input().split(" "))) for _ in range(square_count)]

drawing_paper = [[0 for _ in range(100)] for _ in range(100)]

for square_coordinate in squares:
    x, y = square_coordinate

    for a in range(y - 1, y + 9):
        for b in range(x - 1, x + 9):
            drawing_paper[a][b] = 1

area = 0

for a in range(100):
    for b in range(100):
        if drawing_paper[a][b] == 1:
            area += 1

print(area)