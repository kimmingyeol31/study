import sys
input = sys.stdin.readline

test_case_count = int(input())

for i in range(test_case_count):
    repeat_count, input_string = input().split(" ")
    repeat_count = int(repeat_count)
    input_string = input_string.rstrip()

    for j in range(len(input_string)):
        print(input_string[j] * repeat_count, end="")
    
    print()