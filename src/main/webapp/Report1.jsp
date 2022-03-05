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
<title>Report 1</title>
<style >
table, th, td {
  border: 2px solid;
  
}
table{
width: 100%;
}
th {
  height: 50px;
}
</style>
</head>
<body>
<%
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	//select
	animalscontentmanager animalContentManager = new animalscontentmanager();
	ArrayList<Animals> animals = animalContentManager.selectAllAnimalsByKeeperName();
%>
<h1 style="text-align:center">Report 1</h1>
<table>
<tr>
<th>Animal ID</th>
<th>Animal Name</th>
<th>Gender</th>
<th>Animal Year</th>
<th>Keeper ID</th>
<th>Keeper Name</th>
</tr>
<%
for(Animals eachAnimal:animals ){
%>
<tr>
<td><%=eachAnimal.getAnimalsID() %></td>
<td><%=eachAnimal.getName() %></td>
<td><%=eachAnimal.getGender() %></td>
<td><%=eachAnimal.getYear() %></td>
<td><%=eachAnimal.getKID() %></td>
<td><%=eachAnimal.getKeepername() %></td>
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