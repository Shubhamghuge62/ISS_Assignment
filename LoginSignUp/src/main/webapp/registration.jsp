<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Meta tags for character set, viewport, and compatibility -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form </title>

    <!-- Font Icon CSS -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main CSS -->
    <link rel="stylesheet" href="css/style.css">
</head>

<body>

    <!-- Hidden input to store status from the server -->
    <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">

    <div class="main">

        <!-- Sign up form section -->
        <section class="signup">
            <div class="container">
                <div class="signup-content">
                    <div class="signup-form">
                        <!-- Form title -->
                        <h2 class="form-title">Sign up</h2>

                        <!-- Registration form -->
                        <form method="post" action="register" class="register-form" id="register-form">
                            <!-- Name input -->
                            <div class="form-group">
                                <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="name" id="name" placeholder="Your Name" required="required" />
                            </div>
                            <!-- Email input -->
                            <div class="form-group">
                                <label for="email"><i class="zmdi zmdi-email"></i></label>
                                <input type="email" name="email" id="email" placeholder="Your Email" required="required" />
                            </div>
                            <!-- Password input -->
                            <div class="form-group">
                                <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                                <input type="password" name="pass" id="pass" placeholder="Password" required="required" />
                            </div>
                            <!-- Confirm Password input -->
                            <div class="form-group">
                                <label for="re-pass"><i class="zmdi zmdi-lock"></i></label>
                                <input type="password" name="re_pass" id="re_pass" placeholder="Confirm password" required="required" />
                            </div>
                            <!-- Contact Number input -->
                            <div class="form-group">
                                <label for="contact"><i class="zmdi zmdi-phone zmdi-hc-1x"></i></label>
                                <input type="text" name="contact" id="contact" placeholder="Contact Number" required="required" />
                            </div>
                            <!-- Submit button -->
                            <div class="form-group form-button">
                                <input type="submit" name="signup" id="signup" class="form-submit" value="Register" />
                            </div>
                        </form>
                    </div>

                    <!-- Image and login link -->
                    <div class="signup-image">
                        <figure>
                            <img src="images/signup-image.jpg" alt="sign-up image">
                        </figure>
                        <a href="login.jsp" class="signup-image-link">Already an user</a>
                    </div>
                </div>
            </div>
        </section>

    </div>

    <!-- JS Scripts -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"> </script>
    <link rel="stylesheet" href="alert/dist/sweetalert.css">

    <!-- Script for displaying sweet alerts based on the server status -->
    <script type="text/javascript">
        var status = document.getElementById("status").value;
        
        // Display different alerts based on the server status
        if(status == "success") {
            swal("Congrats", "Account Created Successfully", "success");
        } else if(status == "InvalidName") {
            swal("Sorry", "Please enter a valid Username", "error");
        } else if(status == "InvalidEmail") {
            swal("Sorry", "Please enter a valid Email", "error");
        } else if(status == "InvalidPassword") {
            swal("Sorry", "Please enter a valid Password", "error");
        } else if(status == "InvalidConfirmPassword") {
            swal("Sorry", "Passwords do not match", "error");
        } else if(status == "InvalidMobile") {
            swal("Sorry", "Please enter a valid Mobile Number", "error");
        } else if(status == "InvalidMobileLength") {
            swal("Sorry", "Mobile number should be of 10 digits", "error");
        }
    </script>
</body>

</html>
