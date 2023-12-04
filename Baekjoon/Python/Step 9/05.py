import sys
input = sys.stdin.readline

M = int(input())
N = int(input())

prime_numbers = []

for i in range(M, N + 1):
    is_prime_number = True

    if i == 1:
        continue

    for j in range(2, i):
        if i % j == 0:
            is_prime_number = False
            break
    
    if is_prime_number:
        prime_numbers.append(i)

if len(prime_numbers) > 0:
    print(sum(prime_numbers))
    print(prime_numbers[0])
else:
    print(-1)