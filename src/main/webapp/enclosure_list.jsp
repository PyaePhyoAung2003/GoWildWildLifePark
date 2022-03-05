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
</head>
<style>

h1 {text-align: center;}
table, th, td {
  border: 1px solid black;
  border-radius: 10px;
</style>
<body>
<h1>Enclosure List</h1>
<%
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connection Successfully");
	//Select
	enclosurescontentmanager enclosurescontentmanager = new enclosurescontentmanager();
	ArrayList<enclosures> enclosures = enclosurescontentmanager.selectAll();
%>
<table style="width:100%">
  <tr>
         <th>enclosureId</th>
         <th>type</th>
         <th>location</th>
         <th>Edit</th>
         <th>Delete</th>
  </tr>
  <%
for(enclosures eachEnclosure:enclosures){
%>
<tr>
<td><%=eachEnclosure.getEnclosuresID() %></td>
<td><%=eachEnclosure.getType() %></td>
<td><%=eachEnclosure.getLocation() %></td>
<td><a href="enclosureUpdate.jsp?id=<%=eachEnclosure.getEnclosuresID()%>">Edit</a></td>
<td><a href="enclosuredeleted_action.jsp?id=<%=eachEnclosure.getEnclosuresID()%>">Delete</a></td>
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
 