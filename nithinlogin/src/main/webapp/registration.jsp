<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="regstyle.css">
</head>
<body>


<form action="nithinregistration " method="post">
        <div class="content">
            <h1>Web Design & <br><span>Development</span> <br>Course</h1>
            <p class="par">Enjoy your day at this moment<br> 
                Thank you for visiting this website <br>This is a basic web Design 
                <br>If you want full vedio you can visit
            <br>My cahnnel nithineternal</p>

            <button class="cn"><a href="#">JOIN US</a></button>
            <div class="form">
                
                <input type="text" name="name" id="name" placeholder="Your Name" />
              
                <input type="email" id="Email" name="Email" placeholder="Enter your email"/>
                
                <input type="password" id="pass" name="pass" placeholder="Enter your Password"/>
                
                <input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password" />
									
				<input type="text" name="contact" id="contact"
									placeholder="Contact no" />
									
                <button type="submit" class="btnn">Register</button><br>

               
               
                
                <a href="login.jsp">Already have an account</a>
               

               
            </div>

        </div>
        <script src="vendor/jquery/jruery.min.js"></script>
        <script src= "js/main.js"></script>
        <script src="https:unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <link rel="stylesheet" href="alert/dist/sweetalert.css">


</body>
</html>