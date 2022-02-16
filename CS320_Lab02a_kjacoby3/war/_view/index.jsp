<!DOCTYPE html>

<html>
	<head>
		<title>Index view</title>
	</head>

	<body>
		This is the index view jsp
		<form action="${pageContext.servletContext.contextPath}/index" method="post">
			<table>
				<tr>
					<td><input name="addNumbers" type="submit" value="Add Numbers"></td>
				</tr>
				<tr>
					<td><input name="multiplyNumbers" type="submit" value="Multiply Numbers"></td>
				</tr>
				<tr>
					<td><input name="guessingGame" type="submit" value="Guessing Game"></td>
				</tr>
			</table>
		</form>
	</body>
</html>
