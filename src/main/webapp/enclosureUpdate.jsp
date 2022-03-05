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
<form action="enclosureupdated_action.jsp">
<%
int id= Integer.valueOf(request.getParameter("id"));
out.print("Id is "+ id);
enclosurescontentmanager ecm= new enclosurescontentmanager();
try{
	enclosures ec= ecm.getById(id);
%>
<br><br>
<label>E_ID:</label> <input type="text" name="enclosureId" value="<%=ec.getEnclosuresID() %>">
<br><br>
<label>E_Type:</label> <input type="text" name="enclosuretype" value="<%=ec.getType() %>">
<br><br>
<label>E_Location:</label> <input type="text" name="enclosurelocation" value="<%=ec.getLocation() %>">
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