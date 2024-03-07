<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz01</title>
</head>
<body>
	<%!
		int sum = 0;
	
		public int add(int n) {
			sum = 0;
			for(int i = 1; i < n+1; i++){
				sum += i;
			}
			return sum;
		}
	%>
	
	1부터 50까지의 합은 <%= add(50) %> 입니다.
	<br>
	<%
		double average = 0;
		int[] scores = {81, 90, 100, 95, 80};
		sum = 0;
		for(int i = 0; i < 5; i++){
			sum += scores[i];
		}
		average = (double)sum / 5;
	%>
	
	평균 점수는 <%= average %>점 입니다. 
	<br>
	<%
		int score = 0;
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		for (int i = 0; i < scoreList.size(); i++) {
			if (scoreList.get(i).equals("O")) {
				score += 10;
			}
		}
	%>
	
	채점 결과는 <%= score %>점 입니다.
	<br>
	
	<%
		String OriginBirthDay = "20010820";
		String birthDay = OriginBirthDay.substring(0, 4);
		int birth = Integer.valueOf(birthDay);
		birth = 2024-birth;
	%>
	<%= OriginBirthDay %> 의 나이는 <%= birth %>세 입니다.

</body>
</html>