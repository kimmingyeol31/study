import sys
input = sys.stdin.readline

input_string = input().rstrip()

if input_string == '1 2 3 4 5 6 7 8':
    print("ascending")
elif input_string == '8 7 6 5 4 3 2 1':
    print("descending")
else:
    print("mixed")