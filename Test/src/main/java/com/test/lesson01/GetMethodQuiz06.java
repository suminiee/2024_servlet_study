package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz06")
public class GetMethodQuiz06 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글로 깨지지 않고 출력되도록
		response.setContentType("text/json");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//RequestParam이 있다면 꺼냄 
		int num1 = Integer.valueOf(request.getParameter("number1")); 
		int num2 = Integer.valueOf(request.getParameter("number2")); 
		int sum = num1 + num2;
		int sub = num1 - num2;
	
		
		
		out.print("{");
		out.print("\"addition\" : " + sum + ", ");
		out.print("\"subtraction\" : " + sub + ", ");
		out.print("\"multiplication\" : " + num1*num2 + ", ");
		out.print("\"division\" : " + num1/num2 + "}");
		
		
		
		
	}
}
