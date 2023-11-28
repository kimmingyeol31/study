import sys, math
input = sys.stdin.readline

a, b, v = map(int, input().split(" "))

print(math.ceil((v - b) / (a - b)))
