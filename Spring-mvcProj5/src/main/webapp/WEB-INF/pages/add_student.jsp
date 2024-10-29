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
<body bgcolor="Green">
<div class="container">

<h1 style="color:red">STUDENT FORM</h1>
	<form action="saveStudent" method="post">
		<table border="1" >
			<tr>
			
				<td>Enter ID</td>
				<td><input type="number" name="studID" /></td>
			</tr>
			<tr>
				<td>Enter Name</td>
				<td><input type="text" name="studNAME" /></td>
			</tr>
			<tr>
				<td>Enter Address</td>
				<td><input type="text" name="studADD" /></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input  class="btn btn-outline-success" type="submit"
					value="Save STUDENT" /></td>
			</tr>
		</table>
	</form>

</body>
</html>