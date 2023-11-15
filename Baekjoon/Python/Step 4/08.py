import sys

input = sys.stdin.readline

remainder_list = []

for i in range(10):
    num = int(input())
    remainder = num % 42
    
    if remainder_list.count(remainder) != 0:
        continue

    remainder_list.append(remainder)

print(len(remainder_list))