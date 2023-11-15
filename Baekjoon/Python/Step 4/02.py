import sys

input = sys.stdin.readline

num_count, target_num = map(int, input().split(" "))
num_list = [int(num) for num in input().split(" ")]
result = ""

for i in num_list:
    if i < target_num:
        result += f"{i} "

result.strip()
print(result)