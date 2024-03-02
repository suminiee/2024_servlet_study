package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//WebServlet("url")을 사용하면 web.xml에 추가해 줄 필요가 없어짐.
@WebServlet("/lesson01/ex02")
public class UrlMappingEx02 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");//글자라는것을 브라우저에게 알려주는 역
		response.setCharacterEncoding("utf-8");//unicode로 인코딩 할 것
		
		PrintWriter out = response.getWriter();
		
		// 서블릿 : 자바 코드 안에 + html
		// 1+2+3+4+5..+10
		
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		
		out.println("<html><head><title>합계</title></head><body>");
		out.println("합계 : <b>" + sum + "</b>");
		out.println("</body></html>");
		
		
		
	}
}
