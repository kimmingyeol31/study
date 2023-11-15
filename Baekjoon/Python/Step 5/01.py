import sys

input = sys.stdin.readline

keyword = input().rstrip()
index = int(input())

print(keyword[index - 1])