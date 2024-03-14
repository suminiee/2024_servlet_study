package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/ex01")
public class Lesson04Ex01 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		//DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();//실질적인 DB연결 (꼭 넣기!!)
		
		//쿼리문 수행(insert)
		String insertQuery = "insert into 'patient_info'"
		+ "('patientId', 'created_at', 'modified_at', 'address', 'patient_name')"
		+ "values"
		+ "(1, '2024-03-14', '2024-03-14', '경기도 성남시', '강수민);";
		
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//쿼리문 수행(select) & 결과 출력
		String selectQuery = "select * from 'patient_info'";
		PrintWriter out = response.getWriter();
		
		try {
			ResultSet resultSet = ms.select(selectQuery);
			while (resultSet.next()) {//결과 행이 있는 동
				out.println(resultSet.getInt("patient_id"));
				out.println(resultSet.getString("address"));
				out.println(resultSet.getString("patient_name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결해제
		ms.disconnect();
		
	}
}
