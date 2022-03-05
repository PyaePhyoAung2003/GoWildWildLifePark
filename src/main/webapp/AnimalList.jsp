<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.crud.*" %>
 <%@ page import="com.dbconnector.*" %>
 <%@ page import="com.content.*" %>
 <%@ page import="java.sql.*" %>
 <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1 style ="text-align:center;">Animals List</h1>
<style>
table,th, td {
border: 2px solid skyblue;
}
</style>
</head>
<body>
<%
DBManager dbManager = new DBManager();
try {
	dbManager.getConnection();
	//Select
	animalscontentmanager acm = new animalscontentmanager();
	ArrayList<Animals> animalsList = acm.selectAllAnimals();
	
%>
<table style="width:100%">
	<tr>
	<th style="width:10%">Animal ID</th>
	<th>Animal Name</th>
	<th>Animal Gender</th>
	<th>Year</th>
	<th>Species ID</th>
	<th>Diet ID</th>
	<th>Keeper ID</th>
	<th>Enclosure ID</th>
	</tr>
<%
for(Animals eachElement:animalsList){
%>
<tr>
<td><%= eachElement.getAnimalsID() %></td>
<td><%= eachElement.getName()%></td>
<td><%= eachElement.getGender() %></td>
<td><%= eachElement.getYear() %></td>
<td><%= eachElement.getSID() %></td>
<td><%= eachElement.getDID() %></td>
<td><%= eachElement.getKID() %></td>
<td><%= eachElement.getEID() %></td>
</tr>
<%
}
}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>
</table>
</body>
</html>