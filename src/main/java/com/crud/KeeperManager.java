package com.crud;
import java.util.*;
import java.sql.*;
import com.content.*;
import com.dbconnector.*;
public class KeeperManager {
public int insert(Keeper c) throws ClassNotFoundException, SQLException {
	 
	int result=-1;
    //1. get connection
    DBManager dbMgr=new DBManager();//create object or instantiate class
    Connection conn=dbMgr.getConnection();
    
    //2.prepare statement
    String sql="INSERT INTO `gowildwildlife`.`keepers`\r\n"
    		+ "(`name`,\r\n"
    		+ "`date_ of_ birth`,\r\n"
    		+ "`keeper_email`,\r\n"
    		+ "`keeper_phone`,\r\n"
    		+ "`rank`)\r\n"
    		+ "VALUES\r\n"
    		+ " (?,?,?,?,?)";
    
    PreparedStatement pstmt=conn.prepareStatement(sql);
    
    //first and second parameters inserted 1. course and a course text
    pstmt.setString(1, c.getKeeperName());
    pstmt.setString(2, c.getKeeperDOB());
    pstmt.setString(3, c.getKeeperEmail());
    pstmt.setString(4, c.getKeeperPhone());
    pstmt.setString(5, c.getKeeperType());
    
    
    //3.execute statement
    result = pstmt.executeUpdate();
    conn.close();
    return result;
}
	
	
}
