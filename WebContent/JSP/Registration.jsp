<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<title>Insert title here</title>
</head>
<script src="../JavaScript/Registration.js"></script>
<style>

body {
  background: #C5E1A5;
}
form {
  width: 60%;
  margin: 60px auto;
  background: #efefef;
  padding: 60px 120px 80px 120px;
  text-align: center;
  -webkit-box-shadow: 2px 2px 3px rgba(0,0,0,0.1);
  box-shadow: 2px 2px 3px rgba(0,0,0,0.1);
}
label {
  display: block;
  position: relative;
  margin: 40px 0px;
}
.label-txt {
  position:absolute;
  top: -1.6em;
  padding: 10px;
  font-family: sans-serif;
  font-size: .8em;
  letter-spacing: 1px;
  color: rgb(120,120,120);
  transition: ease .3s;
}
.input {
  width: 100%;
  padding: 10px;
  background: transparent;
  border: none;
  outline: none;
}
.input1{
  width: 30%;
  padding: 4px;
  background: transparent;
  border: none;
  outline: none;
}
.line-box {
  position: relative;
  width: 100%;
  height: 2px;
  background: #BCBCBC;
}
.line-box1 {
  position: relative;
  width: 50%;
  height: 2px;
  background: #BCBCBC;
}
.line-box2{
  position: relative;
  width: 70%;
  height: 2px;
  background: #BCBCBC;
}
.line {
  position: absolute;
  width: 0%;
  height: 2px;
  top: 0px;
  left: 50%;
  transform: translateX(-50%);
  background: #8BC34A;
  transition: ease .6s;
}

.input:focus + .line-box .line {
  width: 100%;
}

.label-active {
  
top: -3em;

}


button 
{
  
display: inline-block;
 
 padding: 12px 24px;
  background: rgb(220,220,220);
 
 font-weight: bold;
  
color: rgb(120,120,120);
  
border: none;
  
outline: none;

  border-radius: 3px;
 
 cursor: pointer;
  transition: ease .3s;

}


button:hover 
{
  
background: #8BC34A;

  color: #ffffff;

}





.column {
  float: left;
  width: 50%;
  padding: -50px;
  height: 100px;
}


.row:after {
  content: "";
  display: table;
  clear: both;
}

* {
  box-sizing: border-box;
}
  
</style>
<body>
<form>
<h1 style="background-color:threedlightshadow; ;font-size: x-large;font-family: cursive;">REGISTRATION FORM</h1>

</br>
  <label>
    <p class="label-txt">ENTER YOUR NAME</p>
    <input type="text" class="input" pattern=".{4,}" required>
    <div class="line-box">
      <div class="line"></div>
    </div>
  </label>
  <label>
    <p class="label-txt">ENTER YOUR PASSWORD</p>
    <input type="text" class="input" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" required>
    <div class="line-box">
      <div class="line"></div>
    </div>
  </label>
  <label>
    <p class="label-txt">ADDRESS LINE 1</p>
    <input type="text" class="input" required>
    <div class="line-box">
      <div class="line"></div>
    </div>
  </label>
   <label>
    <p class="label-txt">ADDRESS LINE 2</p>
    <input type="text" class="input" required>
    <div class="line-box">
      <div class="line"></div>
    </div>
  </label>
  

  <div>
    
 
   <div class="row">
    
   
  <div class="column" >
    <label>
    <p class="label-txt">AGE</p>
    <input type="number" name="age" required>
    
      <div class="line"></div>
   
     </label>
 </div>
 
  
    
  
  <div class="column">
   <label>
   <p class="label-txt">GENDER</p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <select name="gender">
  <option value="male">Male</option>
   <option value="male">Female</option>
  </select>
   <div class="line"></div>
    
   </label>
   </div>
 
  
 </div> 
 </div>
 
  <label>
    <p class="label-txt">CONTACT NUMBER</p>
    <input type="text" class="input" required width="20%">
    <div class="line-box1">
      <div class="line"></div>
    </div>
  </label>
 


<div>
    
 
   <div class="row">
    
   
  <div class="column" >
    <label>
    <p class="label-txt">STATE</p>
    <input type="text" class="input" required>
    <div class="line-box2">
      <div class="line"></div>
    </div>
  </label>
 </div>
 
  <div class="column" >
    <label>
    <p class="label-txt">COUNTRY</p>
    <input type="text" class="input" required>
    <div class="line-box2">
      <div class="line"></div>
    </div>
  </label>
 </div>
    
  </div>
   </div>
   
  <div>
    
 
   <div class="row">
     
 <div class="column" >
   <label>
    <p class="label-txt">CITY</p>
    <input type="text" class="input" required>
    <div class="line-box2">
      <div class="line"></div>
    </div>
  </label>
 </div>
  <div class="column" >
   <label>
    <p class="label-txt">PINCODE</p>
    <input type="text" class="input" required>
    <div class="line-box2">
      <div class="line"></div>
    </div>
  </label>
 </div>
   </div>
   </div>
 
 
  <label>
   <p class="label-txt">ROLE</p>
  <select name="role">
  <option value="1">1-USER</option>
   <option value="2">2-VENDOR</option>
  </select>
   <div class="line"></div>
    
   </label>
</br>
</br>
 <button type="submit">Submit</button>
</form>



</body>
</html>