package com.dbconnector;
import java.sql.*;
public class DBManager {
   public Connection getConnection() throws SQLException, ClassNotFoundException{
	  Connection connection = null;
	  //Step 1: DriverManager class to acquire JDBC connection
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  //Step 2: DB Connection URL with Server, Port, DB Name, SSL Connection type and Server
	  String dbUrl ="jdbc:mysql://localhost:3306/gowildwildlife?useSSL=true&serverTimezone=UTC";
	  String dbUser = "root";
	  String dbPass = "Admin1234";
	  connection = DriverManager.getConnection(dbUrl,dbUser,dbPass);
	  return connection;
  }
}
