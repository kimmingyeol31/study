import sys
input = sys.stdin.readline

s = set()
a_sum = 0

for _ in range(3):
    a = int(input())
    s.add(a)
    a_sum += a

if a_sum != 180:
    print("Error")
elif len(s) == 2: 
    print("Isosceles")
elif len(s) == 1:
    print("Equilateral")
else:
    print("Scalene")