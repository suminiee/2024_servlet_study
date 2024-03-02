package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingEx01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글깨짐 방지
		response.setContentType("text/plain");//글자라는것을 브라우저에게 알려주는 역
		response.setCharacterEncoding("utf-8");//unicode로 인코딩 할 것
		
		PrintWriter out = response.getWriter();
		
		out.println("제오페구케");

		Date now = new Date();
		out.println(now);
		
		//2024-02-29 오후 19:24:30 이런 식으로 나타내려면 Formatter를 사용해야함. -> 선언만 한거임! 
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd a HH:mm:ss");
		
		out.println(sdf.format(now));
	}
}
