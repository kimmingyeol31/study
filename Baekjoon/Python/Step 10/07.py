import sys
input = sys.stdin.readline


while True:
    s = list(map(int, input().split(" ")))
    s = sorted(s)
    if s[0] == 0 and s[1] == 0 and s[2] == 0:
        break
    
    if s[0] + s[1] <= s[2]:
        print("Invalid")
        continue
    
    s = set(s)

    if len(s) == 1:
        print("Equilateral")
    elif len(s) == 2:
        print("Isosceles")
    else:
        print("Scalene")