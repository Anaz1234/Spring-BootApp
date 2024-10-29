<%@page import="com.nit.Model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1>Existing Employee Form</h1>
<%
		Student stud=(Student) request.getAttribute("st");
	%>
	
	
	<form action="updateStudent" method="post">
		<input type="hidden" name="studID" value="<%=stud.getStudID() %>" />

       <table border="1">
			<tr>
				<td>Enter Name</td>
				<td><input type="text" value="<%=stud.getStudNAME() %>" name="studNAME" /></td>
			</tr>
			<tr>
				<td>Enter Address</td>
				<td><input type="text" name="studADD" value="<%=stud.getStudADD() %>" /></td>
			</tr>
	
			<tr>
				<td colspan="2" align="center">
				
				<div class="form-floating">
				<input class="btn btn-outline-success" type="submit"
					value="UpdateStudent" />
				<a class="btn btn-outline-danger" href="getAllStudents">Cancel</a>
				</div>	
				</td>
			</tr>
		</table>
	</form>
	</div>



</body>
</html>