repeat_count = int(input())

for i in range(repeat_count):
    a, b = map(int, input().split(" "))
    print(a + b)