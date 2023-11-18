import sys
input = sys.stdin.readline

alphabet_list = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

keyword_count = int(input())
consecutive_keyword_count = 0

for i in range(keyword_count):
    keyword = input().rstrip()
    is_consecutive = True

    for k in range(26):
        alphabet_count = keyword.count(alphabet_list[k])

        if alphabet_count > 0:
            first_index = keyword.index(alphabet_list[k])

            for j in range(first_index, first_index + alphabet_count):
                if keyword[j] != alphabet_list[k]:
                    is_consecutive = False
                    break
    
    if is_consecutive:
        consecutive_keyword_count += 1

print(consecutive_keyword_count)