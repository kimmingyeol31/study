import sys
input = sys.stdin.readline

test_case_count = int(input())

for _ in range(test_case_count):
    change_in_cents = int(input())

    quarters_count = change_in_cents // 25
    change_in_cents -= quarters_count * 25

    dimes_count = change_in_cents // 10
    change_in_cents -= dimes_count * 10

    nickels_count = change_in_cents // 5
    change_in_cents -= nickels_count * 5

    pennies_count = change_in_cents

    print(quarters_count, dimes_count, nickels_count, change_in_cents)