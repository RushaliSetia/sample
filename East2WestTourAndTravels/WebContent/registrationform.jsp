<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h2>Enter the following details to register yourself</h2>
	<form method="post" action="RegisterServlet">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" required><br /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address" required><br /></td>
			</tr>
			<tr>
				<td>Date of Birth:</td>
				<td><input type="text" name="dateOfBirth" required><br /></td>
			</tr>
			<tr>
				<td>user id:</td>
				<td><input type="number" name="userid" required><br /></td>
			</tr>
			<tr>
				<td>Email Id:</td>
				<td><input type="text" name="email" required></br></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" required></br></td>
			</tr>
			<tr>
				<td>Role:</td>
				<td><select name="role">
						<option value="customer">Customer</option>
						<option value="hotel owner">Hotel Owner</option>
						<option value="car owner">Car Owner</option>
				</select></td>
			</tr>
			<tr>
				<td>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>