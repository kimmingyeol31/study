import sys
input = sys.stdin.readline

input_string = input().strip().split(" ")

for i in input_string:
    if i == "":
        input_string.remove("")

print(len(input_string))