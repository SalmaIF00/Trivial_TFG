document.addEventListener("DOMContentLoaded",function(){
	$("#registrar_usuario").click(registrar_usuario);
});

function registrar_usuario(){
	let nom = document.getElementById("nombre");
	let ape = document.getElementById("apellidos");
	let user = document.getElementById("nombre_usuario");
	let pwd = document.getElementById("password");
	let curso = document.getElementById("curso");
	
	for(let i=0; i<=curso.lenght;i++){
		if(curso[i].selected){
			var curso_seleccionado = curso[i];
		}
	}
	
	fetch('/registrar',{
		headers:{
			'content-type': 'application/json'
		},
		method: 'POST',
		body: JSON.stringify({
			nombre: nom,
			apellidos: ape,
			nombre_usuario: user,
			password: pwd,
			curso: curso_seleccionado
		})
	})
};