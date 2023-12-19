import sys
input = sys.stdin.readline

while True:
    number = input().rstrip()

    if number == '0':
        break

    if number == number[::-1]:
        print("yes")
    else:
        print("no")