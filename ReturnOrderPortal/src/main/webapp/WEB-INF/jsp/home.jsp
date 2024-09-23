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
<script type="text/javascript">
	function checkHighPriority(that) {
		if (that.value == "integral") {

			document.getElementById("ifYes").style.display = "block";
		} else {
			document.getElementById("ifYes").style.display = "none";
		}
	}
</script>
</head>
<style>
.text-secondary {
	text-align: center;
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

.d-flex {
	background-image:
		url('https://insideretail.asia/wp-content/uploads/2020/09/Parcel-online-delvery-1.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}

.register-right {
	background: #f8f9fa;
	border-top-left-radius: 10% 10%;
	border-bottom-left-radius: 10% 10%;
	border-top-right-radius: 10% 10%;
	border-bottom-right-radius: 10% 10%;
}

img {
	height: 150px;
	width: 150px;
	display: block;
	margin-left: auto;
	margin-right: auto;
}

@
-webkit-keyframes mover { 0% {
	transform: translateY(0);
}

100


%
{
transform


:


translateY
(


-20px


)
;


}
}
@
keyframes mover { 0% {
	transform: translateY(0);
}

100


%
{
transform


:


translateY
(


-20px


)
;


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

.logo {
	height: 150px;
	weight: 300px;
	display: block;
	margin-left: 50px;
}

.caption-replace {
	margin-left: -20px;
	color: grey;
}

.caption-repair {
	margin-left: -30px;
	color: grey;
}

.main-icon {
	-webkit-animation: mover 2s infinite alternate;
	animation: mover 1s infinite alternate;
}

label {
	font-weight: bold;
}
</style>
<body>
	<main class="d-flex align-items-center min-vh-100 py-3 py-md-0">
		<div class="container register">
			<img
				src="https://img.freepik.com/premium-vector/flat-illustration-vector-delivery-truck_203633-10582.jpg"
				class="main-icon" alt="" />
				

			<div class="row">
				<div class="col-md-12 register-right">
					<div class="tab-content" id="myTabContent">
						<div class="tab-pane fade show active" id="home" role="tabpanel"
							aria-labelledby="home-tab">
							<h3 class="register-heading">Order Details</h3>
							<form role="form" method="POST" action="addprocessRequest">
								<div class="row register-form">
									<div class="col-md-6">
										<img
											src="https://cdn1.iconfinder.com/data/icons/shopping-e-commerce-10/33/package_return-512.png"
											class="logo">
										<p class="caption-replace">Medicines will
											be placed!</p>
										<br> <br> <br> <br> <img
											src="https://www.pngall.com/wp-content/uploads/2/Medicine-PNG-Download-Image.png"
											class="logo">
										<p class="caption-repair">Almost All Medicines We Take Are Generic!
											</p>




									</div>
									<div class="col-md-6">
										<fieldset>

											<div class="form-group">
												<label for="username">Enter your Name</label><span> *</span>
												<input type="text" class="form-control"
													placeholder="Enter your Name" value="" name="username"
													id="username" pattern="^[a-zA-Z]*$" required/>
											</div>
											<div class="form-group">
												<label for="componentType">Select Medicines </label><span>
													*</span> <select class="form-control" name="componentType"
													id="componentType" required="required"
													onchange="checkHighPriority(this);">
													<option id="BECOSULES Z CAPSULES 1000MG" value="BECOSULES Z CAPSULES 1000MG">BECOSULES Z CAPSULES 1000MG (prize: Rs650)</option>
												
													<option id="EVION 400MG CAPSULES" value="EVION 400MG CAPSULES">EVION 400MG CAPSULES (prize: Rs790)</option>
													<option id="DOLO 650MG TAB" value="DOLO 650MG TAB" >DOLO 650MG TAB (prize: Rs400)</option>
													<option id="AZITHROMYCIN 500MG" value="AZITHROMYCIN 500MG">AZITHROMYCIN 500MG (prize: Rs850)</option>
													<option id="NEUROBION FORTE TAB" value="NEUROBION FORTE TAB">NEUROBION FORTE TAB 500MG (prize: Rs138)</option>
													<option id="BD ULTRAFINE PEN NEEDLE 32GX4 MM" value="BD ULTRAFINE PEN NEEDLE 32GX4 MM">BD ULTRAFINE PEN NEEDLE 32GX4 MM (prize: Rs720)</option>
													<option id="BENADON 40MG TAB" value="BENADON 40MG TAB">BENADON 40MG TAB (prize: Rs166)</option>
													<option id="AUTRIN CAPSULE" value="AUTRIN CAPSULE">AUTRIN CAPSULE (prize: Rs800)</option>
													<option id="LIMCEE CHEWABLE TABLETS 500 MG" value="LIMCEE CHEWABLE TABLETS 500 MG">LIMCEE CHEWABLE TABLETS 500 MG (prize: Rs960)</option>
													<option id="DIBETA SR 500MG TAB" value="DIBETA SR 500MG TAB">DIBETA SR 500MG TAB (prize: Rs480)</option>
													<option id="OKAMET 500MG TAB" value="OKAMET 500MG TAB">OKAMET 500MG TAB (prize: Rs820)</option>
													<option id="ZOFORM SR 500MG TAB" value="ZOFORM SR 500MG TAB">ZOFORM SR 500MG TAB (prize: Rs700)</option>
													<option id="CONFIRMIN 500MG TAB" value="CONFIRMIN 500MG TAB">CONFIRMIN 500MG TAB (prize: Rs900)</option>
													
												</select>
											</div>
											<div class="form-group">
												<label for="componentName">Delivery Location</label><span>
													*</span> <input type="text" class="form-control"
													name="componentName" id="componentName"
													placeholder="Enter the Product Name" pattern="^[a-zA-Z0-9]*$" required>
											</div>
											<div class="form-group">
												<label for="quantityOfDefective">Quantity</label><span>
													*</span> <input type="number" class="form-control"
													name="quantityOfDefective" id="quantityOfDefective"
													placeholder="Enter the Product's Quantity"
													required>
											</div>
											<div class="form-group">
												<label for="contactNumber">Contact Number</label><span>
													*</span> <input type="tel" class="form-control"
													placeholder="Enter your Contact Number" value=""
													name="contactNumber" id="contactNumber" pattern="^[0-9]{10}" required />
											</div>
											<div class="form-group">
												<div id="ifYes" style="display: none;">
													<label for="isPriorityRequest"> </label> <input
														type="checkbox" value="true" id="isPriorityRequest"
														name="isPriorityRequest"> <b>Is Order of High
														Priority?</b>
												</div>
											</div>
										</fieldset>

										<br>

										<button type="submit" class="btn btn-success">Proceed</button>
									</div>

								</div>
								<marquee>
									<p class="text-secondary">Priority request will require
										additional charge of INR 200.</p>
								</marquee>
							</form>

						</div>

					</div>
				</div>
			</div>
		</div>
	</main>
</body>
</html>