<%@page import="com.nit.Model.Student"%>
<%@page import ="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SMS_HOME</title>

<script type="text/javascript">

function deleteStudent(studID) {
var status = confirm("Do you want to delete?");
if (status){
	
		document.frm.studID.value=studID;
		document.frm.action="deleteStudent";
		document.frm.method="POST";
		document.frm.submit();
	
	 }
}
function editStudent(studID) {
	
document.frm.studID.value=studID;
document.frm.action="editStudent";
document.frm.method="POST";
document.frm.submit();
	
}
	
</script>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body>
<div class="container">

<h1>Student Details</h1>


<a href="add_student">Add Employee</a>
<form name="frm">

<input type="hidden" name="studID"/>

<table border ="1" width="100%">

<%
List <Student> students= (List<Student>) request.getAttribute("st");
if(students.isEmpty()){
	%>
	<tr>
				<td colspan="6">No Employees found!!</td>
			</tr>
			
<% 
}
for(Student studs: students){

	%>
	
	<tr>
			<td><%=studs.getStudID()%></td>
			<td><%=studs.getStudNAME()%></td>
			<td><%=studs.getStudADD()%></td>
			
			<td><input type="button" value="Edit" 
			onclick="editStudent('<%=studs.getStudID()%>')"/></td>
			
				<td><input type="button" value="Delete"
					onclick="deleteStudent('<%=studs.getStudID()%>')" /></td>
			
	</tr>
		<%
		}
		%>
		
</table>
</form>
</div>

</body>
</html>