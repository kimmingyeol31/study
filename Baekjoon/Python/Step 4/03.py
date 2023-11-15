import sys

input = sys.stdin.readline

num_count = int(input())
num_list = [int(num) for num in input().split(" ")]

max_num = -1000000
min_num = 1000000

for i in num_list:
    if i > max_num:
        max_num = i
    
    if i < min_num:
        min_num = i

print(min_num, max_num)