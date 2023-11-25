import sys
input = sys.stdin.readline

num_in_base, base = input().rstrip().split(" ")

print(int(num_in_base, int(base)))