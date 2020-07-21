
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Please Register Here</h1>
	<form:form action="RegistrationSuccess" method="GET" modelAttribute="regdto">
		<div align="center">
			<label for="N"> Name : </label>
			<form:input id="N" path="name" placeholder=" Enter Your Name" />
			<br /> <label for="UN"> UserName : </label>
			<form:input path="userName" id="UN" placeholder=" Enter User Name" />
			<br /> <label for="P"> Password : </label> 
			<form:password path="password" placeholder=" Enter Password"/>
			<br /> <label>Country Name : </label>
			<form:select path="countryName">
				<form:option value="IND" label="India"></form:option>
				<form:option value="SL" label="Srilanka"></form:option>
				<form:option value="AUS" label="Australia"></form:option>
				<form:option value="NZ" label="Newzeland"></form:option>
				<form:option value="SA" label="South Africa"></form:option>
				<form:option value="USA" label="USA"></form:option>
				<form:option value="AFG" label="Afganisthan"></form:option>
			</form:select>
			<br />
			<label>Hobbies : </label> Cricket :
			<form:checkbox path="hobbies" value="cricket" />
			Programming :
			<form:checkbox path="hobbies" value="programming" />
			Playing Music :
			<form:checkbox path="hobbies" value="playing music" />
			Reading Books :
			<form:checkbox path="hobbies" value="reading books" />
			<br />
			<label>Gender : </label> Male:
			<form:radiobutton path="gender" value="male" />
			FeMale:
			<form:radiobutton path="gender" value="female" />
			<br />
			<label>Age : </label>
			<form:input path="age"/><br>
			
		<div >
		<h3 align="left"> Communication Details:</h3>
		<label>E-mail : </label>
		<form:input path="communicationDTO.email"/>
		<label>Phone : </label>
		<form:input path="communicationDTO.phone"/>
		
		</div>
			<form:button>Register</form:button>
		</div>

	</form:form>
</body>
</html>