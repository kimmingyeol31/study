import sys
input = sys.stdin.readline

num1, num2 = map(int, (i[::-1] for i in input().split(" ")))

if num1 > num2:
    print(num1)
else:
    print(num2)