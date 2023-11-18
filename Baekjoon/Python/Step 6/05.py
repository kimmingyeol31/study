import sys
input = sys.stdin.readline

word = input().rstrip().lower()
word_list = [0 for i in range(26)]

for i in range(26):
    word_list[i] = (word.count(chr(i + 97)))

temp_list = sorted(word_list, reverse=True)
if temp_list[0] == temp_list[1]:
    print("?")
else:
    print(chr(word_list.index(temp_list[0]) + 65))