package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex03")
public class GetMethodEx03 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글로 깨지지 않고 출력되도록
		response.setContentType("text/json");//그냥 순수한 글자
		response.setCharacterEncoding("utf-8");
		
		//RequestParam이 있다면 꺼냄 
		String userId = request.getParameter("user_id");
		String username = request.getParameter("name");
		int skdl = Integer.valueOf(request.getParameter("age")); 
		
		PrintWriter out = response.getWriter();
		
//		out.println("유저 아이디 : " + userId);
//		out.println("유저 이름 : " + username);
//		out.println("나이 : " + skdl);
		
//		JSON(Javascript Object Notation)으로 response 구성
//		{"user_id" : "suminiee", "name" : "강수민", "age" : 22 }
		
		out.print("{\"user_id\":\"" + userId + "\", \"name\":\"" + username + "\" , \"age\" : " + skdl + "}");
		
		
		
		
	}
}
