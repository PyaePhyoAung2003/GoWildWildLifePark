package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.content.Animals;
import com.dbconnector.DBManager;

public class animalscontentmanager {
	public int insert(Animals a) throws ClassNotFoundException, SQLException {
		 
		int result=-1;
	    //1. get connection
	    DBManager dbMgr=new DBManager();//create object or instantiate class
	    Connection conn=dbMgr.getConnection();
	    
	    //2.prepare statement
	    String sql="INSERT INTO `gowildwildlife`.`animals`\r\n"
	    		+ "(`name`,\r\n"
	    		+ "`gender`,\r\n"
	    		+ "`year`,\r\n"
	    		+ "`SID`,\r\n"
	    		+ "`DID`,\r\n"
	    		+ "`KID`,\r\n"
	    		+ "`EID`)\r\n"
	    		+ "VALUES\r\n"
	    		+ "(?,?,?,?,?,?,?)";
	    
	    PreparedStatement pstmt=conn.prepareStatement(sql);
	    
	    //first and second parameters inserted 1. course and a course text
	    pstmt.setString(1, a.getName());
	    pstmt.setString(2, a.getGender());
	    pstmt.setInt(3, a.getYear());
	    pstmt.setInt(4, a.getSID());
	    pstmt.setInt(5, a.getDID());
	    pstmt.setInt(6, a.getKID());
	    pstmt.setInt(7, a.getEID());
	    
	    
	    //3.execute statement
	    result = pstmt.executeUpdate();
	    conn.close();
	    return result;
	}
	public ArrayList<Animals> selectAllAnimalsByKeeperName() throws ClassNotFoundException, SQLException{
		ArrayList<Animals> AnimalList = new ArrayList<Animals>();
		Animals animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="select animals.idanimals , animals.name , animals.gender , animals.year ,\r\n"
				+ "keepers.idkeepers , keepers.name from animals left join keepers on animals.KID=keepers.idkeepers;";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animals(rs.getInt("idanimals"),
					rs.getString("name"),
					rs.getString("gender"),
					rs.getInt("year"),
					rs.getInt("idkeepers"),
					rs.getString("name"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
	public ArrayList<Animals> selectAllAnimals() throws ClassNotFoundException, SQLException{
		ArrayList<Animals> AnimalList = new ArrayList<Animals>();
		Animals animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="SELECT `animals`.`idanimals`,\r\n"
				+ "    `animals`.`name`,\r\n"
				+ "    `animals`.`gender`,\r\n"
				+ "    `animals`.`year`,\r\n"
				+ "    `animals`.`SID`,\r\n"
				+ "    `animals`.`DID`,\r\n"
				+ "    `animals`.`KID`,\r\n"
				+ "    `animals`.`EID`\r\n"
				+ "FROM `gowildwildlife`.`animals`";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animals(rs.getInt("idanimals"),
					 rs.getString("name"),
					 rs.getString("gender"),
					 rs.getInt("year"),
					 rs.getInt("SID"),
					 rs.getInt("DID"),
					 rs.getInt("KID"),
					 rs.getInt("EID"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
	public ArrayList<Animals> selectTotalAnimalCount() throws ClassNotFoundException, SQLException{
		ArrayList<Animals> AnimalList = new ArrayList<Animals>();
		Animals animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="select keepers.name , count(animals.idanimals ) as totalanimal \r\n"
				+ "from animals left join keepers on animals.KID =keepers.idkeepers group by KID ;";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animals(rs.getString("name"),
					rs.getInt("totalanimal"));
			AnimalList.add(animal);
		}
		conn.close();
		return AnimalList;
	}
}