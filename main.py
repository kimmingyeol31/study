import csv
import matplotlib.pyplot as plt

file = open('sample2.csv', 'r', encoding='utf-8')
csv_file = csv.reader(file)

header = next(csv_file)

male = []
female = []

for line in csv_file:
    all = '전국  (0000000000)'
    if line[0] != all:
        continue

    male = line[3:104]
    female = line[106:208]

    for sum in line[3:104]:
        male.append(-int(sum.replace(",", "")))
        del male[0]

    for sum in line[106:208]:
        female.append(int(sum.replace(",", "")))
        del female[0]

print(male)
print(female)

x = range(101)

plt.rc('font', family='Malgun Gothic')
plt.rc('axes', unicode_minus=False)

plt.barh(x, male, label='남자')
plt.barh(x, female, label='여자')

plt.legend()
plt.show()