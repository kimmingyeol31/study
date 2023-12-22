import sys
input = sys.stdin.readline

word_count = int(input())
word_set = set()

for _ in range(word_count):
    word_set.add(input().rstrip())

sorted_words = sorted(word_set, key=lambda x: (len(x), x))

for word in sorted_words:
    print(word)