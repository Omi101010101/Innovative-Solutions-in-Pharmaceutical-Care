<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Login</title>
  <link href="https://fonts.googleapis.com/css?family=Karla:400,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.materialdesignicons.com/4.8.95/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"> 
</head>
<style>

body {
 <!-- font-family: "Karla", sans-serif;-->
 font-family: Georgia, serif;
background : -webkit-linear-gradient(top, #970323, #ee081b); 
 min-height: 100vh; 
  /* background-image: url('https://insideretail.asia/wp-content/uploads/2020/09/Parcel-online-delvery-1.jpg');
 background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover; */
  
}

.brand-wrapper {
  margin-bottom: 19px;
  text-align: center;
}
 
.brand-wrapper .logo {
    height: 190px; 
    weight: 190px; 
}

.login-card {
  border: 0;
  border-radius: 27.5px;
  box-shadow: 0 10px 30px 0 rgba(172, 168, 168, 0.43);
  overflow: hidden; 
}

.login-card-img {
    border-radius: 0;
    position: absolute;
    width: 100%;
    height: 100%;
    -o-object-fit: cover;
    object-fit: cover; 
}

.login-card .card-body {
    padding: 85px 60px 60px; 
}

@media (max-width: 422px) {
  .login-card .card-body {
  	padding: 35px 24px; 
  } 
}

.login-card-description {
    font-size: 25px;
    color: #000;
    font-weight: normal;
    margin-bottom: 23px;
    text-align: center;
}

.login-card form {
    max-width: 326px; 
 
    width: 300px;
    margin: 0 auto;

}


.login-card .form-control {
    border: 1px solid #d5dae2;
    padding: 15px 25px;
    margin-bottom: 20px;
    min-height: 45px;
    font-size: 13px;
    line-height: 15;
    font-weight: normal;
  
}

.login-card .form-control::-webkit-input-placeholder {
      color: #919aa3; 
}

.login-card .form-control::-moz-placeholder {
  color: #919aa3; 
}

.login-card .form-control:-ms-input-placeholder {
  color: #919aa3; 
}

.login-card .form-control::-ms-input-placeholder {
  color: #919aa3; 
}

.login-card .form-control::placeholder {
  color: #919aa3; 
}

.login-card .login-btn {
  padding: 13px 20px 12px;
  background-color: #000;
  border-radius: 4px;
  font-size: 17px;
  font-weight: bold;
  line-height: 20px;
  color: #fff;
  margin-bottom: 24px; 
}

.login-card .login-btn:hover {
   border: 1px solid #000;
   background-color: transparent;
   color: #000; 
}

.login-card .forgot-password-link {
  font-size: 14px;
  color: #919aa3;
  margin-bottom: 12px; 
}

.login-card-footer-text {
  font-size: 16px;
  color: #0d2366;
  margin-bottom: 60px; 
}

@media (max-width: 767px) {
  .login-card-footer-text {
    margin-bottom: 24px; 
  } 
}

.login-card-footer-nav a {
  font-size: 14px;
  color: #919aa3; 
 	
}

.card-body {
	text-align: center;
}

.d-flex {
	background-image: url('https://insideretail.asia/wp-content/uploads/2020/09/Parcel-online-delvery-1.jpg');
 background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;

}
/*# sourceMappingURL=login.css.map */
	
</style>
<body>
  <main class="d-flex align-items-center min-vh-100 py-3 py-md-0" ><!-- style="background-image: url('https://insideretail.asia/wp-content/uploads/2020/09/Parcel-online-delvery-1.jpg')" -->
    <div class="container" >
    
      <div class="card login-card">
        <div class="row no-gutters">

          
            <div class="card-body">
              <div class="brand-wrapper">
                 <img src="https://i.fbcd.co/products/original/4d6f35afea8f293f9ac1576798aacca5b699e3d5023f0212e7efcbdae9bfbfb2.jpg" 
                 class="logo">
              	<h1> Innovative Solutions in Pharmaceutical care</h1>
              </div>
              <p class="login-card-description">Customer Sign In</p>
              <form action="login" method='POST'>
                 
                    <label for="username" class="sr-only">Username</label>
                    <input type="text" name="username" id="username" class="form-control" placeholder="Enter username" pattern="^[a-zA-Z]*$" required>
                 
                    <label for="password" class="sr-only">Password</label>
                    <input type="password" name="password" id="password" class="form-control" placeholder="Enter password" required>
             		
                  <button type="submit" name="submit" value="submit"
						class="btn btn-block login-btn mb-4">Login</button>
						<div class="text-danger"><strong>${invalidLogin}</strong></div>
              </form>
               <nav class="login-card-footer-nav">
                 <a href="#!">By continuing, you agree that you have read and accept our Terms and Conditions and Privacy Policy.</a>
                
                 
               </nav>
            </div>
         
          
        </div>
      </div>
      </div>
  </main>
  <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>
