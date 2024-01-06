import sys
input = sys.stdin.readline

input_length = int(input())
string_list = list(input().rstrip())
sum = 0

for i in range(input_length):
    sum += (ord(string_list[i]) - 96) * (31 ** i)

print(sum)