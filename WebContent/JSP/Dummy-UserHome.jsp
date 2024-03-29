<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Dummy</title>
</head>
<style>
body {
  font-family: 'Lato', sans-serif;
  background-image: url("../Images/bg9.jpg");
   background-repeat: no-repeat;
   background-size: cover;
}

.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #f4511e;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 28px;
  padding: 20px;
  width: 300px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}


button:hover 
{
  
/*background: #8BC34A; {GREEEN KARNE K LIYE H MENU K OPTIONS KO}*/

  color: #ffffff;   
  
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}

.overlay {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: rgb(0,0,0);
  background-color: rgba(0,0,0, 0.9);
  overflow-x: hidden;
  transition: 0.5s;
}

.overlay-content {
  position: relative;
  top: 25%;
  width: 50%;
  text-align: center;
  margin-top: 30px;
}

.overlay a {
  padding: 8px;
  text-decoration: none;
  font-size: 36px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

.overlay a:hover, .overlay a:focus {
  color: #f1f1f1;
}

.overlay .closebtn {
  position: absolute;
  top: 20px;
  right: 45px;
  font-size: 60px;
}

@media screen and (max-height: 450px) {
  .overlay a {font-size: 20px}
  .overlay .closebtn {
  font-size: 40px;
  top: 15px;
  right: 35px;
  }
}





.overlay1 {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  right: 0;
  background-color: rgb(0,0,0);
  background-color: rgba(0,0,0, 0.9);
  overflow-x: hidden;
  transition: 0.5s;
}

.overlay1-content {
  position: relative;
  top: 25%;
  width: 20%;
  text-align: left;
  margin-top: 30px;
}

.overlay1 a {
  padding: 5px;
  text-decoration: none;
  font-size: 36px;
  color: #818181;
  display: block;
  transition: 0.3s;
}


.overlay1 a:hover, .overlay a:focus {
  color: #f1f1f1;
}

.overlay1 .closebtn {
  position: absolute;
  top: 20px;
  right: 45px;
  font-size: 60px;
}

@media screen and (max-height: 450px) {
  .overlay1 a {font-size: 20px}
  .overlay1 .closebtn {
  font-size: 40px;
  top: 15px;
  right: 35px;
  }
}



</style>

<body>
<div id="myNav" class="overlay">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav(); closeNav1(); closeNav2(); closeNav3()">&times;</a>
  <div class="overlay-content">
    
    <div class="dialog">
 	<a href="#" class="close-thik"></a>
	</div>
  
    <button class="button" onclick="openNav1(); closeNav2(); closeNav3()"><span>Profile </span></button>
    <button class="button" onclick="openNav2(); closeNav3(); closeNav1()"><span>Transactions</span></button>
    <button class="button" style="vertical-align:middle" onclick="openNav3(); closeNav2(); closeNav1()"><span>Services</span></button>
    
  </div>
</div>


<div id="myNav1" class="overlay1" onclick="closeNav1()">
<a href="javascript:void(0)" class="closebtn" onclick="closeNav1()">&times;</a>

  <div class="overlay-content">
    <a href="http://localhost:8084/E-Learning/JSP/Dummy-UserHome-EditProfile.jsp">Edit Profile</a>
    </br>
    <a href="http://localhost:8084/E-Learning/JSP/Dummy-UserHome-AvailedServices.jsp">Availed Services</a>
    
  </div>
</div>

<div id="myNav2" class="overlay1"  onclick="closeNav2()">
<a href="javascript:void(0)" class="closebtn" onclick="closeNav2()">&times;</a>
 
  <div class="overlay-content">
    <a href="http://localhost:8084/E-Learning/JSP/Dummy-UserHome-AllTransactions.jsp">All Transactions</a></br>
      </div>
</div>

<div id="myNav3" class="overlay1"  onclick="closeNav3()">
<a href="javascript:void(0)" class="closebtn" onclick="closeNav3()">&times;</a>

  <div class="overlay-content">
     <a href="http://localhost:8084/E-Learning/JSP/Dummy-UserHome-AvailableServices.jsp">Available Services</a>
     <a href="#">Avail Service</a>
      </div>
</div>


<div align="right">
<u><h1  align="center"style=";color:black; font-size: 48px;">Welcome User</h1></u>
<a href="http://localhost:8084/E-Learning/JSP/Login1.jsp"><button  class="w3-btn w3- w3-xlarge">Log Out <i class="fa fa-sign-out"></i></button></a>
</div>

<span style="font-style:inherit; font-size:40px;color:black; cursor:pointer" onclick="openNav()">&#9776; Menu</span>
<script>
function openNav() {
  document.getElementById("myNav").style.width = "30%";
}
function openNav1() {
  document.getElementById("myNav1").style.width = "30%";
}

function openNav2() {
	  document.getElementById("myNav2").style.width = "30%";
	}
function openNav3() {
	  document.getElementById("myNav3").style.width = "30%";
	}

function closeNav() {
  document.getElementById("myNav").style.width = "0%";
}
function closeNav1() {
	  document.getElementById("myNav1").style.width = "0%";
	  
	  }
	  
function closeNav2() {
	  document.getElementById("myNav2").style.width = "0%";
	  
	  }
function closeNav3() {
	  document.getElementById("myNav3").style.width = "0%";
	  
	  }
</script>

</body>
</html>