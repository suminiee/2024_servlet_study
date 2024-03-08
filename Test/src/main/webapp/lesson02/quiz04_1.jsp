<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환</title>
<!--bootstrap CDN Link -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

</head>
<body>
	<%
		String length = request.getParameter("length");
		Integer len = Integer.valueOf(length);
		String[] unitArr = request.getParameterValues("unit");
	%>
	<div class="container">
		<h1>길이 변환 결과</h1>
		<h3><%= len %>cm</h3>
		<hr>
		<%		
			double num = 0; 
				if (unitArr != null) {
					for (String unit : unitArr) {
						num = 0;
						if (unit.equals("inch")) {
							num = len * 0.393701;
							out.print(num + "in<br>");
						} else if (unit.equals("yard")) {
							num = len * 0.0109361;
							out.print(num + "yd<br>");
						} else if (unit.equals("feet")) {
							num = len * 0.0328084;
							out.print(num + "ft<br>");
						} else if (unit.equals("meter")) {
							num = len * 0.01;
							out.print(num + "m<br>");
						}
					}
					
					
				}
		%>
	</div>
</body>
</html>