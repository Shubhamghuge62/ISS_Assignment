<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Meta tags for character set, viewport, and compatibility -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign In Form</title>

    <!-- Font Icon CSS -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main CSS -->
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="alert/dist/sweetalert.css">
</head>
<body>

    <!-- Hidden input to store status from the server -->
    <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
    
    <!-- Main content wrapper -->
    <div class="main">

        <!-- Sign-in Form Section -->
        <section class="sign-in">
            <div class="container">
                <div class="signin-content">
                    <!-- Image and registration link -->
                    <div class="signin-image">
                        <figure>
                            <img src="images/signin-image.avif" alt="sign-up image">
                        </figure>
                        <a href="registration.jsp" class="signup-image-link">Create an account</a>
                    </div>

                    <!-- Sign-in Form -->
                    <div class="signin-form">
                        <h2 class="form-title">Sign in</h2>
                        <form method="post" action="login" class="register-form" id="login-form">
                            <!-- Email input -->
                            <div class="form-group">
                                <label for="username"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="username" id="username" placeholder="Email" required="required"/>
                            </div>
                            <!-- Password input -->
                            <div class="form-group">
                                <label for="password"><i class="zmdi zmdi-lock"></i></label>
                                <input type="password" name="password" id="password" placeholder="Password" required="required" />
                            </div>
                            <!-- Submit button -->
                            <div class="form-group form-button">
                                <input type="submit" name="signin" id="signin" class="form-submit" value="Log in" />
                            </div>
                        </form>
                        
                        <!-- Social login options -->
                        <div class="social-login">
                            <span class="social-label">Or login with</span>
                            <ul class="socials">
                                <li><a href="#"><i class="display-flex-center zmdi zmdi-facebook"></i></a></li>
                                <li><a href="#"><i class="display-flex-center zmdi zmdi-twitter"></i></a></li>
                                <li><a href="#"><i class="display-flex-center zmdi zmdi-google"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>

    <!-- JS Scripts -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="alert/dist/sweetalert.css">

    <!-- Script for displaying sweet alerts based on the server status -->
    <script type="text/javascript">   
        var status = document.getElementById("status").value;

        if(status == "failed" ){
            swal("Sorry", "Wrong Email or Password", "error");
        } else if(status == "InvalidEmail" ){
            swal("Sorry", "Please Enter Valid Email", "error");
        } else if(status == "InvalidPassword" ){
            swal("Sorry", "Please Enter Valid Password", "error");
        }
    </script>
</body>
</html>
