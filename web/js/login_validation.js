//Login Form Validation

function validate() {
	var username_value = document.forms["loginForm"]["username"].value;
	var password_value = document.forms["loginForm"]["password"].value;
	var flag = false;

	if(username_value == "") {
		document.getElementById("uname").style.color= rgb(200, 0, 0);
		document.getElementById("username").style.borderColor = "red";
		document.getElementById("username").style.color="red";
		document.getElementById("uname").classList.add('animated', 'shake');
		document.getElementById("username").classList.add('animated', 'shake');
		flag = false;
	}
	if(password_value == "") {
		document.getElementById("pass").style.color = "red";
		document.getElementById("password").style.borderColor = "red";
		document.getElementById("password").style.color = "red";	
		document.getElementById("pass").classList.add('animated', 'shake');
		document.getElementById("password").classList.add('animated', 'shake');
		flag = false;
	}
	return flag;
}
