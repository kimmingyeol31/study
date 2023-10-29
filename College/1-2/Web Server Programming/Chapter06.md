### 1. 액션 태그의 종류와 그 기능을 설명하시오.

| 태그    | 기능                                                                                                                                           |
|---------|------------------------------------------------------------------------------------------------------------------------------------------------|
| include | 현재 JSP 페이지에서 속성 page에 기술된 다른 JSP 페이지를 호출하여 그 결과를 include 태그의 위치에 삽입시키는 역할을 수행한다.                  |
| forward | 현재 페이지의 작업은 모두 중지되고, 이전에 출력한 버퍼링 내용도 모두 사라지게 되어 출력되지 않으며, 모든 제어가 page에 지정한 파일로 이동한다. |
| param   | include나 forward 태그와 같이 사용되며, page에 지정된 페이지로 파라미터의 이름과 값을 전송하는 역할을 수행한다.                                |
| plugin  | 웹 브라우저에서 자바 빈즈 또는 애플릿을 플러그인하여 실행한다.                                                                                 |  
<br>

### 2. 다음 2개의 태그와 같은 기능을 수행하는 내장 객체의 메소드를 각각 기술하시오.
| 태그 종류 | 액션 태그                      | 메소드 호출                           |
|-----------|--------------------------------|---------------------------------------|
| include   | <jsp:include page="sub.jsp" /> | <% pageContext.include("sub.jsp"); %> |
| forward   | <jsp:forward page="sub.jsp" /> | <% pageContext.forward("sub.jsp"); %> |
<br>

### 3. 다음 2개의 파일에서 파일 includeparam.jsp를 실행하면 다음과 같다. 다음 프로그램에서 빈 부분을 코딩하시오.

(1) includeparam.jsp  
`page`, `<jsp:param`, `/>`, `</jsp:include>`  

(2) paramsub.jsp  
`request`  
<br>

### 4. 다음 2개의 파일에서 forwardparam.jsp를 실행하면 무엇이 출력되는가? 또한 웹 브라우저의 주소와 캡션에는 무엇이 남아있는가?

웹 브라우저 주소: `~/forwardparam.jsp`  
출력값: `1년은 52주 입니다.`  
캡션: `JSP 예제 : paramsub.jsp`  
<br>

### 5. 다음 2개의 프로그램에서 빈 부분을 완성하고 includemain.jsp를 실행한 브라우저의 결과를 기술하시오.

(1) includemain.jsp  
`/>`, `>`, `name`, `value`, `/>`, `</jsp:include>`  

(2) paramsub.jsp  
`programming`  

결과: 1번 밑엔 파란색 null 텍스트가 표시되고, 2번 밑엔 파란식 jsp 텍스트가 표시 됨.  
<br>

### 6. 다음 2개의 프로그램에 대하여 다음 물음에 답하시오.

1. 파란색 텍스트로 '취미는 null 입니다.'라는 문장이 출력됨.  
2. `hobbysub.jsp?hobby=golf`  
3.  ```jsp
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <title>Question 6</title>
    </hsead>
    <body>
      <jsp:forward page="hobbysub.jsp">
        <jsp:param name="hobby" value="golf"/>
      </jsp:forward>
    </body>
    </html>
    ```
