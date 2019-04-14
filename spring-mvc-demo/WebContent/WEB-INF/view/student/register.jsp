<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Student : Registration</title>
</head>
<body>
	<h1>Register</h1>
	<hr>
	<form:form action="register" modelAttribute="student" method="POST">
		<div>
			First Name :
			<form:input path="firstName" />
		</div>
		<br />
		<div>
			Last Name :
			<form:input path="lastName" />
		</div>
		<br />
		<div>
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
			</form:select>
		</div>
		<br />
		<div>
			<form:radiobuttons path="favouriteLanguage"
				items="${student.langOptions}" />
		</div>
		<br />
		<div>
			Mac OS<form:checkbox path="os" value="Mac OS" />
			Windows<form:checkbox path="os" value="Windows" />
			Linux<form:checkbox path="os" value="Linux" />
		</div>
		<div>
			<button type="submit">REGISTER</button>
		</div>

	</form:form>
</body>
</html>
