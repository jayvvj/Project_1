<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE project>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<style>
h1 {
    font: italic bold 12px/30px Georgia, serif;
    font-size: 275%;
    align: center;
    display: inline;
}
div.container {
    width: 100%;
    border: 1px solid gray;
}
body { 
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-position: 20% 55%; 
}			  
textarea {
	outline: none;
	resize: none;
}
input {
	outline: none;
	resize: none;
}			   
table {
	font-size: 14px;
	align:center;
	display: inline;
	top: 50;
	right: 50;
}
header {
	font-size: 175%;
    font-family: verdana;
    padding: 2em;
    color: white;
    background-color: #FFA500;
    clear: left;
    text-align: center;
}
footer {
	font-size: 108%;
	font-family: verdana;
	padding: 0.5em;
	color: white;
	background-color: #000000;
	clear: left;
	text-align: left;
}			
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}
li {
    float: left;
}
li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
li a:hover:not(.active) {
    background-color: #111;
}
</style>
<title>Add Product</title>
</head>

<body>
	<div class="container">
	<header>
	<div class="relative">
	<img src="resources/Laptop_LogoIcon.jpg" style="float:left;" />
	</div>
	<h1 align="center">JC Laptops</h1>
	</header>
	<ul>
  	<li><a href="home">Home</a></li>
  	<li><a href="contact">Contact</a></li>
  	<li><a href="about">About Us</a></li>
	</ul>
	<br>
	<h1 style="color:blue;">Add Product Page</h1>
	<form action="registersupplier" method="post">
	<br>
		<table style="font-size:18px">
		<col width="200">
		<col width="480">
			<tr>
				<td><label><b>Supplier ID</b></label></td>
	    		<td><input type="text" placeholder="Enter Supplier ID" name="SId" required></input></td>
			</tr>
			<tr>
				<td><label><b>Supplier Name</b></label></td>
    			<td><input type="text" placeholder="Enter Supplier Name" name="name" required></input></td>
			</tr>
			<tr>
			<td />
			<td><input type="submit" value="Add Supplier"/></td>
			</tr>
		</table>		
	</form>
<footer>Registered &reg; JC Laptops</footer>
</div>
</body>
</html>