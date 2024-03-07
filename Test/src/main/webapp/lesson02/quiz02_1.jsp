<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz02_1</title>
</head>
<body>
	<%
		if (request.getParameter("type").equals("time")) {
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd a HH:mm:ss");
		}
	%>
</body>ß
</html>