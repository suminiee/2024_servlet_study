package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz04")
public class UrlMappingQuiz04 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");//글자라는것을 브라우저에게 알려주는 역
		response.setCharacterEncoding("utf-8");//unicode로 인코딩 할 것
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>quiz03</title></head><body>");
		out.println("<ul>");
		for (int i = 1; i < 31; i++) {
			out.println("<li>" + i + "번째 리스트</li>");
		}
		out.println("</ul></body></html>");
	}
}
