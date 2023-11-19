import sys
input = sys.stdin.readline

numbers = [list(map(int, input().split(" "))) for _ in range(9)]

max_number = 0
max_number_x = 0
max_number_y = 0

for i in range(9):
    for j in range(9):
        if numbers[i][j] > max_number:
            max_number = numbers[i][j]
            max_number_x = j
            max_number_y = i

print(max_number)
print(max_number_y + 1, max_number_x + 1)