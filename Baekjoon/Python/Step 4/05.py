import sys

input = sys.stdin.readline

basket_count, ball_insert_count = map(int, input().split(" "))
basket = [0 for i in range(basket_count)]

for i in range(ball_insert_count):
    start_number, end_number, ball_number = map(int, input().split(" "))

    for j in range(start_number - 1, end_number):
        basket[j] = ball_number

for i in range(basket_count):
    print(basket[i], end=" ")