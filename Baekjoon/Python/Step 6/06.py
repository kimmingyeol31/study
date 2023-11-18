import sys
input = sys.stdin.readline

keyword = input().rstrip()
croatian_letter_list = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
count = 0

for letter in croatian_letter_list:
    count += keyword.count(letter)
    keyword = keyword.replace(letter, " ")

count += len(keyword.replace(" ", ""))

print(count)