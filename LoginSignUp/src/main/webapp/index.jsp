<%
    // Check if the user is not logged in, redirect to the login page
    if(session.getAttribute("name")==null){
        response.sendRedirect("login.jsp");
    }
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Meta tags for character set, viewport, and compatibility -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>LoginSignup Using JSP</title>
    
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Font Awesome icons-->
    <script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js" crossorigin="anonymous"></script>
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
    
    <!-- CSS -->
    <link href="css/index-styles.css" rel="stylesheet" />
</head>

<body id="page-top">
    <!-- Navigation-->
    <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
        <div class="container">
            <!-- Navbar Toggle Button -->
            <button class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                Menu <i class="fas fa-bars"></i>
            </button>
            <!-- Navbar Links -->
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ms-auto">
                    <!-- Navigation Links -->
                    <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="#about">About</a></li>
                    <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="logout">Logout</a></li>
                    <!-- Display user's name in a highlighted background -->
                    <li class="nav-item mx-0 mx-lg-1 bg-danger"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="logout"><%=session.getAttribute("name")%></a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Masthead Section -->
    <header class="masthead bg-primary text-white text-center">
        <div class="container d-flex align-items-center flex-column">
            <!-- Welcome Image -->
            <img class="masthead-avatar mb-5" src="assets/img/welcome.png" alt="..." />
            <!-- Welcome heading -->
            <h1 class="masthead-heading text-uppercase mb-0">Welcome to Home Page</h1>

            <!-- Welcome Subheading -->
            <br> </br>
            <p class="masthead-subheading font-weight-light mb-0">Login and SignUP using JSP</p>
        </div>
    </header>

    <!-- About Section -->
    <section class="page-section bg-primary text-white mb-0" id="about">
        <div class="container">
            <!-- About Section Heading -->
            <h2 class="page-section-heading text-center text-uppercase text-white">About</h2>
   
   			<br> </br>
            <!-- About Section Content -->
            <div class="row">
                <!-- Description Column 1 -->
                <div class="col-lg-4 ms-auto">
                    <p class="lead">Created Registration and Sign In Pages using JSP and servlet.</p>
                </div>
                <!-- Description Column 2 -->
                <div class="col-lg-4 me-auto">
                    <p class="lead">Added client and server-side validations. Also, logout functionality is added.</p>
                </div>
            </div>
        </div>
    </section>
</body>

</html>
