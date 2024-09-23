<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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

body, table, td, a {
	-webkit-text-size-adjust: 100%;
	-ms-text-size-adjust: 100%;
}

table, td {
	mso-table-lspace: 0pt;
	mso-table-rspace: 0pt;
}


img {

	height: 150px;
	width: 150px;
	display: block;
    margin-left: auto;
    margin-right: auto;
	  
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
/* body {
	height: 100% !important;
	margin: 0 !important;
	padding: 0 !important;
	width: 100% !important;
}
 */

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

.btn .btn-success {
	display: flex;
	justify-content: center;

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

.main-icon {
	-webkit-animation: mover 2s infinite alternate;
	animation: mover 1s infinite alternate;
}

.btn-success {
	margin: 0; 
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}


</style>
<body>

	<div class="container register">
			<img src="https://cdn.iconscout.com/icon/premium/png-512-thumb/return-order-1560365-1321374.png" class="main-icon" alt="" />
			
		<div class="row">
			<div class="col-md-12 register-right">

				<div class="tab-content" id="myTabContent">
							
						
					
							<table align="center" border="0" cellpadding="0" cellspacing="0"
								width="100%" style="max-width: 600px;">
								<tr>
									<td align="center"
										style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding-top: 25px;">
										
										<h2
											style="font-size: 30px; font-weight: 800; line-height: 36px; color: #333333; margin: 0;">
											Confirm the Medicines to be Order</h2>
									</td>
								</tr>
								<tr>
									<td align="left"
										style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding-top: 10px;">
										<p
											style="font-size: 16px; font-weight: 400; line-height: 24px; color: #777777;">
											<center>Please check the details of the product</center></p>
									</td>
								</tr>
								<tr>
									<td align="left" style="padding-top: 20px;">
										<table cellspacing="0" cellpadding="0" border="0" width="100%">
											<tr>
												<td width="75%" align="left" bgcolor="#eeeeee"
													style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 800; line-height: 24px; padding: 10px;">
													Order Request ID</td>
												<td width="25%" align="left" bgcolor="#eeeeee"
													style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 800; line-height: 24px; padding: 10px;">
													${requestId}</td>
											</tr>
											<tr>
												<td width="75%" align="left"
													style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding: 15px 10px 5px 10px;">Token
													ID</td>
												<td width="25%" align="left"
													style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding: 15px 10px 5px 10px;">
													${userID}</td>
											</tr>
											<tr>
												<td width="75%" align="left"
													style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding: 5px 10px;">
													Packaging and Delivery Charge</td>
												<td width="25%" align="left"
													style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding: 5px 10px;">
													${packagingAndDeliveryCharge}</td>
											</tr>
											<tr>
												<td width="75%" align="left"
													style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding: 5px 10px;">
													Price</td>
												<td width="25%" align="left"
													style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px; padding: 5px 10px;">
													${processingCharge}</td>
											</tr>

										</table>
									</td>
								</tr>

								<tr>
									<td align="left" style="padding-top: 20px;">
										<table cellspacing="0" cellpadding="0" border="0" width="100%">
											<tr>
												<td width="75%" align="left"
													style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 800; line-height: 24px; padding: 10px; border-top: 3px solid #eeeeee; border-bottom: 3px solid #eeeeee;">
													Total bill Amount</td>
												<td width="25%" align="left"
													style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 800; line-height: 24px; padding: 10px; border-top: 3px solid #eeeeee; border-bottom: 3px solid #eeeeee;">
													${processingCharge + packagingAndDeliveryCharge}</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td height="100%" valign="top" width="100%"
							style="padding: 0 35px 35px 35px; background-color: #ffffff;"
							bgcolor="#ffffff">
							<table border="0" cellpadding="0" cellspacing="0"
								width="100%" style="max-width: 660px;">
								<tr>
									<td align="center" valign="top" style="font-size: 0;">
										<div
											style="display: inline-block; max-width: 50%; min-width: 240px; vertical-align: top; width: 100%;">
											<table align="left" border="0" cellpadding="0"
												cellspacing="0" width="100%" style="max-width: 300px;">
												<tr><p></p></tr>
												<tr>
													<td align="left" valign="top"
														style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 800; line-height: 24px;">
														Estimated Date</td>
													<td align="left" valign="top"
														style="font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 16px; font-weight: 400; line-height: 24px;">
														${dateOfDelivery}</td>
												</tr>
											</table>
										</div>
										<div>
											<br>
											<br><br><br>
									
											<a href="/cardDetails" class="btn btn-success" style="margin-top: 50px;">Proceed to
												Payment</a>
											<p></p>
										</div>
										
									</td>
								</tr>
							</table>
						</td>
					</tr>


				
					</div>

				</div>
	</div>
	</div>

</body>
</html>