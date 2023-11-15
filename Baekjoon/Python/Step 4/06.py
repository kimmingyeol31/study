import sys

input = sys.stdin.readline

basket_count, change_count = map(int, input().split(" "))
basket = [i for i in range(1, basket_count + 1)]

for _ in range(change_count):
    basket1_number, basket2_number = map(int, input().split(" "))
    basket[basket1_number - 1], basket[basket2_number - 1] = basket[basket2_number - 1], basket[basket1_number - 1]

for i in range(basket_count):
    print(basket[i], end=" ")