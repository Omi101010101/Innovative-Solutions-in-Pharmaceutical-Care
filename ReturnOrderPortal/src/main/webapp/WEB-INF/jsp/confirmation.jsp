page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<style>

a {
	-webkit-text-size-adjust: 100%;
	-ms-text-size-adjust: 100%;
}

table, td {
	mso-table-lspace: 0pt;
	mso-table-rspace: 0pt;
	-webkit-text-size-adjust: 100%;
	-ms-text-size-adjust: 100%;
}

img {
	-ms-interpolation-mode: bicubic;
}

img {
	border: 0;
	height: auto;
	line-height: 100%;
	outline: none;
	text-decoration: none;
}

table {
	border-collapse: collapse !important;
	
}

body {
	background-image: url('https://insideretail.asia/wp-content/uploads/2020/09/Parcel-online-delvery-1.jpg');
 background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;

}



div[style*="margin: 16px 0;"] {
	margin: 0 !important;
}
.text-secondary{
	text-align: right;
}
span {
	color: red;
	font-size: 20px;
}

.register {
	background: #f8f9fa;
	margin-top: 2%;
	padding: 3%;
	margin-bottom: 3%;
	border-top-left-radius: 10% 10%;
	border-bottom-left-radius: 10% 10%;
	border-top-right-radius: 10% 10%;
	border-bottom-right-radius: 10% 10%;
}



.register-right {
	background: #f8f9fa;
	border-top-left-radius: 10% 10%;
	border-bottom-left-radius: 10% 10%;
	border-top-right-radius: 10% 10%;
	border-bottom-right-radius: 10% 10%;
}



@-webkit-keyframes mover
 { 
    0% {
	transform: translateY(0);
    }
    100%
    {
    transform:translateY(-20px);
    }
}
@keyframes mover { 
    0% {
	transform: translateY(0);
    }
    100%
    {
    transform:translateY(-20px);
    }
}


.register .register-form {
	padding: 10%;
	margin-top: 10%;
}

.btnRegister {
	float: right;
	margin-top: 10%;
	border: none;
	border-radius: 1.5rem;
	padding: 2%;
	background: #0062cc;
	color: #fff;
	font-weight: 600;
	width: 50%;
	cursor: pointer;
}

.register .nav-tabs {
	margin-top: 3%;
	border: none;
	background: #0062cc;
	border-radius: 1.5rem;
	width: 28%;
	float: right;
}

.register .nav-tabs .nav-link {
	padding: 2%;
	height: 34px;
	font-weight: 600;
	color: #fff;
	border-top-right-radius: 1.5rem;
	border-bottom-right-radius: 1.5rem;
}

.register .nav-tabs .nav-link:hover {
	border: none;
}

.register .nav-tabs .nav-link.active {
	width: 100px;
	color: #0062cc;
	border: 2px solid #0062cc;
	border-top-left-radius: 1.5rem;
	border-bottom-left-radius: 1.5rem;
}

.register-heading {
	text-align: center;
	margin-top: 3%;
	margin-bottom: -15%;
	color: #495057;
}

label {
	font-weight: bold;
}
</style>
<body>

	<div class="container register">
		
			<!-- <div class="col-md-3 register-left">
				<img src="https://image.flaticon.com/icons/png/512/1440/1440524.png" alt="" width="62.5" height="60"/>
				<h3>Return Order Portal</h3>
				<p>We will deliver your product as fast as possible.</p>
				
			</div> -->
		<div class="row">
 			<div class="col-md-12 register-right">

				<div class="tab-content" id="myTabContent">
							
						
					
							<table align="center" border="0" cellpadding="0" cellspacing="0"
								width="100%" style="max-width: 600px;">
								<tr>
									<td align="center"
										style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding-top: 25px;">
										<br>
										<h1
											style="font-size: 50px; font-weight: 800; line-height: 46px; color: #333333; margin: 0; color:green;">
											PAYMENT SUCCESSFUL!</h1>
									</td>
								</tr>
								<tr>
									
									<td>
									<br>
									<br>
										<p style="font-size:20px;color:#5C5C5C;">Request ID: ${requestId}</p>
									</td>
								</tr>
								<tr>
									<td align="left"
										style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding-top: 10px;">
										<p
											style="font-size: 16px; font-weight: 400; line-height: 24px; color: #777777;">
					
											
									</td>
								</tr>
								<tr>
									<td><h5>Dear, ${username}</h5>
        							<p style="font-size:20px;color:#5C5C5C;">Your payment of Rs.${charge} was successful, and your order is confirmed! </p>
        							
									</td>
								</tr>
								
								<tr>
									<td>
									<br>
									<br>
										<marquee><p style="font-size:15px;color:#5C5C5C;">For any further queries contact +918605377123, Thank you for using our service!!</p></marquee>
									</td>
								</tr>
										
							</table>
						


				
					</div>

				</div>
				</div>
				</div>
				</main>
</body>
</html>