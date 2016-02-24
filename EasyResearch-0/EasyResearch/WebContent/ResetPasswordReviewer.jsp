<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Reset Password</title>
		<link href="css/style.css" rel="stylesheet" type="text/css">
	</head>

	<body>
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
			<div>
				<table style="width: 100%; display: inline-block;">
					<tbody>
						<tr>
							<td>
								<h2>Easy Research - Reset Password</h2>
							</td>
						</tr>
						<tr>
							<td>
								<form name="resetpassform" action="ResetPasswordReviewer" method="post">
									<input type="hidden" name="callingUser" value="<%= request.getParameter("user") %>"/>
									<table class="logintable">
										<tbody>
											<tr>
												<td class="textright">Username : </td>
												<td class="tableinputtext"><input class="tableinput" type="text" name="resetPassUsername"/></td>
											</tr>
									 		<tr>
									 			<td class="textright">Email Address : </td>
									 			<td class="tableinputtext"><input class="tableinput" type="text" name="resetPassEmailId"/></td>
									 		</tr>
							 				<tr>
							 					<td colspan="2" style="text-align: center;"><input type="submit" value="Send Password" class="loginbutton"></td>
							 				</tr>
							 			</tbody>
					 				</table>
								</form>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="footer">
				<p id="copyright">Copyright &copy; 2014. Developed by Chandrachudeswaran Sankar, Sashank Santhanam, Rohit Bansod, Samatha Kolagatla</p>
				<p><small>Template designed by htmltemplates.net website templates</small></p>
			</div>
		</div>
	</body>
</html>