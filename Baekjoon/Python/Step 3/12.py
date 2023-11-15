import sys

input = sys.stdin.readline

while True:
    nums = input()

    if nums == "":
        break

    a, b = map(int, nums.split(" "))

    print(a + b)