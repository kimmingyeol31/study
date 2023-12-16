### 1. 커스텀 태그를 만드는 방법의 종류와 특징을 기술하시오.
- **태그 처리기**: 태그 처리기인 자바 클래스, 태그 라이브러리 디스크립터인 TLD 작성이 필요하다. 일반 자바 프로그램으로 태그 처리기를 작성한다.
- **태그 파일**: 태그 파일만 필요하다. JSP 프로그램과 같이 스크립트 요소와 HTML, 그리고 다른 커스텀 태그를 사용하여 태그 처리를 작성한다. 태그 처리기 방식보다 간편하다.  
<br>

### 2. 다음은 클래스 SimpleTagSupport에서 제공하는 주요 메소드의 설명이다. 다음의 빈 부분에 적합한 메소드 이름을 기술하시오.
| 반환 유형   | 메소드          | 설명                                                                                              |
|-------------|-----------------|---------------------------------------------------------------------------------------------------|
| void        | doTag()         | 태그가 수행해야 할 일을 처리하는 메소드로, 태그 처리 클래스에서 오버라이딩(overriding)해서 구현   |
| JspFragment | getJspBody()    | 태그의 몸체 부분을 반환                                                                           |
| JspContext  | getJspContext() | 페이지 context를 반환하며, 주로 getJspContext.getOut()을 통해 출력에 사용할 JspWriter 객체를 얻음 |  
<br>

### 3. 다음에 기술되는 조건을 만족하는 커스텀 태그를 JSP 2.0 태그 처리기 방식으로 작성하고, 다음 각 질문에 답하시오.  
```
• 태그 처리기 파일이름 : PrintBody.java  
• 태그 역할 : 몸체 부분의 문자열을 purple 색상으로 출력  
• TLD 파일이름 : PrintBody.tld  
• 태그 이름 : print  
• 태그 접두어 : mycustom  
• 태그 사용 JSP 파일이름 : PrintBody.jsp  
```  
(1) 태그 처리기 파일 PrintBody.java에서 상속받는 클래스는 무엇인가?  
`SimpleTagSupport`  

(2) TLD 파일 PrintBody.tld가 저장되는 폴더의 위치는 어디인가?  
`/WEB-INF/tld`  

(3) 태그 사용 JSP 파일 PrintBody.jsp에서 이용되는 지시자 taglib를 기술하시오.  
`<%@ taglib prefix="mycustom" uri="/WEB-INF/tld/PrintBody.tld" %>`  

(4) 태그 사용 JSP 파일 PrintBody.jsp에서 이용되는 태그 print의 한 예를 기술하시오.  
```jsp
<mycustom:print>
텍스트 입력
</mycustom:print>
```  
<br>

### 4. 다음에 기술되는 조건을 만족하는 커스텀 태그를 JSP 2.0 태그 파일 방식으로 작성하고, 다음 각 질문에 답하시오.
```
• 태그 파일이름 : *
• 태그 역할: 몸체 부분의 문자열을 Purple 색상으로 출력
• 태그 이름 : printpurple
• 태그 접두어 : mycustom
• 태그 사용 JSP 파일이름 : PrintBodyTagFile.jsp
```  
(1) 태그 파일 이름은 무엇으로 해야 하는가?  
`printpurple`  

(2) 태그 파일이 저장되는 폴더의 위치는 어디인가?  
`/WEB-INF/tags`  

(3) 태그 사용 JSP 파일 PrintBodyTagFile.jsp에서 이용되는 지시자 taglib를 기술하시오.  
`<%@ taglib tagdir="/WEB-INF/tags" prefix="mycustom" %>`  

(4) 태그 사용 JSP 파일 PrintBodyTagFile.jsp에서 이용되는 태그 printpurple의 한 예를 기술하시오.  
```jsp
<mycustom:printpurple>
텍스트 입력
</mycustom:printpurple>
```