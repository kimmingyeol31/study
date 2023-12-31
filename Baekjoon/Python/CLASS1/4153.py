import sys
input = sys.stdin.readline

while True:
    a, b, c = map(int, input().split(" "))
    if a == 0 and b == 0 and c == 0:
        break
    
    max_num = max(a, b, c)

    if max_num == a:
        if a ** 2 == b ** 2 + c ** 2:
            print("right")
        else:
            print("wrong")
    elif max_num == b:
        if b ** 2 == a ** 2 + c ** 2:
            print("right")
        else:
            print("wrong")
    elif max_num == c:
        if c ** 2 == a ** 2 + b ** 2:
            print("right")
        else:
            print("wrong")