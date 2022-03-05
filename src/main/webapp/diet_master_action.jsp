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
<title>diet_master_action</title>
</head>
<body>
<%
String D_Type = request.getParameter("diettype");
int D_NOF = Integer.valueOf(request.getParameter("number_of_feeds"));
out.print(D_Type);
out.print(D_NOF);
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Successfully");
	diet c= new diet(D_Type, D_NOF);
	dietcontentmanager d=new dietcontentmanager();
	int rowInserted = d.insert(c);
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