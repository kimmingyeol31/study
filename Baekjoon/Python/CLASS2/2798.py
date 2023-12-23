import sys
input = sys.stdin.readline

card_number, target_number = map(int, input().split(" "))
card_list = [int(card) for card in input().split(" ")]
max_number = 0

for i in range(card_number):
    for j in range(i + 1, card_number):
        for k in range(j + 1, card_number):
            sum_card = card_list[i] + card_list[j] + card_list[k]

            if target_number >= sum_card > max_number:
                max_number = sum_card

print(max_number)