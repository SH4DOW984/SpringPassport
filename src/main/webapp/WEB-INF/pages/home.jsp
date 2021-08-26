<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Home</title>
</head>
<body>
	Home Page
	
	<table class="table">
  <thead class="thead-light">
    <tr>      
      <th scope="col">CID</th>
      <th scope="col">FIRSTNAME</th>
      <th scope="col">LASTNAME</th>
      <th scope="col">FATHERFIRSTNAME</th>
      <th scope="col">FATHERLASTNAME</th>
      <th scope="col">GENDER</th>
      <th scope="col">EMAIL</th>
      <th scope="col">PHONENO</th>
      <th scope="col">AADHARNO</th>
      <th scope="col">ADDRESS</th>
      <th colspan="2">ACTION</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach var="customer" items="${clist}">
    <tr>
    	<td><c:out value="${customer.cid}"></c:out></td>
      	<td><c:out value="${customer.firstName}"></c:out></td>
      	<td><c:out value="${customer.lastName}"></c:out></td>
      	<td><c:out value="${customer.fatherFirstName}"></c:out></td>
      	<td><c:out value="${customer.fatherLastName}"></c:out></td>
      	<td><c:out value="${customer.gender}"></c:out></td>
      	<td><c:out value="${customer.email}"></c:out></td>
      	<td><c:out value="${customer.phoneNo}"></c:out></td>
      	<td><c:out value="${customer.aadharNo}"></c:out></td>
      	<td><c:out value="${customer.address}"></c:out></td>
      	<td><a href="edit?cid=${customer.cid}&firstName=${customer.firstName}&lastName=${customer.lastName}&fatherFirstName=${customer.fatherFirstName}&fatherLastName=${customer.fatherLastName}&gender=${customer.gender}&email=${customer.email}&phoneNo=${customer.phoneNo}&aadharNo=${customer.aadharNo}&address=${customer.address}">Edit</a></td>
      	<td><a href="delete?cid=${customer.cid}">Delete</a></td>
    
      	
      	
    </tr>
    </c:forEach>
  </tbody>
</table>
	
</body>
</html>