<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>HomePage</title>
</head>


<style>
body {font-family: Arial, Helvetica, sans-serif;
background-image: url("../Images/bg9.jpg");
background-size :cover;}
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

li a, .dropbtn {
  display: inline-block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

li.dropdown {
  display: inline-block;
}
#bg
{
background-image: url("../Images/bg7.jpg");
background-position :cover;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
  display: block;
}
</style>

<body>
<center><b><h style="color:brown;text-align:center;font-size:50px">E-LEARNING</h1></b></center></br>
<div>
<ul>
  <li><a href="#home">Home</a></li>
  
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Login As</a>
    <div class="dropdown-content">
      <a href="Login2.jsp">Admin</a>
      <a href="Login2.jsp">User</a>
      <a href="Login2.jsp">Vendor</a>
      
    </div>
    <li><a href="Registration.jsp">Sign Up</a></li>
    <li><a href="#aboutUs">AboutUs</a></li>
  </li>
</ul>
</div>

<B><marquee direction="left" bgcolor="ORANGE" width="100%" height="50%">WELCOME TO E-LEARNING!GRAB THE OPPORTUNITY!</marquee></B>


</body>

</html>