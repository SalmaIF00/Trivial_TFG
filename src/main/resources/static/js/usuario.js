//document.addEventListener("DOMContentLoaded",function(){
//	$("#registrar_usuario").click(registrar_usuario);
//});
//
//function registrar_usuario(e){
//	e.preventDefault();
//	let nom = document.getElementById("nombre").value;
//	let ape = document.getElementById("apellidos").value;
//	let user = document.getElementById("nombre_usuario").value;
//	let pwd = document.getElementById("password").value;
//	let curso = document.getElementsByName("curso");
//	
//	var curso_seleccionado;
//	for(let i=0; i<=curso.lenght;i++){
//		if(curso[i].checked){
//			curso_seleccionado = curso[i].value;
//		}
//	}
//	
//	fetch('/registrar',{
//		headers:{
//			'content-type': 'application/json'
//		},
//		method: 'POST',
//		body: JSON.stringify({
//			nombre: nom,
//			apellidos: ape,
//			nombre_usuario: user,
//			password: pwd,
//			curso: curso_seleccionado
//		})
//	})
////	.then(res => res.json())
////	.then(data => {
////		
////	})
//};