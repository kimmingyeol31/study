import sys
input = sys.stdin.readline

N = int(input())
smallest_generator = 0

for i in range(N):
    number_list = list(str(i))
    
    sum = i
    for j in number_list:
        sum += int(j)
    
    if sum == N:
        smallest_generator = i
        break

print(smallest_generator)