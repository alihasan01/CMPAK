<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<%@page import="com.employee.ws.Employee" %>
<%@page import="service.EmployeeImpl" %>
<%@page import="controller.EmployeeController" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
//$(document).on("click", this.value, function() { // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
	function display(el) {
        var id = $(el).attr('id');
       // alert(id);
    //}
	var data = "abc";// {
		//    foo: "fooValue",
		  //  bar: "barValue",
		   // baz: "bazValue"
	//	};

		$.ajax({
		    type: "POST",
		    url: "http://localhost:8080/EmployeeWS/EmployeeController",
		    dataType:'json',
		    data:{Delete1:id},
		    success: function(response) {
		        // ...
		        alert("Done")
		    },
		error: function() {
        	//alert("JQuery error in this")
                    //Do something on ERROR here                            
               }
		});
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<p>This is a paragraph.</p>
		<p id="test">This is another paragraph.</p>
		
		<button>Click me</button>
		var str1 = "";
		<input type="hidden" name="pressedButton" id="pressedButton" /> 
		<form method="post" action="EmployeeController">		 
		<br>
		
		<table border ="2">
				
		<tr >
		<td>ID</td>
		<td>Name</td>
		<td>Designation</td>
		<td>Age</td>
		<td>Delete Record</td>
		<td>Edit Record</td>
		</tr>
		<%  
		// retrieve your list from the request, with casting 
		ArrayList<Employee> list = (ArrayList<Employee>) request.getAttribute("employee");

		// print the information about every category of the list
		int i = 1;
		for(Employee emp : list)
		{
		%>
			<tr> 
			<td> <%=emp.getID() %>
			<td> <%=emp.getName() %></td>
			<td> <%=emp.getDesignation() %></td>
			<td> <%=emp.getAge() %></td>
			<% String str = "Delete" + i; %>
		    <td>  <input type=submit name="b1"value="Delete<%=emp.getID()%>" id="Delete<%=emp.getID()%>" onclick="display(this);"></td>
		 	<td>  <a href="#ajax-link" onclick="javascript:myFunc(String Delete<%=i%>)">onclick</a>  </td>
			</tr>
			<%= i++ %>
	<%
		}
	%>
		</table>
		<br>
		<h2 Welcome to this site> </h2>
		</form>
<script type="text/javascript"> 
var val
function f1( value){  

	//val = value
	//document.getElementById("pressedButton").value = value;
	//str1 = document.getElementById("pressedButton").value;
	//var str = document.getElementById(objButton);
	//alert(value);
	<%
	//EmployeeController ec = new EmployeeController();
	//ec.deleteRecord(value);
	//foo();
	%>
	//Here i need a code to call my validation function 
    //like: var res=Validation (str);
    //and then do the  
    //document.getElementById("res").innerHTML = "Result:" + res;
    //DONE
    //EmployeeController ec = new EmployeeController();
	//ec.deleteRecord(value);
}
function foo() {
    theApplet = document.getElementById("app");
}
</script>

<script type="text/javascript"> 

function myFunc(value){  
	
	
	alert(value)
	
	//var str = document.getElementById(objButton);
	//alert(value);
	//EmployeeController ec = new EmployeeController();
	//ec.deleteRecord(value);
	
}
</script>
<script type="text/javascript">
$(function myFunc() {
   $('.ajax-link').click( function() {
         $.get( $(this).attr('href'), function(msg) {
              alert( "Data Saved: " + msg );
         });
         return false; // don't follow the link!
   });
});
</script>
</body>
</html>