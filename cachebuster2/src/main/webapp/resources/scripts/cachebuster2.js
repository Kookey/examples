/**
 * Copyright &copy; Sunit Katkar http://sunitkatkar.blogspot.com/
 */
function initializeUI(){
	handleEvent_BtnWelcome(); 
}

function handleEvent_BtnWelcome() {
	$("#btnWelcome").on('click', function(){
		alert("Welcome to Spring MVC static resource versioning");
	});
}

$(document).ready(function() {
	initializeUI();
});