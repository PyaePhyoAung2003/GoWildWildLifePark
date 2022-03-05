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
<style>
body {
 background-image: url('images/testzoo14.jpg');
 background-size: cover;
 text-align: center;
 display: flex;
 justify-content:center;
}
label{
color:#FFFF00;
font-size: 120%;
}
</style>
<body>
<body>
<form action="speciesupdatedaction.jsp">
<%
int id= Integer.valueOf(request.getParameter("ID"));
out.print("Id is "+ id);
speciescontentmanager scm= new speciescontentmanager();
try{
	Species s= scm.getById(id);
%>
<br><br>
<label>speciesID:</label> <input type="text" name="speciesID" value="<%=s.getSpeciesID()%>">
<br><br>
<label>type:</label> <input type="text" name="type" value="<%=s.getType()%>">
<br><br>
<label>group:</label> <input type="text" name="group" value="<%=s.getGroup()%>">
<br><br>
<label>lifestyle:</label> <input type="text" name="lifestyle" value="<%=s.getLifestlye()%>">
<br><br>
<label>conservationStatus:</label> <input type="text" name="conservationstatus" value="<%=s.getConservationstatus()%>">
<br><br><br><br>
<div class="btnAlign">
<button  class="bth" type="submit" value="Save">Update</button>
<button  class="bth" type="reset" value="Reset">Clear</button >
</div>
<%
}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}
%>
</form>
</body>
</html>
</html>