import sys
input = sys.stdin.readline

subject_count = int(input())
scores = [int(score) for score in input().split(" ")]
max_score = 0

for score in scores:
    if score > max_score:
        max_score = score

for i in range(subject_count):
    scores[i] = scores[i] / max_score * 100

average_score = 0

for score in scores:
    average_score += score

average_score /= subject_count

print(average_score)