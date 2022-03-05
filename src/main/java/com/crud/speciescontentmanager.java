package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.content.Species;
import com.content.enclosures;
import com.dbconnector.DBManager;

public class speciescontentmanager {
	public int insert(Species s) throws ClassNotFoundException, SQLException {
		 
		int result=-1;
	    //1. get connection
	    DBManager dbMgr=new DBManager();//create object or instantiate class
	    Connection conn=dbMgr.getConnection();
	    
	    //2.prepare statement
	    String sql="INSERT INTO `gowildwildlife`.`species`\r\n"
	    		+ "(`type`,\r\n"
	    		+ "`group`,\r\n"
	    		+ "`lifestyle`,\r\n"
	    		+ "`conservationstatus`)\r\n"
	    		+ "VALUES\r\n"
	    		+ "(?,?,?,?)";
	    
	    PreparedStatement pstmt=conn.prepareStatement(sql);
	    
	    //first and second parameters inserted 1. course and a course text
	    pstmt.setString(1, s.getType());
	    pstmt.setString(2, s.getGroup());
	    pstmt.setString(3, s.getLifestlye());
	    pstmt.setString(4, s.getConservationstatus());

	    //3.execute statement
	    result = pstmt.executeUpdate();
	    conn.close();
	    return result;
	}
	public ArrayList<Species> selectAll() throws ClassNotFoundException, SQLException{
		ArrayList<Species> species=new ArrayList<Species>();
		
		Species S;
	//1.get connection
		DBManager dbMgr=new DBManager();//create object or instantiate class 
		Connection conn=dbMgr.getConnection();
		
		String sql= "SELECT `species`.`idspecies`,\r\n"
				+ "    `species`.`type`,\r\n"
				+ "    `species`.`group`,\r\n"
				+ "    `species`.`lifestyle`,\r\n"
				+ "    `species`.`conservationstatus`\r\n"
				+ "FROM `gowildwildlife`.`species`;";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while (rs.next())
		{
			S=new Species(rs.getInt("idspecies"),
					rs.getString("type"),
					rs.getString("group"),
		            rs.getString("lifestyle"),
		            rs.getString("conservationstatus"));
			
			species.add(S);
		}
		conn.close();
		
		return species;
	}
	public Species getById(int id) throws ClassNotFoundException, SQLException {
		//1.get connection
		Species content= null;
			DBManager dbMgr=new DBManager();//create object or instantiate class 
			Connection conn=dbMgr.getConnection();
			String sql="SELECT `species`.`idspecies`,\r\n"
					+ "    `species`.`type`,\r\n"
					+ "    `species`.`group`,\r\n"
					+ "    `species`.`lifestyle`,\r\n"
					+ "    `species`.`conservationstatus`\r\n"
					+ "FROM `gowildwildlife`.`species`WHERE `idspecies` = ?;";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			while (rs.next())
			{
				content=new Species(rs.getInt("idspecies"),
						rs.getString("type"),
						rs.getString("group"),
						rs.getString("lifestyle"),
						rs.getString("conservationstatus"));
			}
			conn.close();
			return content ;
	}
	public int update(Species s) throws ClassNotFoundException, SQLException{
		
		int result=-1;
		
		//1. get connection
		DBManager dbMgr=new DBManager();
		Connection conn=dbMgr.getConnection();
		
		//2.prepare statement
		
		String sql = "UPDATE `gowildwildlife`.`species`\r\n"
				+ "SET\r\n"
				+ "`type` = ?,\r\n"
				+ "`group` = ?,\r\n"
				+ "`lifestyle` = ?,\r\n"
				+ "`conservationstatus` = ?\r\n"
				+ "WHERE `idspecies` = ?;";


		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		// first and second parameter inserted 1. course name and course text
		
		pstmt.setInt(5, s.getSpeciesID());
		pstmt.setString(1,s.getType());
		pstmt.setString(2,s.getGroup());
		pstmt.setString(3,s.getLifestlye());
		pstmt.setString(4,s.getConservationstatus());
		
		//3.execute statement
		
		result = pstmt.executeUpdate();
		
		return result;
	 
	}
	public int delete (int id) throws SQLException, ClassNotFoundException {
	    int rowsDeleted = -1;
	    String sql ;
		//1. get Connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//2. prepare the statement 
	    sql = "DELETE FROM `gowildwildlife`.`species`\r\n"
	    		+ "WHERE `idspecies` = ?;";
	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    //First parameter is the course id of the course entity
	    pstmt.setInt(1, id);

	    rowsDeleted = pstmt.executeUpdate();
	    return rowsDeleted;
	}

}
