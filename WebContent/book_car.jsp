<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">
		<font color="red">Welcome to CarBook Page</font>
	</h1>
	<form action="carBookAction" method="post">
		Select Car <select name="carName">
			<%
				ArrayList<String> list = new ArrayList<String>();
				list = (ArrayList<String>) request.getAttribute("carName");
			%>
			<%
				for (String d : list) {

					String carName = d;
			%>
			<option value="<%=carName%>"><%=carName%></option>
			<%
				}
			%>
		</select><br><br>
		 Select CarType <select name="carType">
			<option value="AC">AC</option>
			<option value="NonAC">NonAC</option>
		
		</select><br><br>
		 For <select name="days">
			<option value="DAY">One DAY</option>
			<option value="WEEK">One Weak</option>
			<option value="MONTH">One Month</option>
		</select> <br><br>
		<input type="submit" value="BookCar">&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="Cancle">
	</form>
</body>
</html>