import sys

input = sys.stdin.readline
num_list = [i for i in range(1, 31)]

for i in range(28):
    student_num = int(input())
    num_list.remove(student_num)

for i in num_list:
    print(i)