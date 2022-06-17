function mostrarPregunta(id_asignatura) {
	fetch('/' + id_asignatura + '/pregunta', {
		headers: {
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
		.then(res => res.json())
		.then(data => {

		})
}