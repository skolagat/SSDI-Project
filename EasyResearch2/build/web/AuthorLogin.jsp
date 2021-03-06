<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Easy Research- Author Home</title>
		<link href="css/style.css" rel="stylesheet" type="text/css">
		<script src="LoginValidation.js"></script>
	</head>
	
	<body>
		<%String invalid = (String)request.getAttribute("Invalid Login Credentials"); %>
		<c:set var = "invalid" value ="<%=invalid%>"/>
		<div id="main-wraper">
			<div id="top-wraper">
				<div id="banner">Easy Research</div>
				<div id="nav">
					<ul>
					  <li><a href="/EasyResearch/Home">Home</a></li>
					  <li><a href="AboutUs.jsp">About us</a></li>
					  <li><a href="ContactUs.jsp">Contact</a></li>
					</ul>
				</div>
			</div>
			<table style="width: 100%; display: inline-block;">
				<tbody>
					<tr>
						<td>
							<h2>Easy Research - Author Login</h2>
						</td>
					</tr>
					<tr>
						<td>
							<c:if test="${invalid!=null && invalid!=''}">
								<span class = "invalidText" style ="color: red;">Invalid UserName/ Password Combination</span>
							</c:if>
							<form name="form1" action="AuthorLogin" method="post" onsubmit="return chklogin();">
								<table class="logintable">
									<tbody>
		
										<tr>
											<td class="textright">Username : </td>
											<td class="tableinputtext"><input class="tableinput" type="text" name="username"/></td>
										</tr>
								 		<tr>
								 			<td class="textright">Password : </td>
								 			<td class="tableinputtext"><input class="tableinput" type="password" name="password"/></td>
								 		</tr>
						 				<tr>
						 					<td colspan="2" style="text-align: center;"><input type="submit" value="Login" name="submit" class="loginbutton"></td>
						 				</tr>
						 				<tr>
						 					<td colspan="2" style="font-size: small; text-align:right"><a style="text-decoration: none;" href="ResetPassword.jsp?user=author">Forgot your password</a></td>
						 				</tr>
						 			</tbody>
						 		</table>
							</form>
						</td>
						<td colspan="3" style="width:150px; text-align: center;">
							~OR~
						</td>
						<td>
						<strong>Create an Account.Its free and always will be.</strong><br/>
						<span class="author_signup"><a href="SignupAuthor.jsp">Sign Up </a></span>
						</td>
					</tr>
				</tbody>
			</table>
			<div class="footer">
			<p id="copyright">Copyright &copy; 2014. Developed by Chandrachudeswaran Sankar, Sashank Santhanam, Rohit Bansod, Samatha Kolagatla</p>
			</div>
		</div> 
	
	</body>
</html>


