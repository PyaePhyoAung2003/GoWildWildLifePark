<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.content.*" %>
<%@ page import="com.crud.*" %>
<%@ page import="com.dbconnector.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>enclosures_master_action</title>
</head>
<body>
<% 
String E_Type = request.getParameter("enclosuretype");
String  E_Location= request.getParameter("enclosurelocation");
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Successfully");
	enclosures c= new enclosures(E_Type,E_Location);
	enclosurescontentmanager e=new enclosurescontentmanager();
	int rowInserted = e.insert(c);
	if(rowInserted==1){
		out.print("Successfully inserted");
	}

}
catch (SQLException e) {
	e.printStackTrace();
}

%>
</body>
</html>