import sys
input = sys.stdin.readline

number = [int(i) for i in input().split(" ")]
total_num = 0

for i in number:
    total_num += i ** 2

print(total_num % 10)