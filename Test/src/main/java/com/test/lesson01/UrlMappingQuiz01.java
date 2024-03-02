package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글깨짐 방지
		response.setContentType("text/plain");//글자라는것을 브라우저에게 알려주는 역
		response.setCharacterEncoding("utf-8");//unicode로 인코딩 할 것
		
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일");
		
		out.println("오늘의 날짜는 " + sdf.format(now));
	}
}
