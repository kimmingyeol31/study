h, m = map(int, input().split(" "))
t = int(input())

h += t // 60
m += t % 60

while m > 59:
    m -= 60
    h += 1

while h > 23:
    h -= 24

print(h, m)
