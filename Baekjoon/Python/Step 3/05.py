import math

target_num = int(input())

for i in range(0, math.ceil(target_num / 4)):
    print("long", end=" ")

print("int")