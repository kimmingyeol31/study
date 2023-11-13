### 1. JSP 프로그램에서 자바 빈즈의 역할을 기술하시오.

자바 빈즈는 자바 프로그램에서 특정한 작업인 비즈니스 로직을 독립적으로 수행하는 하나의 프로그램 단위이다. 자바 빈즈를 이용하면 JSP 페이지가 복잡한 자바 코드로 구성되는 것을 피하고, JSP 페이지에는 HTML 코드와 쉽고 간단한 자바 코드만을 구성할 수 있다.
<br>

### 2. 자바 빈즈에서 setter와 getter는 각각 무엇인가?

setter와 getter는 외부에서 자바 빈즈의 필드를 참조하기 위해 public으로 선언된 메소드이다. 이때, 메소드 중에서 필드에 값을 저장하는 메소드를 setter라 하고, 필드에 저장된 값을 반환하는 메소드를 getter라고 한다.
<br>

### 3. 다음 각각의 액션 태그는 무엇이 문제인가?

1. ```jsp
   <jsp:useBean id="test" class="ClassName" scope="all" />
   ```
   all 이라는 scope는 존재하지 않는다.

2. ```jsp
   <jsp:useBean id="test" class="ClassName" scope="page" />
   <jsp:setProperty name="score" property="name" />
   ```
   속성 name은 `<jsp:useBean ... />` 태그의 id에 지정한 test로 지정해야 한다.

3. ```jsp
   <jsp:useBean id="score" class="javabean.Scorebean" scope="page" />

   <jsp:setProperty name="score" property="김성민" />
   <jsp:setProperty name="score" value="85" />
   ```
   태그 `<jsp:setProperty ... />`는 반드시 속성 name과 property를 가지고 있어야 한다.

4. ```jsp
   <jsp:useBean id="score" class="javabean.GradeBean" scope="page" />

   <jsp:setProperty name="score" property="name" param="name" />
   <jsp:setProperty name="score" property="point" param="point" />

   <jsp:getProperty name="score" property="*" />
   ```
   `property="*"` 값은 `<jsp:setProperty ... />` 태그에서 파라미터의 모든 값을 저장하라는 의미로 사용된다.
<br>

### 4. 예제 score.jsp와 자바 빈즈 javabean.ScoreBean을 이용하여 다음과 같이 성적에 맞는 학점도 함께 출력되도록 프로그램을 수정하시오.

1\. score.jsp
```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 예제 : score.jsp</title>
</head>
<body>
  <h2>JavaBeans를 이용한 학생의 이름과 성적의 저장과 조회 예제</h2>
  <jsp:useBean id="score" class="javabean.ScoreBean" scope="page" />

  <hr>
  <h3>이름과 성적을 JavaBeans ScoreBean에 저장</h3><p>
  이름 : <%= "김성민 "%>,
  성적 : <%= "85" %><p>
  <jsp:setProperty name="score" property="name" value="김성민" />
  <jsp:setProperty name="score" property="point" value="85" />

  <hr>
  <h3>JavaBeans ScoreBean에 저장된 정보를 조회 출력</h3><p>
  이름 : <jsp:getProperty name="score" property="name"/><br>
  성적 : <jsp:getProperty name="score" property="point"/><br>
  학점 : <jsp:getProperty name="score" property="grade"/>
</body>
</html>
```  
  
2\. ScoreBean.java
```java
package javabean;

public class ScoreBean {
    private String name;
    private int point;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getGrade() {
        if (point >= 90) {
            return "A";
        }
        else if (point >= 80) {
            return "B";
        }
        else if (point >= 70) {
            return "C";
        }
        else if (point >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }
}
```  
<br>

### 5. 학생 정보 폼을 처리하는 예제 프로그램인 student.jsp에서 폼의 입력 형식 6개로부터 전달 받은 자료를 자바 빈즈에 전달하는데 다음과 같은 태그를 하나 이용하였다. 다음 태그를 입력 형식 6개에 맞도록 6개의 <jsp:setProperty ... /> 태그 문장으로 바꾸어 실행하시오.

```jsp
<jsp:setProperty name="student" proeprty="id" />
<jsp:setProperty name="student" proeprty="name" />
<jsp:setProperty name="student" proeprty="snum" />
<jsp:setProperty name="student" proeprty="year" />
<jsp:setProperty name="student" proeprty="pass" />
<jsp:setProperty name="student" proeprty="email" />
```  
<br>

### 6. 다음은 자바 빈즈 calculation.Computer를 이용하여 더하기, 빼기, 곱하기, 나누기가 실행되도록 구현한 프로그램이다. 이 프로그램을 구성하는 소스는 3개로, calc.html, calc.jsp, calculation.Computer 이다. 다음에서 빈 부분의 코딩을 완성하시오.

1\. calc.html
```html
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>예제 계산기</title>
</head>
<body>
  <h2>계산할 두 실수와 연산자를 입력하세요</h2>
  <form method="post" action="calc.jsp">
    <input type="text" name="operand1" size="5">
    <select name="operator">
      <option selected value="+">+</option>
      <option value="-">-</option>
      <option value="*">*</option>
      <option value="/">/</option>
    </select>
    <input type="text" name="operand2" size="5"><p>
    <input type="submit" value="입력완료">
    <input type="reset" value="다시쓰기">
  </form>
</body>
</html>
```  
  
2\. calc.jsp
```java
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>JSP 예제 calc.jsp</title>
</head>
<body>
  <h2>계산 결과</h2>
  <% request.setCharacterEncoding("euc-kr"); %>
  <jsp:useBean id="calc" class="calculation.Computer" scope="page" />
  <jsp:setProperty name="calc" property="*" />

  <jsp:getProperty name="calc" property="operand1"/>
  <jsp:getProperty name="calc" property="operator"/>
  <jsp:getProperty name="calc" property="operand2"/>
 =<jsp:getProperty name="calc" property="result"/>
</body>
</html>
```  
  
3\. calculation.Computer
```jsp
package calculation;

public class Computer {
    private double operand1;
    private double operand2;
    private String operator;

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getResult() {
        double result = 0;

        if (operator.equals("+")) {
            result = operand1 + operand2;
        }
        else if (operator.equals("-")) {
            result = operand1 - operand2;
        }
        else if (operator.equals("*")) {
            result = operand1 * operand2;
        }
        else if (operator.equals("/")) {
            result = operand1 / operand2;
        }

        return result;
    }
}
```