import sys
input = sys.stdin.readline

num_count = int(input())
nums = [int(i) for i in input().split(" ")]
non_prime_nums = []

for num in nums:
    if num == 1:
        non_prime_nums.append(num)
        continue

    for i in range(1, 1001):
        if num % i != 0:
            continue

        if i == 1 or i == num:
            continue

        non_prime_nums.append(num)
        break

print(len(nums) - len(non_prime_nums))