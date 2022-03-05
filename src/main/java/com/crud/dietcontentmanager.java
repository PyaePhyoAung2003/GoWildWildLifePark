package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.content.diet;
import com.dbconnector.DBManager;

public class dietcontentmanager{
	public int insert(diet c) throws ClassNotFoundException, SQLException {
		int result=-1;
		//1. get connection
		DBManager dbMgr=new DBManager();//create object or instantiate class 
		Connection conn=dbMgr.getConnection();
		
		//2.prepare statement
		String sql="INSERT INTO `gowildwildlife`.`diet`\r\n"
				+ "(`type`,\r\n"
				+ "`number_of_ feeds`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?)";
				
				
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		//first and second parameters inserted 1. course name and course text
		pstmt.setString(1, c.getType());
		pstmt.setInt(2, c.getNOF());
		
		
		result=pstmt.executeUpdate();
		conn.close();
		
		return result;
		 
		
	}
}

