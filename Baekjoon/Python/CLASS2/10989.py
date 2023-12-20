import sys
input = sys.stdin.readline

N = int(input())
numbers = {}

for _ in range(N):
    input_number = int(input())

    if input_number in numbers:
        numbers[input_number] += 1
    else:
        numbers[input_number] = 1

for number in sorted(numbers):
    for _ in range(numbers[number]):
        print(number)