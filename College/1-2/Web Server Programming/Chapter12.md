### 1. 다음 JSP 프로그램에서 표현언어에 주의하여 그 결과를 기술하시오.
```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>표현언어 예제</title>
</head>
<body>
  \${ 3 div 6 } = ${ 3 div 6 }<br>
  \${ 10 mod 3 } = ${ 10 mod 3 }<br>
  \${ 3 gt 4 } = ${ 3 gt 4 }<br>
  \${ 2 * 3 ne 6} = ${ 2 * 3 ne 6}<br>
  \${ not (5 lt 6 and 7 ge 6) } = ${ not (5 lt 6 and 7 ge 6) }<br>
</body>
</html>
```
결과: 
```html
${ 3 div 6 } = 0.5
${ 10 mod 3 } = 1
${ 3 gt 4 } = false
${ 2 * 3 ne 6} = false
${ not (5 lt 6 and 7 ge 6) } = false
```
<br>

### 2. 다음 JSP 프로그램에서 표현언어에 주의하여 그 결과를 기술하시오.
```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>표현언어 예제</title>
</head>
<body>
  \${ empty 2 } = ${ empty 2 }<br>
  \${ empty 0 } = ${ empty 0 }<br>
  \${ empty name } = ${ empty name }<br>
  \${ empty requestScope } = ${ empty requestScope }<br>
  \${ empty header } = ${ empty header }<br>
</body>
</html>
```
결과: 
```html
${ empty 2 } = false
${ empty 0 } = false
${ empty name } = true
${ empty requestScope } = true
${ empty header } = false
```
<br>

### 3. 표현언어의 내장 객체 11가지를 기술하시오.
1. **pageContext**: JSP 페이지 기본 객체로서, servletContext, session, request, response 등의 여러 객체를 참조 가능.
2. **pageScope**: page 기본 객체에 저장된 속성의 <속성, 값>을 저장한 Map 객체. ${pageScope.속성}으로 값을 참조.
3. **requestScope**: request 기본 객체에 저장된 속성의 <속성, 값>을 저장한 Map 객체. ${requestScope.속성}으로 값을 참조
4. **sessionScope**: session 기본 객체에 저장된 속성의 <속성, 값>을 저장한 Map 객체. ${sessionScope.속성}으로 값을 참조.
5. **applicationScope**: Applicatioin 기본 객체에 저장된 속성의 <속성, 값>을 저장한 Map 객체. ${applicationScope.속성}으로 값을 참조.
6. **param**: 요청 매개변수 <매개변수 이름, 값>을 저장한 Map 객체. ${param.name}은 request.getParameter(name)을 대체.
7. **paramValues**: 요청 매개변수 배열을 <매개변수 이름, 값>을 저장한 Map 객체. request.getParameterValues() 처리와 동일.
8. **header**: 요청 저보의 <헤더이름, 값>을 저장한 Map 객체. ${header["name"]}은 request.getHeader(헤더이름)과 같음.
9. **headerValues**: 요청 정보 배열을 <헤더이름, 값>을 저장한 Map 객체.request.getHeaders()의 처리와 동일하다.
10. **initParam**: 초기화 매개변수의 <이름, 값>을 저장한 Map 객체. ${initParam.name}은 application.getInitParameter(name)을 대체.
11. **cookie**: 쿠키 정보의 배열을 <쿠키이름, 값>을 저장한 Map 객체. request.getCookies()의 Cookie 배열의 이름과 값으로 Map을 생성.   
<br>  

### 4. 다음은 표현언어의 내장 객체 header를 출력한 내용이다. 이 출력 내용을 참고로 다음 내장 객체 header에 대한 질문에 답하시오.
(1) 내장 객체 header를 이용하여 다음과 같은 형태로 참조할 수 있는 속성은 "cookie" 이외에 무엇이 더 있겠는가?  
`connection`, `host`, `accept-language`, `accept`, `user-agent`, `accept-encoding`, `ua-cpu`  

(2) 내장 객체 header에서 이용할 수 있는 모든 속성에 대한 저장 값을 출력하는 프로그램을 작성하시오.  
```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>표현언어 내장객체</title>
</head>
<body>
  <h2>\${ header } : 결과</h2>
  ${ header } <p>

  <hr>
  \${ header['cookie'] } = ${ header['cookie'] }<p>
  \${ header['connection'] } = ${ header['connection'] }<p>
  \${ header["host"] } = ${ header["host"] }<p>
  \${ header["accept-language"] } = ${ header["accept-language"] }<p>
  \${ header["user-agent"] } = ${ header["user-agent"] }<p>
  \${ header["ua-cpu"] } = ${ header["ua-cpu"] }<p>
</body>
</html>
```  
<br>

### 5. 다음은 클래스에 정의된 메소드를 태그 라이브러리 디스크립터에서 함수로 정의하여, 표현언어에서 이용하는 과정을 기술하였다. 각각의 질문에 답하시오.
(1) 다음 클래스에서 메소드 hello()를 표현헌어에서 함수로 이용할 예정이다. 빈 공간에 알맞은 키워드는 무엇인가?  
```java
package sample;

public class HelloTLD {
    public static String hello() {
        return "Hello TLD";
    }
}
```  
(2) 다음은 TLD 파일 ELfunction.tld 파일의 일부이다. 다음 빈 공간을 알맞게 채우시오.  
```tld
<function>
    <description>간단한 문자열 변환</description>
    <name>getHello</name>
    <function-class>
        sample.HelloTLD
    </function-class>
    <function-signature>
        java.lang.String hello()
    </function-signature>
</function>
```  
(3) 다음은 위에서 만든 함수를 호출하는 표현언어이다. 다음 빈 공간을 알맞게 채우시오.
```jsp
<%@ taglib prefix="test" uri="/WEB-INF/tld/ELfunction.tld" %>

${ test.hello() }
```  
(4) 위 (3)번 프로그램의 결과는 무엇인가?  
```html
Hello TLD!
```  
<br>

### 6. 다음에서 표현언어 비활성화 지시자를 살펴보고, 다음 표현언어의 결과를 기술하시오.
(1)
```jsp
<%@ page isELIgnored="false" %>
${ 2 / 4 }
```  
결과:
```html
0.5
```  
(2)  
```jsp
<%@ page isELIgnored="true" %>
${ 2 / 4 }
```  
결과:
```html
${ 2 / 4 }
```