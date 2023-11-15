import sys

input = sys.stdin.readline

num_count = int(input())
num_string = input().rstrip()
sum = 0

for i in range(num_count):
    sum += int(num_string[i])

print(sum)