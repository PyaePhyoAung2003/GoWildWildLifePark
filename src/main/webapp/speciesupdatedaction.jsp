<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ page import="com.crud.*" %>
 <%@ page import="com.dbconnector.*" %>
 <%@ page import="com.content.*" %>
 <%@ page import="java.sql.*" %>
 <%@ page import="java.util.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int speciesID =Integer.valueOf(request.getParameter("speciesID"));
String type=request.getParameter("type");
String group=request.getParameter("group" );
String lifestyle=request.getParameter("lifestyle");
String conservationstatus=request.getParameter("conservationstatus");
speciescontentmanager scm = new speciescontentmanager();

Species species = new Species(speciesID,type,group,lifestyle,conservationstatus);
int rowsAffected;
try {

    rowsAffected = scm.update(species);
    out.println("No of rows affected - " + rowsAffected);

}catch (SQLException e){
    out.println(e.getMessage());

}
%>
</body>
</html>