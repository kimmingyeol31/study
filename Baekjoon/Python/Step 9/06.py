import sys
input = sys.stdin.readline

N = int(input())
num = 2

while True:
    if N % num == 0:
        print(num)
        N /= num
    else:
        num += 1
    
    if N < num:
        break