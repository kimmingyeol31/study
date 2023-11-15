import sys

input = sys.stdin.readline

keyword = input().rstrip()
keyword_list = [-1 for i in range(26)]

for i in range(len(keyword)):
    char_index = ord(keyword[i]) - 97

    if keyword_list[char_index] == -1:
        keyword_list[char_index] = i

for i in range(26):
    print(keyword_list[i], end=" ")