package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz05")
public class GetMethodQuiz05 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글로 깨지지 않고 출력되도록
		response.setContentType("text/html");//그냥 순수한 글자
		response.setCharacterEncoding("utf-8");
		
		//RequestParam이 있다면 꺼냄 
		int num = Integer.valueOf(request.getParameter("number")); 
	
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>quiz05</title></head><body>");
		out.println("<ul>");
		for (int i = 1; i < 10; i++) {
			out.println("<li>" + num + "X" + i + "= " + num*i + "</li>");
		}
		out.println("</ul></body></html>");
		
	}
}
