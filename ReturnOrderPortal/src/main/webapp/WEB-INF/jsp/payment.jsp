<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Card Details</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<style>


 
span {
	color: red;
	font-size: 20px;
}

.d-flex {
	background-image: url('https://insideretail.asia/wp-content/uploads/2020/09/Parcel-online-delvery-1.jpg');
 background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;

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



.register .register-form {
	padding: 10%;
	margin-top: 10%;
}


.register .nav-tabs .nav-link:hover {
	border: none;
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

.card-icon {

	height: 120px;
	width: 400px;

 	
		
}

img {

	height: 150px;
	width: 150px;
	display: block;
    margin-left: auto;
    margin-right: auto;
	  
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
</style>
<body>
<main class="d-flex align-items-center min-vh-100 py-3 py-md-0" >
	<div class="container register">
		<img src="https://cdn.iconscout.com/icon/premium/png-512-thumb/return-order-1560365-1321374.png" class="main-icon" alt="" />

		
		<div class="row">
			<div class="col-md-12 register-right">

				<div class="tab-content" id="myTabContent">
					<div class="tab-pane fade show active" id="home" role="tabpanel"
						aria-labelledby="home-tab">
						<h3 class="register-heading">Enter your Card Details</h3>
						<form role="form" method="POST" action="/payment">
							<div class="row register-form">
								<div class="col-md-12">
									
									<img src="https://www.kindpng.com/picc/m/35-351793_credit-or-debit-card-mastercard-logo-visa-card.png" class="card-icon" alt="" />
									
									<div class="form-group">
										
										<label for="creditCardNumber">Card Number</label><span>
											*</span> <input type="text" class="form-control"
											placeholder="Enter the Credit Card Number" type="number"
											pattern="^[0-9]{16}" class="form-control" name="creditCardNumber"
											id="creditCardNumber" value=""  max="16"
											min="16" required/>
											
									</div>
									<div class="form-group">
										<label for="name">Name on Card</label><span> *</span> <input
											type="text" name="name" class="form-control"
											placeholder="Name on the Card" pattern="^[A-Za-z]*$" required>
									</div>

									<div class="form-group">
										<label for="expDate">Expiry Date</label><span>
											*</span> <input type="text" name="exp" class="form-control"
											placeholder="MM/YY" size="5" id="exp" min="5" max="5"
											pattern="^[0-9]{2}[/][0-9]{2}" required/>
									</div>

									<div class="form-group">
										<label for="componentName">CVV</label><span> *</span> <input
											type="password" class="form-control" name="cvv"
											placeholder="&#9679;&#9679;&#9679;" size="1" min="3" max="3"
											pattern="^[0-9]{3}" required>
									</div>
									
									<br>
									<button type="submit" class="btn btn-success">Confirm
										Payment</button>

								</div>
								

							</div>

						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
</main>
</body>
</html>