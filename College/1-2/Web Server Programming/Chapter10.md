### 1. JDBC 드라이버의 유형과 특징을 설명하시오.

| JDBC 유형                 | 특징                                                                                                                                                                                 |
|---------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| JDBC-ODBC 브릿지 드라이버 | 데이터베이스에 연결할 때 ODBC를 호출하는 역할만 수행한다.                                                                                                                            |
| Native-API 드라이버       | JDBC에서 데이터베이스의 API를 직접 호출하는 방식으로 작동한다. 자바 코드와 C/C++ 코드 일부를 이용한다.                                                                               |
| Net-Protocol 드라이버     | JDBC와 데이터베이스 사이에 미들웨어를 설치하여 처리하는 방식으로 작동한다. JDBC 호출을 데이터베이스에 독립적인 프로토콜로 이용하며 데이터베이스와 통신한다.                          |
| Native-Protocol 드라이버  | JDBC 호출을 데이터베이스에 직접 전달하는 방식으로 작동한다. 이에 따라 데이터베이스 회사마다 드라이버를 각자 제공해야 하고, 데이터베이스가 바뀌면 다시 전용 드라이버를 설치해야 한다. |
<br>

### 2. JDBC 프로그래밍 절차 6단계를 설명하시오.

1. JDBC 드라이버 로드
2. 데이터베이스 연결
3. SQL을 위한 Statement 객체 생성
4. SQL 문장 실행
5. 질의 결과 ResultSet 처리
6. JDBC 객체 연결 해제  
<br>

### 3. 다음은 JDBC 프로그래밍에 이용되는 기본 클래스와 인터페이스의 설명에 이용되는 메소드를 나타낸 표이다. 다음 표의 빈 부분을 채우시오.

<table class="tg">
<thead>
  <tr>
    <th class="tg-uzvj">패키지</th>
    <th class="tg-uzvj">인터페이스(클래스)</th>
    <th class="tg-uzvj">클래스 용도</th>
    <th class="tg-uzvj">이용 메소드</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-9wq8">java.lang</td>
    <td class="tg-9wq8">클래스<br>Class</td>
    <td class="tg-9wq8">지정된 JDBC 드라이버를 실행시간 동안 메모리에 로드</td>
    <td class="tg-9wq8">forName();</td>
  </tr>
  <tr>
    <td class="tg-9wq8" rowspan="4">java.sql</td>
    <td class="tg-9wq8">클래스<br>DriverManager</td>
    <td class="tg-9wq8">여러 JDBC 드라이버를 관리하는 클래스로, 데이터베이스를 접속하여 연결 객체 반환</td>
    <td class="tg-9wq8">getConnection();</td>
  </tr>
  <tr>
    <td class="tg-9wq8">인터페이스<br>Connection</td>
    <td class="tg-9wq8">특정한 데이터베이스 연결 상태를 표현하는 클래스로, 질의할 문장 객체를 반환</td>
    <td class="tg-9wq8">createStatement();<br>close();</td>
  </tr>
  <tr>
    <td class="tg-9wq8">인터페이스<br>Statement</td>
    <td class="tg-9wq8">데이터베이스에 SQL 질의 문장을 질의하여 그 결과인 결과집합 객체를 반환</td>
    <td class="tg-9wq8">executeQuery();<br>close()</td>
  </tr>
  <tr>
    <td class="tg-9wq8">인터페이스<br>ResultSet</td>
    <td class="tg-9wq8">질의 결과의 자료를 저장하며 테이블 구조</td>
    <td class="tg-9wq8">next();<br>getString();<br>getInt();<br>close();</td>
  </tr>
</tbody>
</table>
<br>

### 4. JDBC는 SQL 문장을 처리하는 Statement, PreparedStatement, CallableStatement 3개의 인터페이스를 제공한다. 다음 표에서 각각은 무슨 인터페이스를 설명하고 있는가?

