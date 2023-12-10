### 1. 다음은 JSTL이 제공하는 5가지 분류에 대한 태그의 세부, 영역과 태그에서 사용되는 접두어, 그리고 URI를 정리한 표이다. 다음에서 빈 부분을 완성하시오.
<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{border-width:1px;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-width:1px;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
.tg .tg-nrix{text-align:center;vertical-align:middle}
</style>
<table class="tg">
<thead>
  <tr>
    <th class="tg-nrix">분류</th>
    <th class="tg-nrix">세부 영역</th>
    <th class="tg-nrix">접두어</th>
    <th class="tg-nrix">URI</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-nrix" rowspan="4">Core</td>
    <td class="tg-nrix">변수 지원</td>
    <td class="tg-nrix" rowspan="4">c</td>
    <td class="tg-nrix" rowspan="4">http://java.sun.com/jsp/jstl/core</td>
  </tr>
  <tr>
    <td class="tg-nrix">제어 흐름</td>
  </tr>
  <tr>
    <td class="tg-nrix">URL 관리</td>
  </tr>
  <tr>
    <td class="tg-nrix">출력, 예외처리</td>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="3">XML</td>
    <td class="tg-nrix">코어</td>
    <td class="tg-nrix" rowspan="3">x</td>
    <td class="tg-nrix" rowspan="3">http://java.sun.com/jsp/jstl/xml</td>
  </tr>
  <tr>
    <td class="tg-nrix">흐름제어</td>
  </tr>
  <tr>
    <td class="tg-nrix">변환</td>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="3">Internationalization</td>
    <td class="tg-nrix">지역화</td>
    <td class="tg-nrix" rowspan="3">fat</td>
    <td class="tg-nrix" rowspan="3">http://java.sun.com/jsp/jstl/fmt</td>
  </tr>
  <tr>
    <td class="tg-nrix">메시지 포맷</td>
  </tr>
  <tr>
    <td class="tg-nrix">수와 날짜 포맷</td>
  </tr>
  <tr>
    <td class="tg-nrix">Database</td>
    <td class="tg-nrix">SQL</td>
    <td class="tg-nrix">sql</td>
    <td class="tg-nrix">http://java.sun.com/jsp/jstl/sql</td>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="2">Functions</td>
    <td class="tg-nrix">집합체 길이</td>
    <td class="tg-nrix" rowspan="2">fn</td>
    <td class="tg-nrix" rowspan="2">http://java.sun.com/jsp/jstl/functions</td>
  </tr>
  <tr>
    <td class="tg-nrix">문자열 처리</td>
  </tr>
</tbody>
</table>  
<br>

### 2. 다음은 JSTL의 기능 분류에 따른 taglib 지시자를 정리한 표이다. 다음에서 밑줄 부분을 완성하시오.
| 기능 분류                | taglib 지시자                                                             |
|----------------------|------------------------------------------------------------------------|
| Core                 | <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       |
| XML processing       | <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>        |
| Internationalization | <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>      |
| Database             | <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>      |
| Functions            | <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> |
  
<br>

### 3. 코어 태그 라이브러리에서 제어흐름을 처리하는 태그와 그 기능을 설명하시오.
1. **choose**: 태그 `<when>`과 `<otherwise>`로 구성되어 있는 여러 개의 조건 중에 하나만 선정하여 처리한다.
2. **when**: `<choose>` 태그의 서브태그로, 조건이 true이면 몸체를 실행한다.
3. **otherwise**: `<choose>` 태그의 서브태그로, 이전에 있는 태그 `<when>`에서 조건이 모두 false이면 태그 `<otherwise>` 몸체를 실행한다.
4. **forEach**: 다양한 콜렉션 유형에서 반복을 처리한다.
5. **forTokens**: 문자열을 구분자(delimeters)로 구분하여 토큰으로 나누며 반복 실행한다.
6. **if**: 조건이 true이면 몸체를 실행한다.  
<br>

### 4. 다음은 코어 라이브러리 태그를 이용하는 간단한 부분 소스이다. 다음 각각의 문제에서 브라우저 출력 결과를 기술하시오.  
(1)
```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="str1" value="none" />
<c:set var="str2" value="page" scope="page" />
<c:set var="str3" value="request" scope="request" />
<c:set var="str4" value="session" scope="session" />
<c:set var="str5" value="application" scope="application" />

<c:remove var="str1" />
\${str1} = ${str1} <br>
<c:remove var="str2" />
\${str2} = ${str2} <br>
<c:remove var="str3" scope="request" />
\${str3} = ${str3} <br>
<c:remove var="str4" scope="application" />
\{str4} = ${str4} <br>
<c:remove var="str5" scope="session" />
\${str5} = ${str5} <br>
```
결과:
```html
${str1} = 
${str2} = 
${str3} = 
${str4} = session
${str5} = application
```  

(2)  
```jsp
<c:set var="point" value="86"/>
<c:choose>
    <c:when test="${point >= 90}">
        A
    </c:when>
    <c:when test="${point >= 80}">
        B
    </c:when>
    <c:when test="${point >= 70}">
        C
    </c:when>
    <c:when test="${point >= 60}">
        D
    </c:when>
    <c:otherwise>
        F
    </c:otherwise>
</c:choose>
```
결과:
```html
B
```  

(3)
```jsp
<c:set var="tel" value="82-2-11-3487-8754" />
<c:forTokens var="tel" delims="-" items="${tel}" >
${tel}
</c:forTokens>
```  
결과:
```html
82 2 11 3487 8754
```
(4)  
```jsp
<c:out value="<hr>" escapeXml="true" />
```
결과:
```html
<hr>
```  
(5)  
```jsp
<c:out value="<hr>" escapeXml="true" />
```
결과:
```html
<hr>
```  
(6)
```jsp
<c:set var="calendar" value="<%= new java.util.HashMap() %>" />
<c:set target="${calendar}" property="jan" value="1월" />
<c:set target="${calendar}" property="feb" value="2월" />
<c:set target="${calendar}" property="mar" value="3월" />
${calendar.feb}
```  
결과:  
```html
2월
```
<br>

### 5. 다음은 함수 라이브러리를 이용하는 간단한 부분 소스이다. 다음 각각의 문제에서 브라우저 출력 결과를 기술하시오.
(1)  
```jsp
<c:set var="str1" value="javascript" />
${fn:substring (str1, 4, -1)} <br>
${fn:substringBefore(str1, "as")} <br>
${fn:substringAfter(str1, "sc")} <p>
```  
결과:
```jsp
script
jav
ript
```  

(2)
```jsp
<c:set var="str2" value="VBscript" />
${fn:trim("   신지애   ")}<br>
${fn:replace(str2, "VB", "java")} <br>
${fn:indexOf(str2, "B")} <p>
```  
결과:
```html
신지애
javascript
2
```  

(3)  
```jsp
<c:set var="str3" value="커스텀 태그" />
${fn:startWith(str3, "커스")} <br>
${fn:endsWith(str3, "태그")} <br>
${fn:contains(str3, "스템")} <p>
```  
결과:
```html
true
true
false
```  

(4)  
```jsp
${fn:escapeXml("<p>")} <br>
```  
결과:
```html
<p>
```