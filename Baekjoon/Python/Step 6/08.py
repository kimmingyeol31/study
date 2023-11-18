import sys
input = sys.stdin.readline

total_credits = 0
total_grade = 0.0

for _ in range(20):
    subject_name, credit, grade = input().rstrip().split(" ")
    credit = float(credit)

    if grade == 'P':
        continue
    
    subject_grade = ''
    if grade == 'A+':
        subject_grade = 4.5
    elif grade  == 'A0':
        subject_grade = 4.0
    elif grade == 'B+':
        subject_grade = 3.5
    elif grade == 'B0':
        subject_grade = 3.0
    elif grade == 'C+':
        subject_grade = 2.5
    elif grade == 'C0':
        subject_grade = 2.0
    elif grade == 'D+':
        subject_grade = 1.5
    elif grade == 'D0':
        subject_grade = 1.0
    elif grade == 'F':
        subject_grade = 0.0
    
    total_credits += credit
    total_grade += credit * subject_grade

major_grade = total_grade / total_credits
print(major_grade)