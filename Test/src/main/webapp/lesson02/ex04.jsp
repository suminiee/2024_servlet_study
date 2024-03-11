<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("korean", 85);
		scoreMap.put("english", 72);
		scoreMap.put("math", 90);
		scoreMap.put("science", 100);
	%>
	
	<table border="1">
		<%
			Iterator<String> iter = scoreMap.keySet().iterator();
			while (iter.hasNext()) {
				String subject = iter.next();//과목명
				
		%>
		<tr>
			<th>
			<%-- <%= subject %> --%>
				<%
					if (subject.equals("korean")) {
						out.print("국어");
					} else if (subject.equals("english")) {
						out.print("영어");
					} else if (subject.equals("math")) {
						out.print("수학");
					} else if (subject.equals("science")) {
						out.print("과학");
					} else {
						out.print(subject);
					}
				%>
			</th>
			<!-- Map에서는 index번호가 아니라 key값을 이용하여 get을 통해 value값을 가져오게 됨. -->
			<td><%= scoreMap.get(subject) %></td>
		</tr>
		
		<%
			}
		%>
	</table>
</body>
</html>