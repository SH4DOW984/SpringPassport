<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous"/>
<style><%@include file="/WEB-INF/pages/style.css"%></style>
<title>Register here</title>
</head>
<body>
	<h1>Welcome To passport seva !!!</h1>

	<a href="loginpage">Login here</a>
	<fieldset>
	
	<form action="addcustomer" method="post">
		<div class="form-row">

			<div class="form-group">
				<label for="lblfirstName">First Name </label> 
				<input type="text" class="form-control" id="lblfirstName" name="txtfirstName"
					placeholder="Enter Name">
			</div>
			<div class="form-group">
				<label for="lbllastName">Last Name </label> 
				<input type="text" class="form-control" id="lbllastName" name="txtlastName"
					placeholder="Enter Last Name">
			</div>
			<div class="form-group">
				<label for="lblfatherFirstname">Father First Name </label> 
				<input type="text" class="form-control" id="lblfatherFirstName" name="txtfatherFirstName"
					placeholder="Enter Father First Name">
			</div>
			<div class="form-group">
				<label for="lblfatherLastname">Father Last Name </label> 
				<input type="text" class="form-control" id="lblfatherLatName" name="txtfatherLastName"
					placeholder="Enter Father Last Name">
			</div>
			
			<div>
				<label for="lblgender">Gender </label> <br/>
				<div class="form-check-inline">
				
				<label class="form-check-label" for="lblrdmale"> Male </label>
				<input class="form-check-input" type="radio" name="gender" id="lblgender" value="Male" checked> 
			
				<label class="form-check-label" for="lblrdfemale"> Female </label>
				<input class="form-check-input" type="radio" name="gender" id="lblgender" value="Female"> 
			</div>
			</div>
			
			<div class="form-group">
				<label for="lblemail">Email</label> 
				<input type="email" class="form-control" id="lblemail" name="txtemail"
					placeholder="Enter Email">
			</div>
			
			<div class="form-group">
				<label for="lblphoneNo">Phone NO</label> 
				<input type="text" class="form-control" id="lblphoneNo" name="txtphoneNo"
					placeholder="Enter Phone No">
			</div>
			
			<div class="form-group">
				<label for="lblaadharNo">Aadhar No</label> 
				<input type="text" class="form-control" id="lblaadharNo" name="txtaadharNo"
					placeholder="Enter Aadhar no">
			</div>
			
			<div class="form-group">
				<label for="lbladdress">Address</label> 
				<input type="text" class="form-control" id="lbladdress" name="txtaddress"
					placeholder="Enter Address">
			</div>
			
			
		</div>
		<button type="submit" class="btn btn-primary">Sign-up</button>
	
	</form>

	</fieldset>

</body>
</html>