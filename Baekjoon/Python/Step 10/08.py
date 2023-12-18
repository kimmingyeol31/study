import sys
input = sys.stdin.readline

triangle_sides = list(map(int, input().split(" ")))
triangle_sides.sort()

sum_of_two_sides = triangle_sides[0] + triangle_sides[1]

if sum_of_two_sides > triangle_sides[2]:
    print(sum(triangle_sides))
else:
    print(sum_of_two_sides + (sum_of_two_sides - 1))