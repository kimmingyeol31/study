import sys
input = sys.stdin.readline

N, K = map(int, input().split(" "))

divisors_of_N = []

for i in range(1, N + 1):
    if N % i == 0:
        divisors_of_N.append(i)

if len(divisors_of_N) > K - 1:
    print(divisors_of_N[K - 1])
else:
    print(0)