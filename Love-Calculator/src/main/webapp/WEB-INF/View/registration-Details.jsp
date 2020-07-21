<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your Registration is Successful</h1>
	<hr />
	<h2>Your Details are Here :</h2>

	Your Name : ${regdto.name}
	<br> User Name : ${regdto.userName}
	<br> Password : ${regdto.password}
	<br> County : ${regdto.countryName}
	<br> Hobbies :

	<c:forEach var="hbs" items="${regdto.hobbies}">
 			${hbs}
 	</c:forEach><br>
 	Age : ${regdto.age }
 	
	<br> Gender : ${regdto.gender}<br>
	E-mail : ${regdto.communicationDTO.email}<br>
	Phone : ${regdto.communicationDTO.phone }



</body>
</html>