<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addCarAction" method="post">
Enter carId:<input type="text" name="carId"><br><br>
Enter carName:<input type="text" name="carName"><br><br>
Enter carType:<input type="text" name="carType"><br><br>
Enter carColor:<input type="text" name="carColor"><br><br>
<input type="submit" value="Submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Cancle">


</form>
</body>
</html>