import sys
input = sys.stdin.readline

while True:
    n = int(input())

    if n == -1:
        break
    
    divisors_of_n = []
    for i in range(1, n):
        if n % i == 0:
            divisors_of_n.append(i)

    sum_of_divisors = sum(divisors_of_n)
    string_divisors = [str(i) for i in divisors_of_n]

    if n == sum_of_divisors:
        print(f"{n} = {' + '.join(string_divisors)}")
    else:
        print(f"{n} is NOT perfect.")