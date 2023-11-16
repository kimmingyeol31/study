import sys
input = sys.stdin.readline

star_scale = int(input())
repeat_count = 2 * star_scale - 1

for i in range(1, repeat_count + 1):
    print(" " * abs(star_scale - i), end="")
    print("*" * (abs((2 * star_scale) - 1) - 2 * (abs(star_scale - i))))