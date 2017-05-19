<!DOCTYPE html>
<html>
<head>
<style>
div.container {
    				width: 100%;
    				height: 90%;
    				border: 1px solid gray;
			  }
h1    {
    	font: italic bold 12px/30px Georgia, serif;
    	font-size: 275%;
    	align: center;
    	display: inline;
	  }
body  { 
    	background-image: url('webapp/resources/img_avatar2.png');
    	background-repeat: no-repeat;
    	background-attachment: fixed;
    	background-position: 20% 55%; 
	  }
textarea
      {
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
div.relative {
    			position: relative;
    			left: 0px;
    			top: -20px;
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
		position:relative;
		font-size: 108%;					
		font-family: verdana;
		padding: 0.5em;
		color: white;
		background-color: #000000;
		clear: left;
		text-align: left;
		margin-top: 179px;
		height: -179px;
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
li a:hover:not(.active) 
	 {
    	background-color: #111;
	 }
.active {
    	background-color: #4CAF50;
		}
</style>
<title>Customer Log-In</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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
  			<li><a class="active" href="index">Home</a></li>
  			<li><a href="contact">Contact</a></li>
  			<li><a href="about">About Us</a></li>
		</ul>
		<br>
		<h1 style="color:blue;">Sign-In Page:</h1>
		<div>               			
			<div class=" col-lg-4  col-md-4 col-sm-4 col-xs-4 noPadding"> 			    
				<div class="row">					
					<form action="" method="post" id="loginform"><br><br><br>
					<i class="material-icons" style="font-size:48px; float:center" >perm_identity</i>					
						<table>
						<tbody style="font-size: 36px !important;">						
							<tr><td><label for="username" class="sr-only"><b>Username</b></label></td>
							<td>&nbsp;<input type="text" class="form-control input-lg input-block" id="username" name="username" placeholder="username"></td>
							</tr>							
							<tr><td><label for="password" class="sr-only"><b>Password</b></label></td>
							<td>&nbsp;<input type="password" class="form-control input-lg input-block" id="password" name="password" placeholder="password"></td>
							</tr>
						</tbody>	
						</table>
						<br>
						<div class="form-group" align="left">
							<br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="submit" class="btn btn-primary btn-lg btn-block" id="submitform" >Sign-In</button>						
						</div>					
					</form>				
				</div>			
			</div>	
		</div>
	  <footer>Registered &reg; JC Laptops</footer>
	 </div>
	</body>
</html>