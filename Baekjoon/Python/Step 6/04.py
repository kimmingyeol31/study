import sys
input = sys.stdin.readline

word = input().strip()
is_palindrome = True

for i in range(len(word) // 2):
    if word[i] != word[-(i+1)]:
        is_palindrome = False
        break

if is_palindrome:
    print(1)
else:
    print(0)