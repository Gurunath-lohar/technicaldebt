<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test MVC Home Page</title>
</head>
<body>
	<table>
		<tr>
			<td>Employee Id</td>
			<td>Name</td>
			<td>Last Name</td>			
		</tr>
		<tr>
			<td>${userObject.id}</td>
			<td>${userObject.firstName}</td>
			<td>${userObject.lastName}</td>			
		</tr>
	</table>
</body>
</html>