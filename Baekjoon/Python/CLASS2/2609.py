import sys
input = sys.stdin.readline

a, b = map(int, input().split())

def euclidean(a, b):
    while b != 0:
        [a, b] = [b, a%b]
    
    return a

gcd = euclidean(a, b)
lcm = (a * b) // gcd

print(gcd)
print(lcm)