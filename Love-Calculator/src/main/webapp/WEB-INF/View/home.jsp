<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 50px;
}
</style>
<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById('YN').value;
		if (userName.length < 3) {
			alert("Your Name Should Have Atleast 3 Characters")
			return false;
		} else {
			return true;
		}
	}
	function validateCrushName() {
		var crushName = document.getElementById('CN').value;
		if (crushName.length < 3) {
			alert("Crush Name Should Have Atleast 3 Characters")
			return false;
		} else {
			return true;
		}
	}
</script>

</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr />
	<form:form action="process" method="get" modelAttribute="userinfo"
		onsubmit="return validateUserName(),validateCrushName() ">
		<div align="center">
			<p>
				<label for="YN"> Your Name : </label>
				<form:input id="YN" path="userName" placeholder="your name please" />
				<form:errors path="userName" cssClass="error" />
			</p>
			<p>
				<label for="CN"> Crush Name : </label>
				<form:input id="CN" path="crushName" placeholder="crush name please" />
				<form:errors path="crushName" cssClass="error" />
			</p>
			<p>
				<form:checkbox path="termsAndConditions" id="check" />
				<label>I am Agreeing The Terms And Conditions</label>
				<form:errors path="termsAndConditions" cssClass="error"></form:errors>
			</p>
			<input type="submit" value="Calculate">

		</div>
	</form:form>
</body>
</html>