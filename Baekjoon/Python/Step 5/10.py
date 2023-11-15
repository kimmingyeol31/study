import sys
input = sys.stdin.readline

second_list = [3] * 3 + [4] * 3 + [5] * 3 + [6] * 3 + [7] * 3 + [8] * 4 + [9] * 3 + [10] * 4

keyword = input().rstrip()
sum = 0

for i in range(len(keyword)):
    index = ord(keyword[i]) - 65
    sum += second_list[index]

print(sum)