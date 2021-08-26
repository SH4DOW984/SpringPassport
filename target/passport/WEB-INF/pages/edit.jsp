<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update" method="get">
		<div class="form-row">

			<div class="form-group">
				<label for="lblcid">Customer ID </label> 
				<input type="text" class="form-control" id="lblcid" name="cid" value="${param.cid}">
					
			</div>
			<div class="form-group">
				<label for="lblfirstname">First Name </label> 
				<input type="text" class="form-control" id="lblfirstName" name="firstName" value="${param.firstName}">
					
			</div>
			<div class="form-group">
				<label for="lbllastName">Last Name </label> 
				<input type="text" class="form-control" id="lbllastName" name="lastName" value="${param.lastName}">
					
			</div>
			<div class="form-group">
				<label for="lblfatherFirstName">Father First Name </label> 
				<input type="text" class="form-control" id="lblfatherFirstName" name="fatherFirstName" value="${param.fatherFirstName}">
					
			</div>
			
			<div class="form-group">
				<label for="lblfatherLastName">Father last Name </label> 
				<input type="text" class="form-control" id="lblfatherLastName" name="fatherlastName" value="${param.fatherLastName}">
					
			</div>
			
			
			<div>
				<label for="lblgender">Gender </label> <br/>
				<div class="form-check-inline">
				
				<label class="form-check-label" for="lblrdmale"> Male </label>
				<input class="form-check-input" type="radio" name="gender" id="gender" value="Male" checked> 
			
				<label class="form-check-label" for="lblrdfemale"> Female </label>
				<input class="form-check-input" type="radio" name="gender" id="gender" value="Female"> 
			</div>
			<div class="form-group">
				<label for="lblphoneNo">phone no </label> 
				<input type="text" class="form-control" id="phoneNo" name="phoneNo" value="${phoneNo}">
					
			</div>
			<div class="form-group">
				<label for="lblaadharNo">Aadhar No </label> 
				<input type="text" class="form-control" id="aadharNo" name="aadharNo" value="${aadharNo}">
					
			</div>
			
			<div class="form-group">
				<label for="lbladdress">Address </label> 
				<input type="text" class="form-control" id="address" name="address" value="${address}">
					
			</div>
			
			<div class="form-group">
				<label for="lblemail">Email</label> 
				<input type="email" class="form-control" id="lblemail" name="email" value="${param.email}"
					placeholder="Enter Email" readonly="readonly">
			</div>
		</div>
		<button type="submit" value="update" class="btn btn-primary">UPDATE EMPLOYEE</button>
	
	</form>

</body>
</html>