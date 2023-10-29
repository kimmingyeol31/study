### 1. 이클립스에서 JSP 프로그램을 위한 프로젝트를 다음 조건에 맞도록 생성하시오.
\-  
<br>

### 2. out.print()와 HTML 태그 <br\>을 이용하여 다음을 출력하는 프로그램을 작성하시오.
```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 예제 ex02.jsp</title>
</head>
<body>
    <%
        out.print("?<br>");
        out.print("???<br>");
        out.print("?????<br>");
        out.print("???????<br>");
    %>
</body>
</html>
```
<br>

### 3. 이클립스에서 다음 소스를 이용하여, 이름이 New JSP File by me JSP 템플릿을 생성하시오.
\-  
<br>

### 4. 위 JSP 템플릿을 이용하여 다음 프로그램을 작성하고 실행하시오.
\-
<br>

### 5. 클래스 date의 메소드 toLocalString()을 이용하여 다음과 같이 출력되도록 예제 date.jsp를 수정하시오.
```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 예제 ex05.jsp</title>
</head>
<body>
    <%@ page import="java.util.Date" %>
    <%
        out.print("현재 시각은 [" + new Date().toLocaleString() + "] 입니다");
    %>
</body>
</html>
```