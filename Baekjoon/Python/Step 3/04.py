sum_money = int(input())
sum_amount = int(input())

sum = 0

for i in range(0, sum_amount):
    i, m = map(int, input().split(" "))
    sum += i * m

if sum_money == sum:
    print("Yes")
else:
    print("No")