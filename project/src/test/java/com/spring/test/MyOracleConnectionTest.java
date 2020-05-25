package com.spring.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyOracleConnectionTest {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@study.cuwaxu4rsqmq.ap-northeast-2.rds.amazonaws.com:1521:SHOP";
	private static final String ID = "jihun";
	private static final String PW = "fp74y4cp";
	
	
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try (Connection conn = DriverManager.getConnection(URL, ID, PW)){
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
}
