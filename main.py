import csv
import matplotlib.pyplot as plt

file = open('sample2.csv', 'r', encoding='utf-8')
csv_file = csv.reader(file)

header = next(csv_file)

# 남자와 여자 각각 0세부터 100세까지의 인구 수를 저장해 둘 리스트 생성
male = []
female = []

for line in csv_file:
    # 전국 단위의 인구 수만 가져옴
    all = '전국  (0000000000)'
    # 전국 인구 수가 아닐 경우 건너뛰기
    if line[0] != all:
        continue

    # 남자 0세인 3번째 인덱스부터 100세 이상까지인 103번째 인덱스를 가져오기 위해 3번부터 104번까지 자르기
    male = line[3:104]
    # 동일하게 여자도 106번째 인덱스부터 100세 이상에 해당되는 207번째 인덱스까지 가져오기
    female = line[106:208]

    # 가져온 데이터 타입은 정수(int)가 아니라 문자열(str)이기 때문에 정수로 바꿔주는 작업

    # 남자
    for sum in line[3:104]:
        # 문자열은 "200,000" 형태로 이루어졌기 때문에 가운데 쉼표를 제거해 주기 위해 replace로 ,를 공백으로 변경
        # 이후 항아리 모양의 그래프의 왼쪽(그래프의 2, 3방면)에 표시해줄 것이기 때문에 문자열을 정수로 변경해 줌과 동시에음수로 변경
        male.append(-int(sum.replace(",", "")))
        # 문자열로 구성된 숫자를 정수로 바꿔준 다음에 기존의 male 리스트에 넣어 줌과 동시에 바꿔준 문자열 숫자는 제거해줌
        del male[0]

    # 여자
    for sum in line[106:208]:
        female.append(int(sum.replace(",", "")))
        del female[0]

# 그래프의 x축(나이)를 구성
x = range(101)

# 한글 폰트 깨짐을 해결해주기 위한 설정
plt.rc('font', family='Malgun Gothic')
plt.rc('axes', unicode_minus=False)

# 항아리 형태의 그래프를 출력, label을 추가하여 해당 그래프의 이름을 추가함
plt.barh(x, male, label='남자')
plt.barh(x, female, label='여자')

# 추가한 레이블(이름)을 표시해주기 위해 legend 사용
plt.legend()
# 그래프 표시
plt.show()
