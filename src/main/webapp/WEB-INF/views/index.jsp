<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Statement st = ((Connection)request.getAttribute("connect")).createStatement();
ResultSet rs = st.executeQuery("select * from product");
out.println("\nProduct List\n\n");
while(rs.next())
{
	out.println(rs.getInt("id")+" "+rs.getString("prnm")+" "+rs.getInt("price")+" "+rs.getInt("qty")+"<br>");   
}

%>


</body>
</html>