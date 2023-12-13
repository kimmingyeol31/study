import sys
input = sys.stdin.readline

x, y, w, h = map(int, input().split(" "))

print(min(x, y, w - x, h - y))