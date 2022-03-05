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
<h1 style="text-align:center;">Species List</h1>
<style>
table,th, td {
border: 2px solid green;
}
</style>
</head>
<body>
</head>
<body>
<%
DBManager dbManager = new DBManager();
try {
	dbManager.getConnection();
	//Select
	speciescontentmanager s = new speciescontentmanager();
	ArrayList<Species> species = s.selectAll();
	out.print(species.size());
	
%>
<table style="width:100%">
	<tr>
	<th style="width:10%">speciesID</th>
	<th>type</th>
	<th>group</th>
	<th>lifestyle</th>
	<th>conservationstatus</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
<%
for(Species eachElement:species){
%>
<tr>
<td><%=eachElement.getSpeciesID() %></td>
<td><%=eachElement.getType() %></td>
<td><%=eachElement.getGroup() %></td>
<td><%=eachElement.getLifestlye() %></td>
<td><%=eachElement.getConservationstatus() %></td>
<td><a href="speciesUpdate.jsp?ID=<%=eachElement.getSpeciesID()%>">Edit</a></td>
<td><a href="speciesdeletedaction.jsp?ID=<%=eachElement.getSpeciesID()%>">Delete</a></td>
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