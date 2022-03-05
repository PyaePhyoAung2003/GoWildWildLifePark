package com.dbconnector;
import java.sql.*;
import com.crud.*;
import com.content.*;
import java.util.*;
public class DBManagerTest {
  public static void main(String[] args) {
	  
	  DBManager dbManager = new DBManager();
	  try {
		  dbManager.getConnection();
		  System.out.println("Connection Successfully");
		  Keeper c = new Keeper(null, null, null,null,null);
		  c.setKeeperName("Pyae Phyo Aung");
		  c.setKeeperDOB("2022-2-17");
		  c.setKeeperEmail("pa731338@gmail.com");
		  c.setKeeperPhone("09401140922");
		  c.setKeeperType("Senior");
		  KeeperManager kcm= new KeeperManager();
		  int rowInserted = kcm.insert(c);
		  if(rowInserted==1) {
			  System.out.print("Sucessfully inserted");
		  }
		  
	  }catch (ClassNotFoundException|SQLException e) {
		  //TODO Auto-generated catch block
		    e.printStackTrace();
	  }
  }
}
