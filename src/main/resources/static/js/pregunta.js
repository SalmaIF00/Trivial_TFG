document.addEventListener("DOMContentLoaded", function(){
	var color_asignatura = document.getElementById("id_a");
	console.log(color_asignatura);
	
	if(color_asignatura == '1' || color_asignatura == '7'){
		var navbar = document.getElementById("navbar");
		navbar.style.backgroundColor = "blue !important";
	}
})