| 질의 문장을 위한 인터페이스 종류 | 특징                                                                                                                                                                                                                                                          |
|----------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Statement                        | Connection 객체에서 createStatement() 메소드를 호출로 생성. 단순한 SQL 문장을 보낼 때 사용되며 성능이나 효율성에서 가장 낮음                                                                                                                                  |
| PreparedStatement                | Connection 객체에서 prepareStatement() 메소드를 호출로 생성, 주로 PreparedStatement 클래스는 한번 사용되고 마는 SQL문이 아니라 여러번 반복해서 사용되는 SQL을 다룰 때 편리. 컴파일할 때 에러를 체크하기 때문에 좀 더 효율적이며 처리하는 속도 역시 훨씬 빠름. |
| CallableStatement                | Connection 객체에서 prepareCall 메소드의 호출로 생성. CallableStatement 객체는 저장 함수를 호출할 때 사용.                                                                                                                                                    |  
<br>

### 5. 데이터베이스 univdb에 다음 테이블을 생성하고 JSP 프로그래밍을 작성하려고 한다. 다음 각각의 물음에 답하시오.

1. 다음 DDL로 테이블 department를 생성하시오.  
   ```sql
   create table department(
       departid int not null auto_increment,
       name varchar(30) not null ,
       numstudent int not null ,
       homepage varchar(30) null ,
       primary key (departid)
   );
   ```  
2. 다음 SQL 문장을 참고로 테이블 department에 적당한 레코드를 5개 이상 삽입하시오.
   ```sql
   insert into department (name, numstudent, homepage) values ('전산학과', 80,'www.computer.ac.kr');
   ```  
3. 다음은 테이블 department에서 전체 레코드를 조회하여 출력하는 프로그램이다. 다음 브라우저의 결과를 참고로 소스의 빈 부분을 완성하시오.
   ```jsp
   <%@ page contentType="text/html;charset=UTF-8" language="java" %>
   <html>
   <head>
       <title>데이터베이스 예제 : 테이블 department 조회</title>
   </head>
   <body>
       <%@ page  import="java.sql.*" %>
   
       <h2>테이블 department 조회 프로그램</h2>
       <hr><center>
       <h2>학과정보 조회</h2>
   
       <%
           Connection con = null;
           Statement stmt = null;
           String driverName = "com.mysql.jdbc.Driver";
           String dbURL = "jdbc:mysql://localhost:3306/univdb";
   
           try {
               Class.forName(driverName);
               con = DriverManager.getConnection(dbURL, "root", "");
               stmt = con.createStatement();
               ResultSet result = stmt.executeQuery("select * from department");
       %>
           <table width="100%" border="2" cellpadding="1">
               <tr>
                   <td align="center"><b>학과번호</b></td>
                   <td align="center"><b>학과이름</b></td>
                   <td align="center"><b>정원</b></td>
                   <td align="center"><b>홈페이지</b></td>
               </tr>
           <%
               while (result.next()) {
           %>
           <tr>
               <td align="center"><%= result.getInt(1)%></td>
               <td align="center"><%= result.getString(2)%></td>
               <td align="center"><%= result.getInt(3)%></td>
               <td align="center"><%= result.getString(4)%></td>
           </tr>
       <%
               }
               result.close();
           }
           catch (Exception e) {
               out.println("MySql 데이터베이스 univdb의 department 조회에 문제가 있습니다.<hr>");
               out.println(e.toString());
               e.printStackTrace();
           }
           finally {
               if(stmt != null) stmt.close();
               if(con != null) con.close();
           }
       %>
           </table>
       </center>
   </body>
   </html>
   ```  
<br>

### 6. 다음은 ResultSetMetaData의 객체를 얻기 위해 테이블 student를 모두 조회하는 SQL 문장으로 ResultSet 객체를 반환하여 저장하는 모듈이다. 또한 ResultSetMetaData의 객체를 이용하여 테이블 student의 칼럼 수를 변수 nCount에 저장하고자 한다. 다음 소스에서 빈 부분을 완성하시오.

```jsp
ResultSet result = stmt.executeQuery("select * from student");
ResultSetMetaData rsmd = result.getMetaData();
int cCount = rsmd.getColumnCount();
```  
<br>

### 7. 다음은 DBCP를 이용해 데이터베이스에 연결하는 모듈의 소스이다. 다음 소스의 빈 부분을 완성하시오.

```jsp
<%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>

Context initCtx = new InitialContext();
Context env = (Context) initCtx.lookup("java:comp/env/");
DataSource ds = (DataSource) env.lookup("jdbc/mysql");
con = ds.getConnection();
```