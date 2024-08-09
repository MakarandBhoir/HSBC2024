function validateForm(e) {
    e.preventDefault();
    //alert("The form was submitted");
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    let flag = true;

    if (username === "") {
        flag = false;
        document.getElementById("usernameError").innerHTML = "Username is required";
    } else {
        document.getElementById("usernameError").innerHTML = "";
    }

    if (password === "") {
        flag = false;
        document.getElementById("passwordError").innerHTML = "Password is required";
    } else {
        document.getElementById("passwordError").innerHTML = "";
    }
    if (flag) {
        //document.getElementById("result").innerHTML = "Thank you " + username + " for submitting the form";
        sessionStorage.setItem("username", username);
        document.getElementById("loginForm").submit();
    }
}