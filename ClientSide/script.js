    function validateForm() {
    // Reset errors
    document.getElementById("nameError").innerHTML = "";
    document.getElementById("emailError").innerHTML = "";
    document.getElementById("mobileError").innerHTML = "";
    document.getElementById("passwordError").innerHTML = "";
    document.getElementById("confirmPasswordError").innerHTML = "";
  
    // Get form values
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var mobile = document.getElementById("mobile").value;
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
  
    // Validate name
    if (name === "") {
      document.getElementById("nameError").innerHTML = "Name is required.";
    }
  
    // Validate email
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
      document.getElementById("emailError").innerHTML = "Invalid email format.";
    }
  
    // Validate mobile
    var mobileRegex = /^\d{10}$/;
    if (!mobileRegex.test(mobile)) {
      document.getElementById("mobileError").innerHTML = "Invalid mobile number.";
    }
  
    // Validate password
    if (password.length < 6) {
      document.getElementById("passwordError").innerHTML = "Password must be at least 6 characters.";
    }
  
    // Validate confirm password
    if (confirmPassword !== password) {
      document.getElementById("confirmPasswordError").innerHTML = "Passwords do not match.";
    }
  
    // Check if there are any errors
    if (
      document.getElementById("nameError").innerHTML === "" &&
      document.getElementById("emailError").innerHTML === "" &&
      document.getElementById("mobileError").innerHTML === "" &&
      document.getElementById("passwordError").innerHTML === "" &&
      document.getElementById("confirmPasswordError").innerHTML === ""
    ) {
      // No errors, reset the form
      document.getElementById("myForm").reset();
    }
  }
  
  