<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addCustomerAction" method="post">
Enter customerId:<input type="text" name="customerId"><br><br>
Enter customerName:<input type="text" name="customerName"><br><br>
Enter customerContact:<input type="text" name="customerContact"><br><br>
Enter customerAddress:<input type="text" name="customerAddress"><br><br>
<input type="submit" value="Submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Cancle">


</form>
</body>
</html>