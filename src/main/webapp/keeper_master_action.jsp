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
<title>Keeper_master_action</title>
</head>
<body>
<%
String keeperName = request.getParameter("keepername");
String keeperDOB = request.getParameter("keeperdateofbirth");
String keeperPhone = request.getParameter("keeperPhone");
String keeperEmail = request.getParameter("keeperemail");
String keeperType = request.getParameter("keepertype");
out.print(keeperPhone);
DBManager dbManager = new DBManager();
try{
	dbManager.getConnection();
	out.println("Connectio Successfully");
	Keeper c= new Keeper(keeperName,keeperDOB,keeperEmail,keeperPhone,keeperType);
	KeeperManager kcm = new KeeperManager();
	int rowInserted = kcm.insert(c);
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