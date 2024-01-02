import sys, math
input = sys.stdin.readline

repeat_count = int(input())

for _ in range(repeat_count):
    h, w, n = map(int, input().split(" "))

    floor_number = n % h
    room_number = math.ceil(n / h)

    if floor_number == 0:
        floor_number = h

    print(f"{floor_number}{room_number:02d}")