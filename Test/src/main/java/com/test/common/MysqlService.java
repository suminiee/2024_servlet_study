package com.test.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlService {
	//field
	private static MysqlService mysqlService;
	
	private static final String URL = "jdbc:mysql://localhost:3306/20240314";
	private static final String ID = "root";
	private static final String PASSWORD = "rkdTnals1!";
	
	private Connection conn;
	private Statement statement;
	private ResultSet res;
	
	//method
	//singleton 패턴 : MysqlService 객체가 단 하나만 생성되도록 하는
	// DB 연결을 여러 객체에서 하지 않도록
	public static MysqlService getInstance() {
		if (mysqlService == null) {
			mysqlService = new MysqlService();
		}
		return mysqlService;
	}
	
	//DB연결
	public void connect() {
		
		try {
			//1. 드라이버 메모리에 로딩
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			//2. DB 연결
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			
			//3. statement : DB 연결해서 쿼리 실행하기 위한 준비
			statement = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//DB연결 해제
	public void disconnect() {
		try {
			statement.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//CRUD
	//R : select
	public ResultSet select(String query) throws SQLException {
		res = statement.executeQuery(query);
		return res;
	}
	//CUD: insert, update, delete
	public void update(String query) throws SQLException {
		statement.executeUpdate(query);
	}
}
