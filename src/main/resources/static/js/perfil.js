///////////////////////////////////////////////////////////
////////////////////GRAPHIC CHART//////////////////////////

// Load the Visualization API and the corechart package.
google.charts.load('current', { 'packages': ['corechart'] });

// Set a callback to run when the Google Visualization API is loaded.
google.charts.setOnLoadCallback(drawPerfilChart);
google.charts.setOnLoadCallback(drawPerfilDataTable);

var arrRandom = [];

function createDate() {
	for (var i = 0; i <= 20; i++) {
		var random = Math.floor(Math.random() * 10 + 1);
		arrRandom.push(random);
	}
	console.log(arrRandom);
	return arrRandom;

}
function drawPerfilChart() {
	var token = $("meta[name='_csrf']").attr("content");

	fetch('/resultados_perfil',
		{
			headers: {
				"Content-Type": "application/json; charset=utf-8",
				"X-CSRF-TOKEN": token
			},
		})
		.then(res => res.json())
		.then(resultados => {
			var asig_1 = 0;
			var asig_2 = 0;
			var asig_3 = 0;
			var asig_4 = 0;
			for (let i = 0; i <= resultados.length; i++) {
				switch (i) {
					case 0:
						asig_1 += 1;
						break;
					case 1:
						asig_2 += 1;
						break;
					case 2:
						asig_3 += 1;
						break;
					default:
						asig_4 += 1;
						break;
				}
			}

			var final_data = google.visualization.arrayToDataTable([
				['Asignatura', 'Test'],
				['asignatura_1', parseInt(asig_1)],
				['asignatura_2', parseInt(asig_2)],
				['asignatura_3', parseInt(asig_3)],
				['asignatura_4', parseInt(asig_4)],
			]);

			var options = {
				width: 500,
				height: 500
			};

			var chart = new google.visualization.PieChart(document.getElementById('graphic_profile_chart'));

			chart.draw(final_data, options);

		})

}

///////////////////////////////////////////////////////////
///////////////////////DATA TABLE//////////////////////////

function drawPerfilDataTable() {
	var token = $("meta[name='_csrf']").attr("content");

	fetch('/resultados_perfil',
		{
			headers: {
				"Content-Type": "application/json; charset=utf-8",
				"X-CSRF-TOKEN": token
			},
		})
		.then(res => res.json())
		.then(resultados => {
			var table = document.getElementById('data_profile_table');
			console.log(resultados);
			for (let i = 0; i <= resultados.length-1; i++) {
				// Creando los 'td' que almacenará cada parte de la información del usuario actual
				let name = `<td>Usuario</td>`;
				let a = `<td>Asignatura</td>`;
				let r = `<td>${resultados[i].resultado}</td>`;

				table.innerHTML += `<tr>${name}${a}${r}</tr>`;
			}
		})
}

///////////////////////////////////////////////////////////
////////////////////CAMBIOS//////////////////////////
function tabla() {
	var tabla = document.getElementById("tabla");
	tabla.removeAttribute("style");

	var donut = document.getElementById("donut");
	donut.setAttribute("style", "display:none");
}

function grafico() {
	var donut = document.getElementById("donut");
	donut.removeAttribute("style");

	var tabla = document.getElementById("tabla");
	tabla.setAttribute("style", "display:none");
}
