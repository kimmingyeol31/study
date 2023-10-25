num1 = int(input())
num2 = int(input())

hundred_number = num2 // 100
ten_number = (num2 - hundred_number * 100) // 10
one_number = num2 - hundred_number * 100 - ten_number * 10

print(num1 * one_number)
print(num1 * ten_number)
print(num1 * hundred_number)

print(num1 * num2)