import sys

input = sys.stdin.readline

count = int(input())

for i in range(count):
    keyword = input().rstrip()

    print(keyword[0], end="")
    print(keyword[-1])