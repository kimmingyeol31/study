### 1. JSP 내장 객체 9개를 기술하시오.

| 내장 객체   | 설명                                                                                                       |
|-------------|------------------------------------------------------------------------------------------------------------|
| request     | 클라이언트가 서버에게 전송하는 관련 정보를 처리하기 위한 객체이다.                                         |
| response    | 서버가 클라이언트에게 요청에 대한 응답을 보내기 위한 객체이다.                                             |
| session     | 클라이언트마다 세션 정보를 저장 및 유지 관리하기 위한 객체이다.                                            |
| out         | JSP 페이지의 출력을 위한 객체이다.                                                                         |
| pageContext | JSP 페이지에 관한 정보와 다른 페이지로 제어권을 넘겨줄 때 사용되는 객체이다.                               |
| config      | 서블릿이 초기화 되는 동안 JSP 컨테이너가 환경 정보를 서블릿으로 전달할 때 사용하는 객체이다.               |
| application | 웹 애플리케이션에서 유지 관리되는 여러 환경 정보를 관리하는 객체이다.                                      |
| page        | JSP 페이지 자체를 나타내는 객체이다.                                                                       |
| exception   | 페이지 지시자에서 isErrorPage를 true로 한 경우에만 사용이 가능하며, 적절한 예외 처리 구현을 위한 객체이다. |
<br>

### 2. 다음 프로그램의 실행 결과는 1이 아니다. 그 이유를 기술하시오.

application은 내부 객체의 이름으로 이미 존재하는 키워드로, JSP 선언에 이용하더라도 지역 변수인 내부 객체와 충돌하므로 1이 출력되지 않는다.  
<br>

### 3. 다음 프로그램은 오류가 발생한다. 그 이유를 기술하시오.

exception 페이지 지시자의 속성 isErrorPage가 true인 경우에만 선언되는 변수이다. 다음 프로그램에선 페이지 지시자의 속성을 바꿔주는 코드가 없으니 내장 객체 exception이 선언되지 않았으므로 사용할 수 없다.  
<br>

### 4. 다음 5개의 내장 객체애 대하여 자료유형에 해당하는 패키지와 클래스를 기술하시오.

| 내장 객체     | 소속 패키지           | 클래스 이름            |
|-------------|--------------------|---------------------|
| request     | javax.servlet.http | HttpServletRequest  |
| response    | javax.servlet.http | HttpServletResponse |
| application | javax.servlet      | ServletContext      |
| exception   | java.lang          | Throwable           |
| out         | javax.servlet.jsp  | JspWriter           |
<br>

### 5. 다음 프로그램의 실행 결과를 쓰시오.

```html
4. application
5. exception
```
<br>

### 6. JSP 내장 객체 중에서 JSP 페이지에 관한 정보와 다른 페이지로 제어권을 넘겨줄 때 이용되는 메소드를 제공하며, 8개의 다른 내부 객체를 얻을 수 있는 메소드를 제공하는 객체는 무엇인가?

pageContext  
<br>

### 7. 다음과 같이 [기술정보 이력서]를 입력 받아 출력하는 하나의 HTML 문서와 하나의 JSP 프로그램을 작성하시오.

question7.html
```html
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>기술정보 이력서</title>
</head>
<body>
  <h1>기술정보 이력서</h1>
  <form method="post" action="question7.jsp">
    <table border="1">
      <tr>
        <td>이름</td>
        <td><input type="text" name="name"></td>
      </tr>
      <tr>
        <td>주민등록번호</td>
        <td><input type="text" name="ssn1"> - <input type="text" name="ssn2"></td>
      </tr>
      <tr>
        <td>학력</td>
        <td>
          <input type="radio" name="education" value="고졸" checked> 고졸
          <input type="radio" name="education" value="대졸"> 대졸
          <input type="radio" name="education" value="대학원졸"> 대학원졸
        </td>
      </tr>
      <tr>
        <td>전공</td>
        <td>
          <select name="major">
            <option selected value="컴퓨터공학과">컴퓨터공학과</option>
            <option value="산업공학과">산업공학과</option>
            <option value="디자인과">디자인과</option>
          </select>
        </td>
      </tr>
      <tr>
        <td>사용가능 플랫폼</td>
        <td>
          <select multiple name="platform">
            <option selected value="Windows 계열 PC">Windows 계열 PC</option>
            <option value="Windows 계열 서버">Windows 계열 서버</option>
            <option value="UNIX">UNIX</option>
            <option value="IBM OS/390">IBM OS/390</option>
          </select>
        </td>
      </tr>
      <tr>
        <td><input type="submit" value="보내기"></td>
        <td><input type="reset" value="취소"></td>
      </tr>
    </table>
  </form>
</body>
</html>
```
<br>

question7.jsp
```jsp
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>기술 정보 이력서</title>
</head>
<body>
    <h1>기술정보 이력서</h1>
    <p>
    <%
        String platforms = "";

        for (String platform : request.getParameterValues("platform")) {
            platforms += "[" + platform + "] ";
        }
    %>
    이름 : <%= request.getParameter("name") %><br>
    주민등록번호 : <%= request.getParameter("ssn1") + " - " + request.getParameter("ssn2") %><br>
    학력 : <%= request.getParameter("education") %><br>
    전공 : <%= request.getParameter("major") %><br>
    경험 플랫폼 : <%= platforms %>
</body>
</html>
```