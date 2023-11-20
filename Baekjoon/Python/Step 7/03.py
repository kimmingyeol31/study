import sys
input = sys.stdin.readline

keywords = [list(input().rstrip()) for _ in range(5)]

keyword_max_len = max(keywords, key=len)

for i in range(len(keyword_max_len)):
    for j in range(5):
        if len(keywords[j]) > i:
            print(keywords[j][i], end="")