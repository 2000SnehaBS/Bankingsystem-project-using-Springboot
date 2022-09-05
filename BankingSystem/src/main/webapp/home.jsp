<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="addAccount">
	 <div class="user-details">
	 <div class="input-box">
                    <span class="details">customerId</span>
                    <input type = "text" placeholder="Enter your id" name ="customerId" required >
                </div>
                <div class="input-box">
                    <span class="details">firstName </span>
                    <input type = "text" placeholder="Enter your fname" name ="firstName" required >
                 </div>
                <div class="input-box">
                    <span class="details">userName</span>
                    <input type = "text" placeholder="Enter your uname" name ="userName" required>
                </div>
                <div class="input-box">
                    <span class="details">lastName</span>
                    <input type = "text" placeholder="Enter your lname" name ="lastName" required>
                </div>
                <div class="input-box">
                    <span class="details">age </span>
                    <input type = "number" placeholder="Enter your age" name ="age" required>
                </div>
                <div class="input-box">
                    <span class="details">address</span>
                    <input type="text" placeholder="Enter your address" name="address" required>
                </div>
                <div class="input-box">
                    <span class="details">mobileNumber</span>
                    <input type = "number" placeholder="Enter your mobileNumber" name="mobileNumber" required>
                </div>
                <div class="input-box">
                    <span class="details">emailId </span>
                    <input type = "email" placeholder="Enter your emailid" name ="emailId" required>
                </div>
                <div class="input-box">
                    <span class="details">dateofBirth</span>
                    <input type = "date" placeholder="Enter your dateofBirth" name ="dateOfBirth" required>
                </div>
            </div>
            <div class="button">
                <input type="submit">
            </div>
	</form>
</body>
</html>