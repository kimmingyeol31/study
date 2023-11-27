import sys
input = sys.stdin.readline

N = int(input())
layer = 2
room_sum = 7

while True:
    if N == 1:
        print(1)
        break

    if N <= room_sum:
        print(layer)
        break

    room_sum += 6 * layer
    layer += 1