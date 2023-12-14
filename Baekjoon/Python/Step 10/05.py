import sys
input = sys.stdin.readline

marble_count = int(input())

x_list = []
y_list = []

for _ in range(marble_count):
    x, y = map(int, input().split(" "))
    
    x_list.append(x)
    y_list.append(y)

width = max(x_list) - min(x_list)
height = max(y_list) - min(y_list)

print(width * height)