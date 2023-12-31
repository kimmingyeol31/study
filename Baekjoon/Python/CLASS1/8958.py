import sys
input = sys.stdin.readline

case_count = int(input())

for _ in range(case_count):
    input_string = input().rstrip()
    input_string = list(input_string.replace("O", "1").replace("X", "0"))
    input_string = [int(i) for i in input_string]

    for i in range(1, len(input_string)):
        if input_string[i] == 0:
            continue

        input_string[i] = input_string[i] + input_string[i - 1]

    sum = 0
    for i in input_string:
        sum += i
    
    print(sum)