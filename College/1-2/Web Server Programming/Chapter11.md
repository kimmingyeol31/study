### 1. 자바빈즈를 이용한 JDBC 프로그래밍 방식의 장점을 설명하시오.

자바빈즈를 이용한 JDBC 프로그래밍은 자바빈즈의 목적을 살려 데이터베이스 연동 자바빈즈에서 데이터베이스 연결 및 처리 작업을 하고 그 결과인 자료 출력은 JSP 프로그램에서 수행하는 프로그램 방식이다. 이러한 개발 방식은 비즈니스 로직 처리와 프리젠테이션 처리를 분리하여 개발할 수 있어 보다 발전된 방식이다.  
<br>

### 2. 다음은 자바빈즈 univ.StudentDatabase를 이용한 JDBC 프로그래밍 방식으로 프로그래밍된 selectstudentbean.java 프로그래밍의 일부이다. 밑줄 부분을 완성하세요.

```jsp
<jsp:useBean id="stdtdb" class="univ.StudentDatabase" scope="page" />

ArrayList<StudentEntity> list = stdtdb.getStudentList();
int counter = list.size();
```  
<br>

### 3. DBCP를 이용한 데이터베이스 연동 자바빈즈 프로그램을 이용한 JDBC 프로그래밍에 대한 질문이다. 다음 각각의 질문에 답하시오.

(1) 일반적으로 설정 파일 2개는 무엇인가?  

`server.xml`과 `web.xml`  

(2) 다음과 같이 이용할 커넥션 풀의 이용 정보 리소스를 추가하는 설정 파일은 무엇인가?   
```xml
<Context docBase="ch11" path="/ch11" reloadable="true" source="org.eclipse.jst.jee.server:ch11">
<Resource name="jdbc/mysql" auth="Container" type="javax.sql.DataSource" maxActive="100" maxIdle="30" maxWait="10000" username="root" password="" driverClassName="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/univdb?autoReconnect=true"/>
</Context>
</host>
```
server.xml  

(3) 만일 데이터베이스 연결정보가 다음과 같다면 위와 같은 리소스 추가 설정에서 무엇을 수정해야 하는가?  
```
데이터베이스 사용자 계정 이름: sheom
데이터베이스 사용자 계정 암호: kong1278
접속 데이터베이스 이름: college
```  
`username="sheom" password="kong1278" url="jdbc:mysql://localhost:3306/college?autoReconnect=true"`  

(4) 등록한 리소스를 찾는 방법으로 다음을 이용한다면 (2)의 resource 태그에서 무엇을 수정해야 하는가?  
```jsp
<?xml version="1.0" encoding="UTF-8"?>
<web-app ...>

<!-- =============== DBCP =============== -->
<description>MySQL Test App</description>
<resource-ref>
<description>DB Connection</description>
<res-ref-name>jdbc/mysql</res-ref-name>
<res-type>javax.sql.DataSource</res-type>
<res-auth>Container</res-type>
</resource-ref>
</web-app>
```  
<br>

### 4. 11장에서 구현한 게시판 프로그램에 대한 질문이다. 다음 각각의 질문에 답하시오.

(1) 11장에서 구현한 게시판보다 발전된 게시판을 구현하기 위한 테이블 borad를 다시 정의하시오.  

\-  

(2) 게시목록의 표시에서 가장 최근에 게시된 게시물을 먼저 보이려면 무엇을 수정해야 하는가?  

BoardDBCP.java
```java
⋯
String SQL = "select * from board order by regdate desc";
…
```  

(3) 다음 밑줄 부분을 완성하시오. 

자바빈즈 BoardEntity은 게시 테이블 board의 한 행의 정보를 저장하는 자바빈즈로, JSP 프로그램과 BoardDBCP 사이에 정보 전송 매개변수 역할을 수행한다. 자바빈즈 BoardDBCP는 DBCP를 이용하여 실제 데이터베이스에 연결하여 등록, 수정, 삭제의 SQL 수행 작업을 실행한다.  

(4) 게시판 테이블 board의 데이터베이스 연동을 위한 자바빈즈 프로그램의 생성자와 메소드에 대한 설명이다. 다음 표에서 빈 부분을 완성하시오.  

| 반환 유형              | 메소드 이름                     | 기능                                                                  |
|------------------------|---------------------------------|-----------------------------------------------------------------------|
| 생성자                 | BoardDBCP()                     | 데이터소스를 이용하여 커넥션 풀을 생성                                |
| void                   | connect()                       | 데이터소스의 커넥션 풀에서 Connection 객체를 얻어 소속변수 con에 저장 |
| void                   | disconnect()                    | 데이터베이스 관련 객체의 연결을 해제                                  |
| ArrayList<BoardEntity> | getBoardList()                  | 테이블 board의 모든 레코드를 ArrayList에 저장하여 반환                |
| BoardEntity            | getBoard(int id)                | 인자 id가 주 키인 레코드를 검색하여 반환                              |
| boolean                | insertDB(BoardEntity board)     | 인자 board로 테이블 board 수정                                        |
| boolean                | updateDB(BoardEntity board)     | 인자 board로 테이블 board 수정                                        |
| boolean                | deleteDB(int id)                | 인자 id가 주 키인 레코드를 검색하여 삭제                              |
| boolean                | isPasswd(int id, String passwd) | 인자 id와 passwd가 테이블 board에서 일치하는지 검사                   |  

(5) 게시판 테이블 board의 데이터베이스 연동을 위한 자바빈즈 프로그램에서 이용되는 SQL 문장을 정리한 표이다. 다음 표에서 빈 부분을 완성하시오.  

| 메소드 이름                     | 이용 SQL 문장                                                   | 기능                         |
|---------------------------------|-----------------------------------------------------------------|------------------------------|
| getBoardList()                  | select * from board                                             | 모든 행 검색                 |
| getBoard(int id)                | select * from board where id = ?                                | 지정한 id 행을 검색          |
| insertDB(BoardEntity board)     | insert into board values(0, ?, ?, ?, ?, sysdate(), ?)           | 지정한 행으로 삽입           |
| updateDB(BoardEntity board)     | update board set name=?, title=?, email=?, content=? where id=? | 지정한 행을 수정             |
| deleteDB(int id)                | delete from board where id = ?                                  | 지정한 id 행을 삭제          |
| isPasswd(int id, String passwd) | select passwd from board where id = ?                           | 지정한 id 행의 passwd를 검색 |