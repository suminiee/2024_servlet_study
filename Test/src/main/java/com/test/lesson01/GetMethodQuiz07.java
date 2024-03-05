package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz07")
public class GetMethodQuiz07 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글로 깨지지 않고 출력되도록
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//RequestParam이 있다면 꺼냄 
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		int amount = Integer.valueOf(request.getParameter("amount")); 
		
		out.print("<html><head><title>주문 결과</title></head><body>");
		if (address.startsWith("서울시") == false) {
			out.print("배달 불가 지역입니다.<br>");
		} else if (card.startsWith("신한카드") == true){
			out.print("사용 불가 카드입니다.<br>");
		} else {
			out.print("<p>" + address + "<b> 배달 준비 중</b><br>");
			out.print("결제 금액: " + amount + "</p>");
		}
		
		out.print("</body></html>");
		
	}
}
