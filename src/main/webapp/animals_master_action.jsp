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
String name = request.getParameter("animalsname");
String gender = request.getParameter("gender");
int year = Integer.valueOf (request.getParameter("year"));
int SID = Integer.valueOf (request.getParameter("SID"));
int DID = Integer.valueOf (request.getParameter("DID"));
int KID = Integer.valueOf (request.getParameter("KID"));
int EID = Integer.valueOf (request.getParameter("EID"));
out.print (name);
out.print (gender);
out.print (year);
out.print (SID);
out.print (DID);
out.print (KID);
out.print (EID);
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connectio Successfully");
	Animals c= new Animals(name, gender, year, SID, DID, KID, EID);
	animalscontentmanager acm = new animalscontentmanager();
	int rowInserted = acm.insert(c);
	if(rowInserted==1){
		out.print("Successfully insertd");
	}

}
catch (SQLException e) {
	e.printStackTrace();
}

%>
</body>
</html>