<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Data</title>
</head>
<body>
	
	<form method="post" action="EmployeeController">
		Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
		<input type="text" name="name" id="name">
		<br>
		Designation <input type="text" name="designation" id="designation">
		<br>
		Age &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="text" name="age" id="age">
		<br>
		<br>
		<br>
		Result:&nbsp;&nbsp;&nbsp; ${result }
		<br>
		<input type="submit" value="Submit" onClick="return isEmpty()">
	</form>
</body>

<script>
  function isEmpty(){
     var data=document.getElementById("name").value;
     var data1=document.getElementById("designation").value;
     var data2=document.getElementById("age").value;
     if(data.length==0 && data1.length==0 && data2.length==0)
     {
         alert("Name,desination,age is required!");
         return false;
     }
     else if (data.length==0 && data1.length==0)
     {
         alert("Name,desination is required!");
         return false;
     }   
     else if (data.length==0 && data2.length==0)
     {
         alert("Name,Age is required!");
         return false;
     } 
     else if (data.length==0 && data2.length==0)
     {
         alert("Age,desination is required!");
         return false;
     } 
     else if (data.length==0)
     {
         alert("Name is required!");
         return false;
     } 
     else if (data1.length==0)
     {
         alert("designation is required!");
         return false;
     } 
     else if (data2.length==0)
     {
         alert("Age is required!");
         return false;
     } 
     return true;
  }
</script>

</html>