<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<style>
div.container {
    width: 100%;
    height: 100%;
    border: 1px solid gray;
}
b {
	font-size: 150%;
	align: center;
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
nav {
    float: left;
    max-width: 160px;
    margin: 0;
    padding: 1em;
}
table {
	font-size: 14px;
	align: right;
	text-align:right;
	display: inline;
	top: 0;
	right: 0;
}
div.relative {
    position: relative;
    left: 0px;
    top: -20px;
}
h1 {
    font: italic bold 12px/30px Georgia, serif;
    font-size: 275%;
    align: center;
    display: inline;
}
i {
	display: inline;
}
img {
	display: inline;
	width: 130;
	height: 130;
}
a{
	display: inline;
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
.active {
    background-color: #4CAF50;
}
</style>
<title>JC Laptops</title>
</head>

<body>
<div class="container">
<header>
	<div class="relative">
	<img src="resources/Laptop_LogoIcon.jpg" style="float:left;" />
	</div>
	<h1 align="center">JC Laptops</h1>
	<table align="right">	
	<tr><th><i class="material-icons" style="font-size:48px; float:right">perm_identity</i></th></tr>
	<tr><td><a href="signin" style="float:right;">Sign-in</a></td></tr>
	<tr><td><a href="signup" style="float:right;">Sign-up</a></td></tr>
	</table>
</header>
<ul>
  <li><a class="active" href="home">Home</a></li>
  <li><a href="contact">Contact</a></li>
  <li><a href="about">About Us</a></li>
</ul>
<nav>
&nbsp;<h1 style="color:blue;">Categories:</h1>
<br><br>
<table>
	<col width="200">
	<col width="300">
    <tr><td height="20px" align="left"><b>Apple</b></td><td height="20px" width="40px" align="right"><a href="Apple"><img src="resources/Apple_Logo.jpg"></a></td></tr>
    <tr><td height="20px" align="left"><b>Asus</b></td><td height="20px" width="40px" align="right"><a href="Asus"><img src="resources/Asus_Logo.jpg"></a></td></tr>
	<tr><td height="20px" align="left"><b>DELL</b></td><td height="20px" width="40px" align="right"><a href="DELL"><img src="resources/DELL_Logo.jpg"></a></td></tr>
	<tr><td height="20px" align="left"><b>HP</b></td><td height="20px" width="40px" align="right"><a href="HP"><img src="resources/HP_Logo.jpg"></a></td></tr>
	<tr><td height="20px" align="left"><b>Lenovo</b></td><td height="20px" width="40px" align="right"><a href="Lenovo"><img src="resources/Lenovo_Logo.jpg"></a></td></tr>
</table>
</nav>
<footer><div style="display:inline;">Registered &reg; JC Laptops</div>
<div style="width:100%;text-align:right;display:inline;">
<a href="https://www.facebook.com/"><img src="resources/facebook.jpg" align="right" style="width:20px;height:20px;display:inline;"></a>
&nbsp;
<a href="https://twitter.com/"><img src="resources/twitter.jpg" align="right" style="width:20px;height:20px;display:inline;"></a>
</div>
</footer>
</div>
</body>
</html>