import sys
input = sys.stdin.readline

X = int(input())
line_number = 1
cell_count = 1

while cell_count < X:
    line_number += 1
    cell_count += line_number

cell_count -= (line_number - 1)
temp = X - cell_count

if line_number % 2 == 0:
    x = 1 + temp
    y = line_number - temp
else:
    x = line_number - temp
    y = 1 + temp

print(f"{x}/{y}")