<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student : Registration</title>
</head>
<body>
	<h1>Register</h1>
	<hr>
	<form:form action="register" modelAttribute="student"
		method="POST">
		<div>
			First Name :
			<form:input path="firstName" />
		</div>
		<br/>
		<div>
			Last Name :
			<form:input path="lastName" />
		</div>
		<br/>
		<div>
			<button type="submit">REGISTER</button>
		</div>

	</form:form>
</body>
</html>
