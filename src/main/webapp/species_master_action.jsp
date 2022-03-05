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
<title>Insert title here</title>
</head>
<body>
<% 
String S_type= request.getParameter("type");
String S_group = request.getParameter("group");
String S_lifestyle = request.getParameter("lifestyle");
String S_conservationstatus= request.getParameter("conservationstatus");
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Successfully");
	Species s= new Species(S_type, S_group, S_lifestyle , S_conservationstatus);
	speciescontentmanager e=new speciescontentmanager();
	int rowInserted = e.insert(s);
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