import sys

input = sys.stdin.readline

basket_count, reverse_count = map(int, input().split(" "))
basket = [i for i in range(1, basket_count + 1)]

for i in range(reverse_count):
    start_num, end_num = map(int, input().split(" "))
    
    temp = basket[start_num - 1:end_num]
    temp.reverse()

    basket[start_num - 1:end_num] = temp
    
for i in range(basket_count):
    print(basket[i], end=" ")