function passValidation() {
	if(document.getElementById('pass1').value == document.getElementById('pass2').value && document.getElementById('pass1').value != 0) {
		document.getElementById('passMsg').style.color = 'green';
		document.getElementById('passMsg').innerHTML = 'Password Matching';
		return true;
		
	}
	else{
		document.getElementById('passMsg').style.color = 'red';
		document.getElementById('passMsg').innerHTML = 'Password NOT Matching';	
		return false;
		
	}

	
}

function message() {
	if(passValidation()){
		alert("Successfuly registered!");

		
	}
	else{
		alert("Registration falied, password not matching.");
	}
}


function hidden() {
	document.getElementById('form1').style.display = "none";
}

window.addEventListener("load",function(){
	
	var feedform = document.forms.form1;
	feedform.elements.country.onchange = c;
});


function c () {
	var ty = feedform.elements.product.selectedindex;
	switch(ty){
		case 0: alert("Thank you for choosing Brazil");
	}
}

window.addEventListener("load",function(){
	
	var feedform = document.forms.form1;

	feedform.elements.fnBox.focus();
	feedform.elements.country.onchange = teste;
	
});

function teste()
{
	
	var feedform = document.forms.form1;
	
	var country = feedform.elements.country.selectedIndex;

	
	switch(country)
	{
	case 0:alert("thank you for select Brazil");
	break;
	case 1:alert("thank you for select Canada");
	break;
	case 2:alert("thank you for select Japao");
	break;
	
	}
	
	
}