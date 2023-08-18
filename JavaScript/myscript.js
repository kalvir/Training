function myFunction() {
    document.getElementById("demo").innerHTML = "CBG training - external.";
}

function displayName() {
    var username = document.getElementById("username").value;
    document.getElementById("output").innerHTML = "Hello " + username + " welcome";
}

function validateCredentials() {
    var username = document.getElementById("username").value;
	userexist=false;
	var employees=["Sunil",Kalvir","Kamat"];
	for (var index=0;index<employees.length;i++){
	
	if (username==employees[0]){
    userexist=true;
	break;
	}
	}
	if(!userexist){
		document.getElementById("output").innerHTML = "Invalid User";
	}
}
