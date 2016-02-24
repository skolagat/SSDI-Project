<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Easy Research - Create a Conference</title>
		<link href="css/style.css" rel="stylesheet" type="text/css">
		
	</head>
	
	<body>
		<div id="main-wraper">
			<div id="top-wraper">
				<div id="banner">Easy Research</div>
				<div id="nav">
					<ul>
					  <li><a href="Admin.jsp">Home</a></li>
					  <li><a href="AboutUs.jsp">About us</a></li>
					  <li><a href="ContactUs.jsp">Contact</a></li>
					</ul>
				</div>
			</div>
			<h2>Create a Conference</h2>
		
			<form name="formrs" action="createConference" method="post" >
				<table id="createform" style="width: 100%; border-color: #000000;">
			        <tr>
			            <td class="style2">Conference Name</td>
			            <td><input type="text" class="tableinput" name="cname"></td>
			        </tr>
			         <tr>
			            <td class="style2">Place Held</td>
			            <td><input type="text" class="tableinput" name="place"></td>
			        </tr>
			       	<tr>
												<td align="right" style="width: 25%">
													<span style="font-size: 14px; font-weight: bold;">Description of Conference: </span>
												</td>
												<td colspan="2" style="text-align: left;">
													<textarea rows=30 cols=50 name="description"></textarea>
												</td>
											</tr>
			        <tr>
			            <td class="style2">Abstract Last Date</td>
			            <td><input type="text" class="tableinput" name="date1"></td>
			        </tr>
			          <tr>
			            <td class="style2">Paper Last Date</td>
			            <td><input type="text" class="tableinput" name="date2"></td>
			        </tr>
			          <tr>
			            <td class="style2">Conference Held Date</td>
			            <td><input type="text" class="tableinput" name="date3"></td>
			        </tr>
			        
			        <tr>
			            <td class="style1" colspan="2"><input type="Submit" name="submit" value="Create Conference"></td>
			        </tr>
			    </table>
			</form>
		</div>
	</body>
</html>
    