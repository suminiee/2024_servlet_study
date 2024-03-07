<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex01</title>
</head>
<body>
	<!-- html의 주석 : 소스보기에서 보임 -->
	<%-- jsp 주석 : 소스보기에서 보이지 않음 --%>
	
	<% 
		// java 문법 시작
		// scriptlet
		
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
	%>
	
	<b>합계:</b>	
	<input type="text" value="<%= sum %>">
	
	<%!
		//선언문 => 클래스 같은 느낌(정의를 하는 용도로 사용, 로직이 바로 들어감)
		
		//field
		private int num = 100;
		
		//method
		public String getHelloWorld() {
			return "HelloWorld";
		}
	%>
	
	<br>
	<%= num +200 %>
	<br>
	
	<%= getHelloWorld() %>
</body>
</html>