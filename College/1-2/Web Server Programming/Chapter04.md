### 1. JSP 스크립트 태그의 종류를 기술하시오.
| 종류       | 역할                                                 |
|------------|------------------------------------------------------|
| 스크립트릿 | 자바 코드를 삽입할 수 있다.                          |
| 지시어     | 페이지의 속성을 지정한다.                            |
| 선언       | 소속 변수를 선언하거나 메소드를 정의할 수 있다.      |
| 표현식     | 변수, 계산식, 함수 결과 등을 문자열 형태로 출력한다. |
| 주석       | 주석을 삽입할 수 있다.                               |
<br>

### 2. JSP 표현식을 이용하여 다음과 같이 본인의 이름과 학번을 출력하는 JSP 프로그램을 작성하시오.
```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 예제</title>
</head>
<body>
    이름: <%= "홍길동" %><br>
    학번: <%= 20103056 %>
</body>
</html>
```
<br>

### 3. 다음 프로그램의 실행 결과를 쓰시오.
```html
s1 = 지역변수
this.s1 = 소속변수
```
<br>

### 4. 다음 소스에서 오류를 수정하여 실행하시오.
```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 예제 ex04.jsp</title>
</head>
<body>
    원주율은 <%= Math.PI %> 이다.
</body>
</html>
```
<br>

### 5. 다음 프로그램의 실행 결과를 쓰시오.
```html
[2*1 = 2] [2*2 = 4] [2*3 = 6] [2*4 = 8] [2*5 = 10] [2*6 = 12] [2*7 = 14] [2*8 = 16] [2*9 = 18]
[3*1 = 3] [3*2 = 6] [3*3 = 9] [3*4 = 12] [3*5 = 15] [3*6 = 18] [3*7 = 21] [3*8 = 24] [3*9 = 27]
[4*1 = 4] [4*2 = 8] [4*3 = 12] [4*4 = 16] [4*5 = 20] [4*6 = 24] [4*7 = 28] [4*8 = 32] [4*9 = 36]
[5*1 = 5] [5*2 = 10] [5*3 = 15] [5*4 = 20] [5*5 = 25] [5*6 = 30] [5*7 = 35] [5*8 = 40] [5*9 = 45]
[6*1 = 6] [6*2 = 12] [6*3 = 18] [6*4 = 24] [6*5 = 30] [6*6 = 36] [6*7 = 42] [6*8 = 48] [6*9 = 54]
[7*1 = 7] [7*2 = 14] [7*3 = 21] [7*4 = 28] [7*5 = 35] [7*6 = 42] [7*7 = 49] [7*8 = 56] [7*9 = 63]
[8*1 = 8] [8*2 = 16] [8*3 = 24] [8*4 = 32] [8*5 = 40] [8*6 = 48] [8*7 = 56] [8*8 = 64] [8*9 = 72]
[9*1 = 9] [9*2 = 18] [9*3 = 27] [9*4 = 36] [9*5 = 45] [9*6 = 54] [9*7 = 63] [9*8 = 72] [9*9 = 81]
```
<br>

### 6. for 문장을 이용하여 다음과 같이 1부터 100까지의 합이 출력되도록 JSP 프로그램을 작성하시오.
```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 예제 ex06.jsp</title>
</head>
<body>
    <%
        int sum = 0;

        for (int i = 1; i < 101; i++) {
            sum += i;
        }
    %>

    1부터 100까지의 합은  <%= sum %>이다.
</body>
</html>
```