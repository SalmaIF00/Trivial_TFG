document.addEventListener("DOMContentLoaded", function(){
	var color_asignatura = document.getElementById("id_a").innerHTML;
	console.log(color_asignatura);
	
	if(color_asignatura == '1' || color_asignatura == '7'){
		var navbar = document.getElementById("navbar");
		var footer = document.getElementById("copyright");
		var respuesta = document.getElementById("respuesta");
		navbar.style.setProperty("background-color", "rgb(0,168,255)", "important");
		footer.style.setProperty("background-color", "rgb(0,168,255)", "important");
		respuesta.style.backgroundColor="#E69127";
	}else if(color_asignatura == '2' || color_asignatura == '8'){
		var navbar = document.getElementById("navbar");
		var footer = document.getElementById("copyright");
		var respuesta = document.getElementById("respuesta");
		navbar.style.setProperty("background-color", "rgb(255,0,104)", "important");
		footer.style.setProperty("background-color", "rgb(255,0,104)", "important");
		respuesta.style.backgroundColor="#009909";
	}else if(color_asignatura == '3' || color_asignatura == '9'){
		var navbar = document.getElementById("navbar");
		var footer = document.getElementById("copyright");
		var respuesta = document.getElementById("respuesta");
		navbar.style.setProperty("background-color", "rgb(22,198,28)", "important");
		footer.style.setProperty("background-color", "rgb(22,198,28)", "important");
		respuesta.style.backgroundColor="#E6277B";
	}else if(color_asignatura == '4' || color_asignatura == '10'){
		var navbar = document.getElementById("navbar");
		var footer = document.getElementById("copyright");
		var respuesta = document.getElementById("respuesta");
		navbar.style.setProperty("background-color", "rgb(255,239,0)", "important");
		footer.style.setProperty("background-color", "rgb(255,239,0)", "important");
		respuesta.style.backgroundColor="#6227E6";
	}else if(color_asignatura == '5' || color_asignatura == '11'){
		var navbar = document.getElementById("navbar");
		var footer = document.getElementById("copyright");
		var respuesta = document.getElementById("respuesta");
		navbar.style.setProperty("background-color", "rgb(218,0,255)", "important");
		footer.style.setProperty("background-color", "rgb(218,0,255)", "important");
		respuesta.style.backgroundColor="#8EE627";
	}else if(color_asignatura == '6' || color_asignatura == '12'){
		var navbar = document.getElementById("navbar");
		var footer = document.getElementById("copyright");
		var respuesta = document.getElementById("respuesta");
		navbar.style.setProperty("background-color", "rgb(255,166,0)", "important");
		footer.style.setProperty("background-color", "rgb(255,166,0)", "important");
		respuesta.style.backgroundColor="#277BE6";
	}else{
		console.log("ERROR");
	}
})