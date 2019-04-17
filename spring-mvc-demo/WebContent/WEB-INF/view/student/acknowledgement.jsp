<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>Student : Acknowledgement
</head>
<body>
	<h2>Dear ${student.firstName}, from ${student.country}</h2>
	<h3>${student.favouriteLanguage}- You registration was successful.</h3>

	<br />
	<ul>
		<c:forEach var="temp" items="${student.os}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>
