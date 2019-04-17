<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<title>Customer Registration Form</title>
	<style type="text/css">
		.error {
			color: red;
		}
	</style>
</head>
<body>
	<form:form action="processRegistration" modelAttribute="customer">
	
		Please fill out the form. (* indicated required)
		<br/><br/>
		
		First Name   : <form:input path="firstName"/>
		<br/><br/>
		Last Name (*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br/><br/>
		<input type="submit" value="Submit"/>
		
	
	</form:form>
</body>
</html>