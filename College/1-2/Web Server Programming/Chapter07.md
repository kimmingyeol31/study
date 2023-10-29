### 1. 비연결성, 무상태성이란 무엇인가?

클라이언트가 서버로 요청을 했을 때, 서버는 요청에 응답하면서 서버와 클라이언트의 연결이 종료된다.
이후 클라이언트에서 서버에 다시 요청을 하더라도 서버는 클라이언트의 이전 상태를 가지고 있지 않은 상태에서 다시 연결과 종료가 이루어진다.  
이처럼 서버와 클라이언트가 서로 연결되어 있지 않은 것을 비연결성이라 하며, 서버가 클라이언트의 상태를 저장하지 않은 것을 무상태성이라 한다. 이는 HTTP 연결의 특성이다.  
<br>

### 2. 다음은 Cookie와 session을 비교한 표이다. 빈 부분을 채우시오.  

| 태그 종류                 | 액션 태그                       | 메소드 기능                          |
|---------------------------|---------------------------------|--------------------------------------|
| 사용 클래스 및 인터페이스 | class javax.servlet.http.Cookie | class javax.servlet.http.HttpSession |
| 관련 내장객체             | request, response               | session                              |
| 저장 값 유형              | String                          | Object                               |
| 저장 장소                 | 클라이언트                      | 서버                                 |
| 정보 크기                 | 총 1.2MB                        | 제한 없음                            |
| 보안                      | 어려움                          | 강력함                               |
<br>

### 3. 쿠키의 값으로 한글을 그대로 입력하면 오류가 발생한다. 다음 소스와 같이 클래스 java.net.URLEncoder와 java.net.URLDecoder를 이용하여 한글 자료 입력 시 인코딩, 출력 시 디코딩 처리를 해야한다. 다음 프로그램을 코딩하여 실행하시오.

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 예제 : 쿠키 한글 처리</title>
</head>
<body>
    <%@ page import="java.net.URLEncoder, java.net.URLDecoder" %>
    <h2>쿠키 한글 입력 시 인코딩 처리 삽입, 그대로 출력</h2>
    <%
            Cookie user = new Cookie("user", URLEncoder.encode("홍 길 동", "euc-kr"));
            Cookie pwd = new Cookie("password", URLEncoder.encode("hong길동", "euc-kr"));

            response.addCookie(user);
            response.addCookie(pwd);

            Cookie[] cookies = request.getCookies();

            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    out.println(cookie.getName() + ", ");
                    out.println(cookie.getValue() + "<br>");
                }
            }
    %>

    <h2>쿠키 한글로 디코딩하여 출력</h2>
    <%
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.println(cookie.getName() + ", ");
                out.println(URLDecoder.decode(cookie.getValue(), "euc-kr") + "<br>");
            }
        }
    %>
</body>
</html>
```
<br>

### 4. 다음은 쿠키를 이용하는 프로그램에 대한 설명이다. 다음 설명에 가장 알맞은 자바 코드를 기술하시오. 필요한 객체는 선언하여 이용하시오.

1. 이름이 "lang", 값이 "java"인 쿠키 객체를하나 생성하여 변수에 저장하는 문장을 작성하시오.
    ```java
    Cookie cookie = new Cookie("lang", "java");
    ```  
  
2. 위에서 작성한 쿠키 객체를 클라이언트 컴퓨터에 저장하는 문장을 작성하시오.  
    ```java
    response.addCookie(cookie);
    ```  
  
3. 위에서 클라이언트 컴퓨터에 저장한 쿠키 객체를 얻기 위해, 쿠키 배열을 반환하여 쿠키 배열 변수에 저장하는 문장을 작성하시오.  
    ```java
    Cookie[] cookies = request.getCookies();
    ```
  
4. 위에서 저장된 쿠키의 배열에서 각각의 쿠키 객체를 참조하여, 쿠키의 이름과 값을 출력하는 모듈을 일반 for 구문으로 작성하시오.  
    ```java
    for (int i = 0; i < cookies.length; i++) {
        out.println(cookies[i].getName() + ", ");
        out.println(cookies[i].getValue() + "<br>");
    }
    ```

5. 위에서 구현한 문장을 for each 구문으로 작성하시오.
    ```java
    for (Cookie cookie : cookies) {
        out.println(cookie.getName() + ", ");
        out.println(cookie.getValue() + "<br>");
    }
    ```
<br>

### 5. 다음은 쿠키의 이용 방법을 정리한 표이다. 빈 부분을 채우시오.

| 수행 기능                  | 이용 방법                                            | 이용 메소드                                 |
|----------------------------|------------------------------------------------------|---------------------------------------------|
| 쿠키 생성                  | Cookie cookie = new Cookie("lang", "java");          | Cookie(String name, String value);          |
| 쿠키 유효기간 지정 및 조회 | cookie.setMaxAge(5);<br> int t = cookie.getMaxAge(); | setMaxAge(int time);<br> getMaxAge();       |
| 쿠키 값 수정               | cookie.setValue("python");                           | setValue(String value);                     |
| 쿠키 저장                  | response.addCookie(cookie);                          | addCookie(Cookie cookie);                   |
| 모든 쿠키 조회             | Cookie[] cookies = request.getCookies();             | getCookies();                               |
| 개별 쿠키 이름 조회        | String name = cookie.getName();                      | getName();                                  |
| 개별 쿠키 값 조회          | String value = cookie.getValue();                    | getValue();                                 |
| 쿠키 삭제                  | cookie.setMaxAge(0);<br> response.addCookie(cookie); | setMaxAge(0);<br> addCookie(Cookie cookie); |
<br>

### 6. 다음은 세션의 이용 방법을 정리한 표이다. 빈 부분을 채우시오.
| 수행 기능                  | 이용 방법                                                                                                                                  | 이용 메소드                                                   |
|----------------------------|--------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------|
| 세션 속성 설정             | session.setAttribute("time", new Date());                                                                                                  | setAttribute(String name, Object value)                       |
| 세션 속성 조회             | Date date = (Date) session.getAttribute("time");                                                                                           | getAttribute(String name)                                     |
| 세션 유효기간 지정 및 조회 | session.setMaxInactiveInterval(30);<br> int time = session.getMaxInactiveInterval();                                                       | setMaxInactiveInterval(int time)<br> getMaxInactiveInterval() |
| 세션 모든 속성의 이름 조회 | Enumeration e = session.getAttributeNames();                                                                                               | getAttributeNames()                                           |
| Enumeration 처리           | while (e.hasMoreElements()) {<br>     String name = (String) e.nextElement();<br>     Date date = (Date) session.getAttribute(name);<br> } | hasMoreElements()<br> nextElement()                           |
| 세션 속성 삭제             | session.removeAttribute("time");                                                                                                           | removeAttribute(String name)                                  |
| 세션 ID 조회               | String ID = session.getId();                                                                                                               | getId()                                                       |
| 세션 생성시간 조회         | long time = session.getCreationTime();                                                                                                     | getCreationTime()                                             |
| 세션 종료                  | session.invalidate();                                                                                                                      | invalidate()                                                  |