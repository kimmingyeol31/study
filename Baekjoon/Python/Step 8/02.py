import sys
input = sys.stdin.readline

decimal_number, base = map(int, input().split(" "))
remainder_list = []

while decimal_number > 0:
    if decimal_number % base > 9:
        remainder_list.append(chr(55 + decimal_number % base))
    else:
        remainder_list.append(str(decimal_number % base))
    
    decimal_number //= base

remainder_list.reverse()
print(''.join(remainder_list))